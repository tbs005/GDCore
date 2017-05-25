/*
 * This file is generated by jOOQ.
*/
package org.graviton.database.jooq.login.tables.records;


import javax.annotation.Generated;

import org.graviton.database.jooq.login.tables.Accounts;
import org.jooq.Field;
import org.jooq.Record17;
import org.jooq.Record3;
import org.jooq.Row17;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AccountsRecord extends UpdatableRecordImpl<AccountsRecord> implements Record17<Integer, String, String, String, String, String, Byte, Byte, Byte, Integer, String, String, String, Byte, String, String, String> {

    private static final long serialVersionUID = -1710448642;

    /**
     * Setter for <code>login.accounts.id</code>.
     */
    public AccountsRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>login.accounts.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>login.accounts.name</code>.
     */
    public AccountsRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>login.accounts.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>login.accounts.password</code>.
     */
    public AccountsRecord setPassword(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>login.accounts.password</code>.
     */
    public String getPassword() {
        return (String) get(2);
    }

    /**
     * Setter for <code>login.accounts.nickname</code>.
     */
    public AccountsRecord setNickname(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>login.accounts.nickname</code>.
     */
    public String getNickname() {
        return (String) get(3);
    }

    /**
     * Setter for <code>login.accounts.question</code>.
     */
    public AccountsRecord setQuestion(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>login.accounts.question</code>.
     */
    public String getQuestion() {
        return (String) get(4);
    }

    /**
     * Setter for <code>login.accounts.answer</code>.
     */
    public AccountsRecord setAnswer(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>login.accounts.answer</code>.
     */
    public String getAnswer() {
        return (String) get(5);
    }

    /**
     * Setter for <code>login.accounts.rights</code>.
     */
    public AccountsRecord setRights(Byte value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>login.accounts.rights</code>.
     */
    public Byte getRights() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>login.accounts.banned</code>.
     */
    public AccountsRecord setBanned(Byte value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>login.accounts.banned</code>.
     */
    public Byte getBanned() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>login.accounts.muted</code>.
     */
    public AccountsRecord setMuted(Byte value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>login.accounts.muted</code>.
     */
    public Byte getMuted() {
        return (Byte) get(8);
    }

    /**
     * Setter for <code>login.accounts.points</code>.
     */
    public AccountsRecord setPoints(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>login.accounts.points</code>.
     */
    public Integer getPoints() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>login.accounts.channels</code>.
     */
    public AccountsRecord setChannels(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>login.accounts.channels</code>.
     */
    public String getChannels() {
        return (String) get(10);
    }

    /**
     * Setter for <code>login.accounts.last_connection</code>.
     */
    public AccountsRecord setLastConnection(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>login.accounts.last_connection</code>.
     */
    public String getLastConnection() {
        return (String) get(11);
    }

    /**
     * Setter for <code>login.accounts.last_address</code>.
     */
    public AccountsRecord setLastAddress(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>login.accounts.last_address</code>.
     */
    public String getLastAddress() {
        return (String) get(12);
    }

    /**
     * Setter for <code>login.accounts.friend_notification_listener</code>.
     */
    public AccountsRecord setFriendNotificationListener(Byte value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>login.accounts.friend_notification_listener</code>.
     */
    public Byte getFriendNotificationListener() {
        return (Byte) get(13);
    }

    /**
     * Setter for <code>login.accounts.friends</code>.
     */
    public AccountsRecord setFriends(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>login.accounts.friends</code>.
     */
    public String getFriends() {
        return (String) get(14);
    }

    /**
     * Setter for <code>login.accounts.enemies</code>.
     */
    public AccountsRecord setEnemies(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>login.accounts.enemies</code>.
     */
    public String getEnemies() {
        return (String) get(15);
    }

    /**
     * Setter for <code>login.accounts.gifts</code>.
     */
    public AccountsRecord setGifts(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>login.accounts.gifts</code>.
     */
    public String getGifts() {
        return (String) get(16);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record3<Integer, String, String> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<Integer, String, String, String, String, String, Byte, Byte, Byte, Integer, String, String, String, Byte, String, String, String> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<Integer, String, String, String, String, String, Byte, Byte, Byte, Integer, String, String, String, Byte, String, String, String> valuesRow() {
        return (Row17) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Accounts.ACCOUNTS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Accounts.ACCOUNTS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Accounts.ACCOUNTS.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Accounts.ACCOUNTS.NICKNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Accounts.ACCOUNTS.QUESTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Accounts.ACCOUNTS.ANSWER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return Accounts.ACCOUNTS.RIGHTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return Accounts.ACCOUNTS.BANNED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field9() {
        return Accounts.ACCOUNTS.MUTED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return Accounts.ACCOUNTS.POINTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Accounts.ACCOUNTS.CHANNELS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Accounts.ACCOUNTS.LAST_CONNECTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return Accounts.ACCOUNTS.LAST_ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field14() {
        return Accounts.ACCOUNTS.FRIEND_NOTIFICATION_LISTENER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return Accounts.ACCOUNTS.FRIENDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return Accounts.ACCOUNTS.ENEMIES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return Accounts.ACCOUNTS.GIFTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getNickname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getQuestion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getAnswer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value7() {
        return getRights();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value8() {
        return getBanned();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value9() {
        return getMuted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getPoints();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getChannels();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getLastConnection();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getLastAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value14() {
        return getFriendNotificationListener();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getFriends();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getEnemies();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getGifts();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value3(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value4(String value) {
        setNickname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value5(String value) {
        setQuestion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value6(String value) {
        setAnswer(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value7(Byte value) {
        setRights(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value8(Byte value) {
        setBanned(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value9(Byte value) {
        setMuted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value10(Integer value) {
        setPoints(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value11(String value) {
        setChannels(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value12(String value) {
        setLastConnection(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value13(String value) {
        setLastAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value14(Byte value) {
        setFriendNotificationListener(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value15(String value) {
        setFriends(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value16(String value) {
        setEnemies(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value17(String value) {
        setGifts(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, Byte value7, Byte value8, Byte value9, Integer value10, String value11, String value12, String value13, Byte value14, String value15, String value16, String value17) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AccountsRecord
     */
    public AccountsRecord() {
        super(Accounts.ACCOUNTS);
    }

    /**
     * Create a detached, initialised AccountsRecord
     */
    public AccountsRecord(Integer id, String name, String password, String nickname, String question, String answer, Byte rights, Byte banned, Byte muted, Integer points, String channels, String lastConnection, String lastAddress, Byte friendNotificationListener, String friends, String enemies, String gifts) {
        super(Accounts.ACCOUNTS);

        set(0, id);
        set(1, name);
        set(2, password);
        set(3, nickname);
        set(4, question);
        set(5, answer);
        set(6, rights);
        set(7, banned);
        set(8, muted);
        set(9, points);
        set(10, channels);
        set(11, lastConnection);
        set(12, lastAddress);
        set(13, friendNotificationListener);
        set(14, friends);
        set(15, enemies);
        set(16, gifts);
    }
}
