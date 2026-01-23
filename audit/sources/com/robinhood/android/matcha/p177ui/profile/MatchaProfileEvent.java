package com.robinhood.android.matcha.p177ui.profile;

import com.robinhood.android.social.contracts.matcha.MatchaTransaction;
import com.robinhood.models.api.bonfire.ApiSocialProfileInfo;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaProfileEvent.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/profile/MatchaProfileEvent;", "", "Error", "Report", "BlockResult", "CreateTransaction", "ShowMenu", "Lcom/robinhood/android/matcha/ui/profile/MatchaProfileEvent$BlockResult;", "Lcom/robinhood/android/matcha/ui/profile/MatchaProfileEvent$CreateTransaction;", "Lcom/robinhood/android/matcha/ui/profile/MatchaProfileEvent$Error;", "Lcom/robinhood/android/matcha/ui/profile/MatchaProfileEvent$Report;", "Lcom/robinhood/android/matcha/ui/profile/MatchaProfileEvent$ShowMenu;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface MatchaProfileEvent {

    /* compiled from: MatchaProfileEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/profile/MatchaProfileEvent$Error;", "Lcom/robinhood/android/matcha/ui/profile/MatchaProfileEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements MatchaProfileEvent {
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

    /* compiled from: MatchaProfileEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/profile/MatchaProfileEvent$Report;", "Lcom/robinhood/android/matcha/ui/profile/MatchaProfileEvent;", "profile", "Lcom/robinhood/models/api/bonfire/ApiSocialProfileInfo;", "<init>", "(Lcom/robinhood/models/api/bonfire/ApiSocialProfileInfo;)V", "getProfile", "()Lcom/robinhood/models/api/bonfire/ApiSocialProfileInfo;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Report implements MatchaProfileEvent {
        public static final int $stable = 8;
        private final ApiSocialProfileInfo profile;

        public static /* synthetic */ Report copy$default(Report report, ApiSocialProfileInfo apiSocialProfileInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                apiSocialProfileInfo = report.profile;
            }
            return report.copy(apiSocialProfileInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiSocialProfileInfo getProfile() {
            return this.profile;
        }

        public final Report copy(ApiSocialProfileInfo profile) {
            Intrinsics.checkNotNullParameter(profile, "profile");
            return new Report(profile);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Report) && Intrinsics.areEqual(this.profile, ((Report) other).profile);
        }

        public int hashCode() {
            return this.profile.hashCode();
        }

        public String toString() {
            return "Report(profile=" + this.profile + ")";
        }

        public Report(ApiSocialProfileInfo profile) {
            Intrinsics.checkNotNullParameter(profile, "profile");
            this.profile = profile;
        }

        public final ApiSocialProfileInfo getProfile() {
            return this.profile;
        }
    }

    /* compiled from: MatchaProfileEvent.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\bJ\u001e\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/profile/MatchaProfileEvent$BlockResult;", "Lcom/robinhood/android/matcha/ui/profile/MatchaProfileEvent;", "result", "Lkotlin/Result;", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Ljava/lang/Object;)V", "getResult-d1pmJ48", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component1-d1pmJ48", "copy", "(Ljava/lang/Object;)Lcom/robinhood/android/matcha/ui/profile/MatchaProfileEvent$BlockResult;", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class BlockResult implements MatchaProfileEvent {
        public static final int $stable = 8;
        private final Object result;

        public static /* synthetic */ BlockResult copy$default(BlockResult blockResult, Result result, int i, Object obj) {
            if ((i & 1) != 0) {
                result = Result.m28549boximpl(blockResult.result);
            }
            return blockResult.copy(result.getValue());
        }

        /* renamed from: component1-d1pmJ48, reason: not valid java name and from getter */
        public final Object getResult() {
            return this.result;
        }

        public final BlockResult copy(Object result) {
            return new BlockResult(result);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BlockResult) && Result.m28552equalsimpl0(this.result, ((BlockResult) other).result);
        }

        public int hashCode() {
            return Result.m28554hashCodeimpl(this.result);
        }

        public String toString() {
            return "BlockResult(result=" + Result.m28557toStringimpl(this.result) + ")";
        }

        public BlockResult(Object obj) {
            this.result = obj;
        }

        /* renamed from: getResult-d1pmJ48, reason: not valid java name */
        public final Object m16372getResultd1pmJ48() {
            return this.result;
        }
    }

    /* compiled from: MatchaProfileEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/profile/MatchaProfileEvent$CreateTransaction;", "Lcom/robinhood/android/matcha/ui/profile/MatchaProfileEvent;", "direction", "Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$Direction;", "profile", "Lcom/robinhood/models/api/bonfire/ApiSocialProfileInfo;", "<init>", "(Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$Direction;Lcom/robinhood/models/api/bonfire/ApiSocialProfileInfo;)V", "getDirection", "()Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$Direction;", "getProfile", "()Lcom/robinhood/models/api/bonfire/ApiSocialProfileInfo;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CreateTransaction implements MatchaProfileEvent {
        public static final int $stable = 8;
        private final MatchaTransaction.Direction direction;
        private final ApiSocialProfileInfo profile;

        public static /* synthetic */ CreateTransaction copy$default(CreateTransaction createTransaction, MatchaTransaction.Direction direction, ApiSocialProfileInfo apiSocialProfileInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                direction = createTransaction.direction;
            }
            if ((i & 2) != 0) {
                apiSocialProfileInfo = createTransaction.profile;
            }
            return createTransaction.copy(direction, apiSocialProfileInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final MatchaTransaction.Direction getDirection() {
            return this.direction;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiSocialProfileInfo getProfile() {
            return this.profile;
        }

        public final CreateTransaction copy(MatchaTransaction.Direction direction, ApiSocialProfileInfo profile) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(profile, "profile");
            return new CreateTransaction(direction, profile);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CreateTransaction)) {
                return false;
            }
            CreateTransaction createTransaction = (CreateTransaction) other;
            return this.direction == createTransaction.direction && Intrinsics.areEqual(this.profile, createTransaction.profile);
        }

        public int hashCode() {
            return (this.direction.hashCode() * 31) + this.profile.hashCode();
        }

        public String toString() {
            return "CreateTransaction(direction=" + this.direction + ", profile=" + this.profile + ")";
        }

        public CreateTransaction(MatchaTransaction.Direction direction, ApiSocialProfileInfo profile) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(profile, "profile");
            this.direction = direction;
            this.profile = profile;
        }

        public final MatchaTransaction.Direction getDirection() {
            return this.direction;
        }

        public final ApiSocialProfileInfo getProfile() {
            return this.profile;
        }
    }

    /* compiled from: MatchaProfileEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/profile/MatchaProfileEvent$ShowMenu;", "Lcom/robinhood/android/matcha/ui/profile/MatchaProfileEvent;", "canReport", "", "isBlocked", "<init>", "(ZZ)V", "getCanReport", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowMenu implements MatchaProfileEvent {
        public static final int $stable = 0;
        private final boolean canReport;
        private final boolean isBlocked;

        public static /* synthetic */ ShowMenu copy$default(ShowMenu showMenu, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = showMenu.canReport;
            }
            if ((i & 2) != 0) {
                z2 = showMenu.isBlocked;
            }
            return showMenu.copy(z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getCanReport() {
            return this.canReport;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsBlocked() {
            return this.isBlocked;
        }

        public final ShowMenu copy(boolean canReport, boolean isBlocked) {
            return new ShowMenu(canReport, isBlocked);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowMenu)) {
                return false;
            }
            ShowMenu showMenu = (ShowMenu) other;
            return this.canReport == showMenu.canReport && this.isBlocked == showMenu.isBlocked;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.canReport) * 31) + Boolean.hashCode(this.isBlocked);
        }

        public String toString() {
            return "ShowMenu(canReport=" + this.canReport + ", isBlocked=" + this.isBlocked + ")";
        }

        public ShowMenu(boolean z, boolean z2) {
            this.canReport = z;
            this.isBlocked = z2;
        }

        public final boolean getCanReport() {
            return this.canReport;
        }

        public final boolean isBlocked() {
            return this.isBlocked;
        }
    }
}
