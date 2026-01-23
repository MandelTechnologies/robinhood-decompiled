package com.robinhood.android.employment.p114ui;

import com.robinhood.models.api.identi.ApiEmploymentInfo;
import com.robinhood.shared.app.type.AppType;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: ChooseEmploymentStatusDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/employment/ui/ChooseEmploymentStatusDataState;", "", "appType", "Lcom/robinhood/shared/app/type/AppType;", "isLoading", "", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Z)V", "()Z", "options", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/api/identi/ApiEmploymentInfo$EmploymentStatus;", "getOptions", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "feature-employment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ChooseEmploymentStatusDataState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AppType appType;
    private final boolean isLoading;

    /* compiled from: ChooseEmploymentStatusDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppType.values().length];
            try {
                iArr[AppType.RHC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppType.TRADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppType.NCW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component1, reason: from getter */
    private final AppType getAppType() {
        return this.appType;
    }

    public static /* synthetic */ ChooseEmploymentStatusDataState copy$default(ChooseEmploymentStatusDataState chooseEmploymentStatusDataState, AppType appType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            appType = chooseEmploymentStatusDataState.appType;
        }
        if ((i & 2) != 0) {
            z = chooseEmploymentStatusDataState.isLoading;
        }
        return chooseEmploymentStatusDataState.copy(appType, z);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final ChooseEmploymentStatusDataState copy(AppType appType, boolean isLoading) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        return new ChooseEmploymentStatusDataState(appType, isLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChooseEmploymentStatusDataState)) {
            return false;
        }
        ChooseEmploymentStatusDataState chooseEmploymentStatusDataState = (ChooseEmploymentStatusDataState) other;
        return this.appType == chooseEmploymentStatusDataState.appType && this.isLoading == chooseEmploymentStatusDataState.isLoading;
    }

    public int hashCode() {
        return (this.appType.hashCode() * 31) + Boolean.hashCode(this.isLoading);
    }

    public String toString() {
        return "ChooseEmploymentStatusDataState(appType=" + this.appType + ", isLoading=" + this.isLoading + ")";
    }

    public ChooseEmploymentStatusDataState(AppType appType, boolean z) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.appType = appType;
        this.isLoading = z;
    }

    public /* synthetic */ ChooseEmploymentStatusDataState(AppType appType, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(appType, (i & 2) != 0 ? false : z);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final ImmutableList<ApiEmploymentInfo.EmploymentStatus> getOptions() {
        List<ApiEmploymentInfo.EmploymentStatus> options_rhc;
        int i = WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()];
        if (i == 1) {
            options_rhc = INSTANCE.getOPTIONS_RHC();
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException(("Employment status should be shown in " + this.appType.name() + ".").toString());
            }
            options_rhc = INSTANCE.getOPTIONS_TRADER();
        }
        return extensions2.toImmutableList(options_rhc);
    }

    /* compiled from: ChooseEmploymentStatusDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/employment/ui/ChooseEmploymentStatusDataState$Companion;", "", "<init>", "()V", "OPTIONS_TRADER", "", "Lcom/robinhood/models/api/identi/ApiEmploymentInfo$EmploymentStatus;", "getOPTIONS_TRADER", "()Ljava/util/List;", "OPTIONS_RHC", "getOPTIONS_RHC", "feature-employment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<ApiEmploymentInfo.EmploymentStatus> getOPTIONS_TRADER() {
            return CollectionsKt.listOf((Object[]) new ApiEmploymentInfo.EmploymentStatus[]{ApiEmploymentInfo.EmploymentStatus.EMPLOYED, ApiEmploymentInfo.EmploymentStatus.UNEMPLOYED, ApiEmploymentInfo.EmploymentStatus.RETIRED, ApiEmploymentInfo.EmploymentStatus.STUDENT});
        }

        public final List<ApiEmploymentInfo.EmploymentStatus> getOPTIONS_RHC() {
            return CollectionsKt.listOf((Object[]) new ApiEmploymentInfo.EmploymentStatus[]{ApiEmploymentInfo.EmploymentStatus.EMPLOYED, ApiEmploymentInfo.EmploymentStatus.SELF_EMPLOYED, ApiEmploymentInfo.EmploymentStatus.UNEMPLOYED, ApiEmploymentInfo.EmploymentStatus.RETIRED, ApiEmploymentInfo.EmploymentStatus.STUDENT});
        }
    }
}
