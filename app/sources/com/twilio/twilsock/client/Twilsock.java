package com.twilio.twilsock.client;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.twilio.twilsock.util.HttpRequest;
import com.twilio.twilsock.util.HttpResponse;
import com.twilio.twilsock.util.Unsubscriber;
import com.twilio.util.AccountDescriptor;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* compiled from: Twilsock.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J!\u0010\t\u001a\u00020\n2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH&J\b\u0010\u0010\u001a\u00020\u000eH&J\b\u0010\u0011\u001a\u00020\u000eH&J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0016\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H&J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH¦@¢\u0006\u0002\u0010\u001dJ+\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0014H¦@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u0018H¦@¢\u0006\u0002\u0010&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006'"}, m3636d2 = {"Lcom/twilio/twilsock/client/Twilsock;", "", "accountDescriptor", "Lcom/twilio/util/AccountDescriptor;", "getAccountDescriptor", "()Lcom/twilio/util/AccountDescriptor;", "isConnected", "", "()Z", "addObserver", "Lcom/twilio/twilsock/util/Unsubscriber;", "block", "Lkotlin/Function1;", "Lcom/twilio/twilsock/client/TwilsockObserver;", "", "Lkotlin/ExtensionFunctionType;", "connect", "disconnect", "handleMessageReceived", WebsocketGatewayConstants.DATA_KEY, "", "populateInitRegistrations", "messageTypes", "", "", "sendRequest", "Lcom/twilio/twilsock/util/HttpResponse;", "httpRequest", "Lcom/twilio/twilsock/util/HttpRequest;", "(Lcom/twilio/twilsock/util/HttpRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestId", "timeout", "Lkotlin/time/Duration;", "rawMessage", "sendRequest-dWUq8MI", "(Ljava/lang/String;J[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateToken", "newToken", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface Twilsock {
    Unsubscriber addObserver(Function1<? super TwilsockObserver, Unit> block);

    void connect();

    void disconnect();

    AccountDescriptor getAccountDescriptor();

    void handleMessageReceived(byte[] data);

    boolean isConnected();

    void populateInitRegistrations(Set<String> messageTypes);

    Object sendRequest(HttpRequest httpRequest, Continuation<? super HttpResponse> continuation);

    /* renamed from: sendRequest-dWUq8MI, reason: not valid java name */
    Object mo27200sendRequestdWUq8MI(String str, long j, byte[] bArr, Continuation<? super HttpResponse> continuation);

    Object updateToken(String str, Continuation<? super Unit> continuation);
}
