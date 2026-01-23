package com.robinhood.librobinhood.data.store;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionUpgradeStore.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/ChangeOptionLevelResult;", "", "<init>", "()V", "Success", "Pending", "Failure", "Lcom/robinhood/librobinhood/data/store/ChangeOptionLevelResult$Failure;", "Lcom/robinhood/librobinhood/data/store/ChangeOptionLevelResult$Pending;", "Lcom/robinhood/librobinhood/data/store/ChangeOptionLevelResult$Success;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.ChangeOptionLevelResult, reason: use source file name */
/* loaded from: classes13.dex */
public abstract class OptionUpgradeStore2 {
    public /* synthetic */ OptionUpgradeStore2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: OptionUpgradeStore.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/ChangeOptionLevelResult$Success;", "Lcom/robinhood/librobinhood/data/store/ChangeOptionLevelResult;", "optionLevel", "", "<init>", "(Ljava/lang/String;)V", "getOptionLevel", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.ChangeOptionLevelResult$Success, reason: from toString */
    public static final /* data */ class Success extends OptionUpgradeStore2 {
        private final String optionLevel;

        public static /* synthetic */ Success copy$default(Success success, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.optionLevel;
            }
            return success.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getOptionLevel() {
            return this.optionLevel;
        }

        public final Success copy(String optionLevel) {
            return new Success(optionLevel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.optionLevel, ((Success) other).optionLevel);
        }

        public int hashCode() {
            String str = this.optionLevel;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Success(optionLevel=" + this.optionLevel + ")";
        }

        public Success(String str) {
            super(null);
            this.optionLevel = str;
        }

        public final String getOptionLevel() {
            return this.optionLevel;
        }
    }

    private OptionUpgradeStore2() {
    }

    /* compiled from: OptionUpgradeStore.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/ChangeOptionLevelResult$Pending;", "Lcom/robinhood/librobinhood/data/store/ChangeOptionLevelResult;", "optionLevel", "", "<init>", "(Ljava/lang/String;)V", "getOptionLevel", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.ChangeOptionLevelResult$Pending, reason: from toString */
    public static final /* data */ class Pending extends OptionUpgradeStore2 {
        private final String optionLevel;

        public static /* synthetic */ Pending copy$default(Pending pending, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = pending.optionLevel;
            }
            return pending.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getOptionLevel() {
            return this.optionLevel;
        }

        public final Pending copy(String optionLevel) {
            return new Pending(optionLevel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Pending) && Intrinsics.areEqual(this.optionLevel, ((Pending) other).optionLevel);
        }

        public int hashCode() {
            String str = this.optionLevel;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Pending(optionLevel=" + this.optionLevel + ")";
        }

        public Pending(String str) {
            super(null);
            this.optionLevel = str;
        }

        public final String getOptionLevel() {
            return this.optionLevel;
        }
    }

    /* compiled from: OptionUpgradeStore.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/ChangeOptionLevelResult$Failure;", "Lcom/robinhood/librobinhood/data/store/ChangeOptionLevelResult;", "optionLevel", "", "throwable", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getOptionLevel", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.ChangeOptionLevelResult$Failure, reason: from toString */
    public static final /* data */ class Failure extends OptionUpgradeStore2 {
        private final String optionLevel;
        private final Throwable throwable;

        public static /* synthetic */ Failure copy$default(Failure failure, String str, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failure.optionLevel;
            }
            if ((i & 2) != 0) {
                th = failure.throwable;
            }
            return failure.copy(str, th);
        }

        /* renamed from: component1, reason: from getter */
        public final String getOptionLevel() {
            return this.optionLevel;
        }

        /* renamed from: component2, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final Failure copy(String optionLevel, Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new Failure(optionLevel, throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) other;
            return Intrinsics.areEqual(this.optionLevel, failure.optionLevel) && Intrinsics.areEqual(this.throwable, failure.throwable);
        }

        public int hashCode() {
            String str = this.optionLevel;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.throwable.hashCode();
        }

        public String toString() {
            return "Failure(optionLevel=" + this.optionLevel + ", throwable=" + this.throwable + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(String str, Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.optionLevel = str;
            this.throwable = throwable;
        }

        public final String getOptionLevel() {
            return this.optionLevel;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }
}
