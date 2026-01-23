package com.robinhood.android.wires.p278ui;

import com.robinhood.models.api.bonfire.transfer.wires.ApiWireDetailsContent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WiresLoadingEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/WiresLoadingEvent;", "", "Error", "NoBrokerageAccount", "PreselectionSpecified", "Selection", "Lcom/robinhood/android/wires/ui/WiresLoadingEvent$Error;", "Lcom/robinhood/android/wires/ui/WiresLoadingEvent$NoBrokerageAccount;", "Lcom/robinhood/android/wires/ui/WiresLoadingEvent$PreselectionSpecified;", "Lcom/robinhood/android/wires/ui/WiresLoadingEvent$Selection;", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface WiresLoadingEvent {

    /* compiled from: WiresLoadingEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/WiresLoadingEvent$Error;", "Lcom/robinhood/android/wires/ui/WiresLoadingEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements WiresLoadingEvent {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.throwable;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final Error copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new Error(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "Error(throwable=" + this.throwable + ")";
        }

        public Error(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }

    /* compiled from: WiresLoadingEvent.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/WiresLoadingEvent$NoBrokerageAccount;", "Lcom/robinhood/android/wires/ui/WiresLoadingEvent;", "screenIdentifier", "", "content", "Lcom/robinhood/models/api/bonfire/transfer/wires/ApiWireDetailsContent$InvalidAccountContent;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/bonfire/transfer/wires/ApiWireDetailsContent$InvalidAccountContent;)V", "getScreenIdentifier", "()Ljava/lang/String;", "getContent", "()Lcom/robinhood/models/api/bonfire/transfer/wires/ApiWireDetailsContent$InvalidAccountContent;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NoBrokerageAccount implements WiresLoadingEvent {
        public static final int $stable = 8;
        private final ApiWireDetailsContent.InvalidAccountContent content;
        private final String screenIdentifier;

        public static /* synthetic */ NoBrokerageAccount copy$default(NoBrokerageAccount noBrokerageAccount, String str, ApiWireDetailsContent.InvalidAccountContent invalidAccountContent, int i, Object obj) {
            if ((i & 1) != 0) {
                str = noBrokerageAccount.screenIdentifier;
            }
            if ((i & 2) != 0) {
                invalidAccountContent = noBrokerageAccount.content;
            }
            return noBrokerageAccount.copy(str, invalidAccountContent);
        }

        /* renamed from: component1, reason: from getter */
        public final String getScreenIdentifier() {
            return this.screenIdentifier;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiWireDetailsContent.InvalidAccountContent getContent() {
            return this.content;
        }

        public final NoBrokerageAccount copy(String screenIdentifier, ApiWireDetailsContent.InvalidAccountContent content) {
            Intrinsics.checkNotNullParameter(screenIdentifier, "screenIdentifier");
            Intrinsics.checkNotNullParameter(content, "content");
            return new NoBrokerageAccount(screenIdentifier, content);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NoBrokerageAccount)) {
                return false;
            }
            NoBrokerageAccount noBrokerageAccount = (NoBrokerageAccount) other;
            return Intrinsics.areEqual(this.screenIdentifier, noBrokerageAccount.screenIdentifier) && Intrinsics.areEqual(this.content, noBrokerageAccount.content);
        }

        public int hashCode() {
            return (this.screenIdentifier.hashCode() * 31) + this.content.hashCode();
        }

        public String toString() {
            return "NoBrokerageAccount(screenIdentifier=" + this.screenIdentifier + ", content=" + this.content + ")";
        }

        public NoBrokerageAccount(String screenIdentifier, ApiWireDetailsContent.InvalidAccountContent content) {
            Intrinsics.checkNotNullParameter(screenIdentifier, "screenIdentifier");
            Intrinsics.checkNotNullParameter(content, "content");
            this.screenIdentifier = screenIdentifier;
            this.content = content;
        }

        public final String getScreenIdentifier() {
            return this.screenIdentifier;
        }

        public final ApiWireDetailsContent.InvalidAccountContent getContent() {
            return this.content;
        }
    }

    /* compiled from: WiresLoadingEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/WiresLoadingEvent$PreselectionSpecified;", "Lcom/robinhood/android/wires/ui/WiresLoadingEvent;", "content", "Lcom/robinhood/models/api/bonfire/transfer/wires/ApiWireDetailsContent$WireDetailsContent;", "<init>", "(Lcom/robinhood/models/api/bonfire/transfer/wires/ApiWireDetailsContent$WireDetailsContent;)V", "getContent", "()Lcom/robinhood/models/api/bonfire/transfer/wires/ApiWireDetailsContent$WireDetailsContent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PreselectionSpecified implements WiresLoadingEvent {
        public static final int $stable = 8;
        private final ApiWireDetailsContent.WireDetailsContent content;

        public static /* synthetic */ PreselectionSpecified copy$default(PreselectionSpecified preselectionSpecified, ApiWireDetailsContent.WireDetailsContent wireDetailsContent, int i, Object obj) {
            if ((i & 1) != 0) {
                wireDetailsContent = preselectionSpecified.content;
            }
            return preselectionSpecified.copy(wireDetailsContent);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiWireDetailsContent.WireDetailsContent getContent() {
            return this.content;
        }

        public final PreselectionSpecified copy(ApiWireDetailsContent.WireDetailsContent content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new PreselectionSpecified(content);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PreselectionSpecified) && Intrinsics.areEqual(this.content, ((PreselectionSpecified) other).content);
        }

        public int hashCode() {
            return this.content.hashCode();
        }

        public String toString() {
            return "PreselectionSpecified(content=" + this.content + ")";
        }

        public PreselectionSpecified(ApiWireDetailsContent.WireDetailsContent content) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
        }

        public final ApiWireDetailsContent.WireDetailsContent getContent() {
            return this.content;
        }
    }

    /* compiled from: WiresLoadingEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/WiresLoadingEvent$Selection;", "Lcom/robinhood/android/wires/ui/WiresLoadingEvent;", "content", "Lcom/robinhood/models/api/bonfire/transfer/wires/ApiWireDetailsContent$WireDetailsContent;", "<init>", "(Lcom/robinhood/models/api/bonfire/transfer/wires/ApiWireDetailsContent$WireDetailsContent;)V", "getContent", "()Lcom/robinhood/models/api/bonfire/transfer/wires/ApiWireDetailsContent$WireDetailsContent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Selection implements WiresLoadingEvent {
        public static final int $stable = 8;
        private final ApiWireDetailsContent.WireDetailsContent content;

        public static /* synthetic */ Selection copy$default(Selection selection, ApiWireDetailsContent.WireDetailsContent wireDetailsContent, int i, Object obj) {
            if ((i & 1) != 0) {
                wireDetailsContent = selection.content;
            }
            return selection.copy(wireDetailsContent);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiWireDetailsContent.WireDetailsContent getContent() {
            return this.content;
        }

        public final Selection copy(ApiWireDetailsContent.WireDetailsContent content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new Selection(content);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Selection) && Intrinsics.areEqual(this.content, ((Selection) other).content);
        }

        public int hashCode() {
            return this.content.hashCode();
        }

        public String toString() {
            return "Selection(content=" + this.content + ")";
        }

        public Selection(ApiWireDetailsContent.WireDetailsContent content) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
        }

        public final ApiWireDetailsContent.WireDetailsContent getContent() {
            return this.content;
        }
    }
}
