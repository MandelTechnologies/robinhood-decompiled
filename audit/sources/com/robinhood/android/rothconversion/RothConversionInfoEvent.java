package com.robinhood.android.rothconversion;

import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RothConversionInfoEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rothconversion/RothConversionInfoEvent;", "", "Alert", "Transfer", "Lcom/robinhood/android/rothconversion/RothConversionInfoEvent$Alert;", "Lcom/robinhood/android/rothconversion/RothConversionInfoEvent$Transfer;", "feature-roth-conversion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface RothConversionInfoEvent {

    /* compiled from: RothConversionInfoEvent.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/rothconversion/RothConversionInfoEvent$Alert;", "Lcom/robinhood/android/rothconversion/RothConversionInfoEvent;", "content", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;)V", "getContent", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-roth-conversion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Alert implements RothConversionInfoEvent {
        public static final int $stable = 8;
        private final GenericAlertContent<GenericAction> content;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Alert copy$default(Alert alert, GenericAlertContent genericAlertContent, int i, Object obj) {
            if ((i & 1) != 0) {
                genericAlertContent = alert.content;
            }
            return alert.copy(genericAlertContent);
        }

        public final GenericAlertContent<GenericAction> component1() {
            return this.content;
        }

        public final Alert copy(GenericAlertContent<? extends GenericAction> content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new Alert(content);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Alert) && Intrinsics.areEqual(this.content, ((Alert) other).content);
        }

        public int hashCode() {
            return this.content.hashCode();
        }

        public String toString() {
            return "Alert(content=" + this.content + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Alert(GenericAlertContent<? extends GenericAction> content) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
        }

        public final GenericAlertContent<GenericAction> getContent() {
            return this.content;
        }
    }

    /* compiled from: RothConversionInfoEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/rothconversion/RothConversionInfoEvent$Transfer;", "Lcom/robinhood/android/rothconversion/RothConversionInfoEvent;", "<init>", "()V", "feature-roth-conversion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Transfer implements RothConversionInfoEvent {
        public static final int $stable = 0;
        public static final Transfer INSTANCE = new Transfer();

        private Transfer() {
        }
    }
}
