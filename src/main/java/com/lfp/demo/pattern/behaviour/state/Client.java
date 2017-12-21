package com.lfp.demo.pattern.behaviour.state;

/**
 * Title: 状态模式演示
 * Description: 演示状态模式的使用，将状态管理抽象出来，在Context中管理，状态实例处理自身状态的行为。
 *              用于行为和状态相互制约的情况下，状态管理专门管理状态变化，不处理行为，各状态实例处理行为，不关系状态的变化。
 * Project: lfp-pattern
 * Date: 2017-12-21
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {

        VoteManager vm = new VoteManager();
        for(int i=0;i<10;i++){
            vm.vote("lfp","C");
        }
    }

}
