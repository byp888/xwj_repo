package com.test.elasticsearch;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.elasticsearch.client.Client;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.junit.After;
import org.junit.Before;

/**
 * 抽象的Junit测试
 * 
 * @time 2018年3月2日09:37:17
 *
 */
public abstract class AbstractJunitTest {
	protected Logger logger = LogManager.getLogger(this.getClass());
	protected Client client;

	/**
	 * 获取一个客户端
	 * 
	 * @return
	 * @throws UnknownHostException
	 */

	@SuppressWarnings("resource")
	@Before
	public void getClient() throws UnknownHostException {
		Settings settings = Settings.builder().put("cluster.name", "xwj").build();

		TransportAddress transportAddress = new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"),
				9300);
		client = new PreBuiltTransportClient(settings).addTransportAddress(transportAddress);
	}

	@After
	public void close() {
		client.close();
	}
}
