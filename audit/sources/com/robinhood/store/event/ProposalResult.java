package com.robinhood.store.event;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventComboStore.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/store/event/ProposalResult;", "", "Loading", "Success", "Timeout", "Lcom/robinhood/store/event/ProposalResult$Loading;", "Lcom/robinhood/store/event/ProposalResult$Success;", "Lcom/robinhood/store/event/ProposalResult$Timeout;", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface ProposalResult {

    /* compiled from: EventComboStore.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/store/event/ProposalResult$Loading;", "Lcom/robinhood/store/event/ProposalResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements ProposalResult {
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -1282812877;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: EventComboStore.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/store/event/ProposalResult$Success;", "Lcom/robinhood/store/event/ProposalResult;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/store/event/ProposalData;", "constructor-impl", "(Lcom/robinhood/store/event/ProposalData;)Lcom/robinhood/store/event/ProposalData;", "getData", "()Lcom/robinhood/store/event/ProposalData;", "equals", "", "other", "", "equals-impl", "(Lcom/robinhood/store/event/ProposalData;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lcom/robinhood/store/event/ProposalData;)I", "toString", "", "toString-impl", "(Lcom/robinhood/store/event/ProposalData;)Ljava/lang/String;", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @JvmInline
    public static final class Success implements ProposalResult {
        private final ProposalData data;

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Success m26454boximpl(ProposalData proposalData) {
            return new Success(proposalData);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static ProposalData m26455constructorimpl(ProposalData data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return data;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m26456equalsimpl(ProposalData proposalData, Object obj) {
            return (obj instanceof Success) && Intrinsics.areEqual(proposalData, ((Success) obj).m26460unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m26457equalsimpl0(ProposalData proposalData, ProposalData proposalData2) {
            return Intrinsics.areEqual(proposalData, proposalData2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m26458hashCodeimpl(ProposalData proposalData) {
            return proposalData.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m26459toStringimpl(ProposalData proposalData) {
            return "Success(data=" + proposalData + ")";
        }

        public boolean equals(Object obj) {
            return m26456equalsimpl(this.data, obj);
        }

        public int hashCode() {
            return m26458hashCodeimpl(this.data);
        }

        public String toString() {
            return m26459toStringimpl(this.data);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ ProposalData m26460unboximpl() {
            return this.data;
        }

        private /* synthetic */ Success(ProposalData proposalData) {
            this.data = proposalData;
        }

        public final ProposalData getData() {
            return this.data;
        }
    }

    /* compiled from: EventComboStore.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/store/event/ProposalResult$Timeout;", "Lcom/robinhood/store/event/ProposalResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Timeout implements ProposalResult {
        public static final Timeout INSTANCE = new Timeout();

        public boolean equals(Object other) {
            return this == other || (other instanceof Timeout);
        }

        public int hashCode() {
            return 1361592408;
        }

        public String toString() {
            return "Timeout";
        }

        private Timeout() {
        }
    }
}
