/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc.openhome;

/**
 *
 * @author Family
 */
public class MultiChat {
    public static void main(String[] args) {
        Client c1 = new Client("127.0.0.1", "Caterpillar");
        Client c2 = new Client("192.168.0.2", "Justin");

        ClientQueue queue = new ClientQueue();

        queue.addClientListener(new ClientListener() {
            @Override
            public void clientAdded(ClientEvent event) {
                System.out.printf("%s 從 %s 連線%n",
                        event.getName(), event.getIp());
            }

            @Override
            public void clientRemoved(ClientEvent event) {
                System.out.printf("%s 從 %s 離線%n", 
                        event.getName(), event.getIp());
            }
        });
        
        queue.add(c1);
        queue.add(c2);

        queue.remove(c1);
        queue.remove(c2);
    }
}