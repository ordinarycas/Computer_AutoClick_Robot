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
public class ClientEvent {
    private Client client;
    public ClientEvent(Client client) {
        this.client = client;
    }
    
    public String getName() {
        return client.name;
    }
    
    public String getIp() {
        return client.ip;
    }
}