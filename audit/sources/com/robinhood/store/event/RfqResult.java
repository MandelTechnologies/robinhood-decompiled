package com.robinhood.store.event;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventComboStore.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/store/event/RfqResult;", "", "RfqData", "RfqError", "Lcom/robinhood/store/event/RfqResult$RfqData;", "Lcom/robinhood/store/event/RfqResult$RfqError;", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface RfqResult {

    /* compiled from: EventComboStore.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/store/event/RfqResult$RfqData;", "Lcom/robinhood/store/event/RfqResult;", "rfqId", "", "comboInstrumentId", "Ljava/util/UUID;", "fetchQuoteDurationMs", "", "<init>", "(Ljava/lang/String;Ljava/util/UUID;J)V", "getRfqId", "()Ljava/lang/String;", "getComboInstrumentId", "()Ljava/util/UUID;", "getFetchQuoteDurationMs", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RfqData implements RfqResult {
        private final UUID comboInstrumentId;
        private final long fetchQuoteDurationMs;
        private final String rfqId;

        public static /* synthetic */ RfqData copy$default(RfqData rfqData, String str, UUID uuid, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = rfqData.rfqId;
            }
            if ((i & 2) != 0) {
                uuid = rfqData.comboInstrumentId;
            }
            if ((i & 4) != 0) {
                j = rfqData.fetchQuoteDurationMs;
            }
            return rfqData.copy(str, uuid, j);
        }

        /* renamed from: component1, reason: from getter */
        public final String getRfqId() {
            return this.rfqId;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getComboInstrumentId() {
            return this.comboInstrumentId;
        }

        /* renamed from: component3, reason: from getter */
        public final long getFetchQuoteDurationMs() {
            return this.fetchQuoteDurationMs;
        }

        public final RfqData copy(String rfqId, UUID comboInstrumentId, long fetchQuoteDurationMs) {
            Intrinsics.checkNotNullParameter(rfqId, "rfqId");
            Intrinsics.checkNotNullParameter(comboInstrumentId, "comboInstrumentId");
            return new RfqData(rfqId, comboInstrumentId, fetchQuoteDurationMs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RfqData)) {
                return false;
            }
            RfqData rfqData = (RfqData) other;
            return Intrinsics.areEqual(this.rfqId, rfqData.rfqId) && Intrinsics.areEqual(this.comboInstrumentId, rfqData.comboInstrumentId) && this.fetchQuoteDurationMs == rfqData.fetchQuoteDurationMs;
        }

        public int hashCode() {
            return (((this.rfqId.hashCode() * 31) + this.comboInstrumentId.hashCode()) * 31) + Long.hashCode(this.fetchQuoteDurationMs);
        }

        public String toString() {
            return "RfqData(rfqId=" + this.rfqId + ", comboInstrumentId=" + this.comboInstrumentId + ", fetchQuoteDurationMs=" + this.fetchQuoteDurationMs + ")";
        }

        public RfqData(String rfqId, UUID comboInstrumentId, long j) {
            Intrinsics.checkNotNullParameter(rfqId, "rfqId");
            Intrinsics.checkNotNullParameter(comboInstrumentId, "comboInstrumentId");
            this.rfqId = rfqId;
            this.comboInstrumentId = comboInstrumentId;
            this.fetchQuoteDurationMs = j;
        }

        public final String getRfqId() {
            return this.rfqId;
        }

        public final UUID getComboInstrumentId() {
            return this.comboInstrumentId;
        }

        public final long getFetchQuoteDurationMs() {
            return this.fetchQuoteDurationMs;
        }
    }

    /* compiled from: EventComboStore.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/store/event/RfqResult$RfqError;", "Lcom/robinhood/store/event/RfqResult;", "message", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @JvmInline
    public static final class RfqError implements RfqResult {
        private final String message;

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ RfqError m26461boximpl(String str) {
            return new RfqError(str);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static String m26462constructorimpl(String str) {
            return str;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m26463equalsimpl(String str, Object obj) {
            return (obj instanceof RfqError) && Intrinsics.areEqual(str, ((RfqError) obj).m26467unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m26464equalsimpl0(String str, String str2) {
            return Intrinsics.areEqual(str, str2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m26465hashCodeimpl(String str) {
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m26466toStringimpl(String str) {
            return "RfqError(message=" + str + ")";
        }

        public boolean equals(Object obj) {
            return m26463equalsimpl(this.message, obj);
        }

        public int hashCode() {
            return m26465hashCodeimpl(this.message);
        }

        public String toString() {
            return m26466toStringimpl(this.message);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m26467unboximpl() {
            return this.message;
        }

        private /* synthetic */ RfqError(String str) {
            this.message = str;
        }

        public final String getMessage() {
            return this.message;
        }
    }
}
