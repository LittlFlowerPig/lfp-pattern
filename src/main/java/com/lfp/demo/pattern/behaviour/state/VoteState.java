package com.lfp.demo.pattern.behaviour.state;

/**
 * Title:
 * Description:
 * Project: lfp-pattern
 * Date: 2017-12-21
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public interface VoteState {

    void vote(String user, String voteItem, VoteManager voteManager);

}
