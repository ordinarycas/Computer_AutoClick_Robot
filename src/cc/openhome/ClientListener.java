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
public interface ClientListener {
    void clientAdded(ClientEvent event);    // 新增Client會呼叫這個方法
    void clientRemoved(ClientEvent event); // 移除Client會呼叫這個方法
}