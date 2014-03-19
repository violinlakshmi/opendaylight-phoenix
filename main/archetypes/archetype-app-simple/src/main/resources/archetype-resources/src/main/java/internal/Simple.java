#set( $symbol_pound = '#' )

package ${package}.internal;

import ${package}.ISimple;
import ${package}.SimpleData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.concurrent.ConcurrentHashMap;
import java.util.UUID;
import java.util.Map;
import org.opendaylight.controller.sal.utils.Status;
import org.opendaylight.controller.sal.utils.StatusCode;

public class Simple implements ISimple {
    private Map<UUID, SimpleData> data;
    protected static final Logger log = LoggerFactory.getLogger(Simple.class);
	@Override
    public UUID createData(SimpleData datum) {
        UUID uuid = UUID.randomUUID();
        data.put(uuid, datum);
        return uuid;
    }
	@Override
    public SimpleData readData(UUID uuid) {
        return data.get(uuid);
    }
	@Override
    public Map<UUID, SimpleData> readData() {
        return data;
    }
	@Override
    public Status updateData(UUID uuid, SimpleData datum) {
        data.put(uuid, datum);
        return new Status(StatusCode.SUCCESS);
    }
	@Override
    public Status deleteData(UUID uuid) {
        data.remove(uuid);
        return new Status(StatusCode.SUCCESS);
    }
    void init() {
        log.info("Initializing Simple application");
        data = new ConcurrentHashMap<UUID, SimpleData>();
    }
    void start() {
        log.info("Simple application starting");
    }

    void stop() {
        log.info("Simple application stopping");
    }
}
