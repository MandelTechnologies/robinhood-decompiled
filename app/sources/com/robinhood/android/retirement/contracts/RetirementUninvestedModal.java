package com.robinhood.android.retirement.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.models.retirement.api.analytics.RetirementAccountState;
import com.robinhood.android.models.retirement.shared.RetirementUninvestedViewModel;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.serverdriven.experimental.api.AccountState;
import com.robinhood.models.serverdriven.experimental.api.RecommendationsState;
import com.robinhood.models.serverdriven.experimental.api.RetirementUninvestedCTA;
import com.robinhood.models.serverdriven.experimental.api.RetirementUninvestedModalAction;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RetirementFragmentKeys.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002()B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB%\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\t\u0010\u0010J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J+\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001cHÖ\u0001J\t\u0010\"\u001a\u00020\u000fHÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/retirement/contracts/RetirementUninvestedModal;", "Landroid/os/Parcelable;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "modalState", "Lcom/robinhood/android/models/retirement/shared/RetirementUninvestedViewModel$Modal;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "loggingInfo", "Lcom/robinhood/android/retirement/contracts/RetirementUninvestedModal$UninvestedLoggingInfo;", "<init>", "(Lcom/robinhood/android/models/retirement/shared/RetirementUninvestedViewModel$Modal;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/android/retirement/contracts/RetirementUninvestedModal$UninvestedLoggingInfo;)V", "action", "Lcom/robinhood/models/serverdriven/experimental/api/RetirementUninvestedModalAction;", "screen", "identifier", "", "(Lcom/robinhood/models/serverdriven/experimental/api/RetirementUninvestedModalAction;Lcom/robinhood/rosetta/eventlogging/Screen;Ljava/lang/String;)V", "getModalState", "()Lcom/robinhood/android/models/retirement/shared/RetirementUninvestedViewModel$Modal;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getLoggingInfo", "()Lcom/robinhood/android/retirement/contracts/RetirementUninvestedModal$UninvestedLoggingInfo;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "UninvestedLoggingInfo", "Callbacks", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final /* data */ class RetirementUninvestedModal implements Parcelable, DialogFragmentKey {
    public static final Parcelable.Creator<RetirementUninvestedModal> CREATOR = new Creator();
    private final Screen eventScreen;
    private final UninvestedLoggingInfo loggingInfo;
    private final RetirementUninvestedViewModel.Modal modalState;

    /* compiled from: RetirementFragmentKeys.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/retirement/contracts/RetirementUninvestedModal$Callbacks;", "", "onUninvestedBottomSheetDeeplinkHandled", "", "deeplink", "", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public interface Callbacks {
        void onUninvestedBottomSheetDeeplinkHandled(String deeplink);
    }

    /* compiled from: RetirementFragmentKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class Creator implements Parcelable.Creator<RetirementUninvestedModal> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RetirementUninvestedModal createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RetirementUninvestedModal((RetirementUninvestedViewModel.Modal) parcel.readParcelable(RetirementUninvestedModal.class.getClassLoader()), (Screen) parcel.readSerializable(), parcel.readInt() == 0 ? null : UninvestedLoggingInfo.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RetirementUninvestedModal[] newArray(int i) {
            return new RetirementUninvestedModal[i];
        }
    }

    /* compiled from: RetirementFragmentKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AccountState.values().length];
            try {
                iArr[AccountState.FUNDED_NOT_INVESTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountState.INVESTED_ZERO_EQUITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountState.INVESTED_POSITIVE_EQUITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AccountState.UNFUNDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AccountState.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[RecommendationsState.values().length];
            try {
                iArr2[RecommendationsState.RECS_INVESTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[RecommendationsState.NON_RECS_INVESTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[RecommendationsState.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static /* synthetic */ RetirementUninvestedModal copy$default(RetirementUninvestedModal retirementUninvestedModal, RetirementUninvestedViewModel.Modal modal, Screen screen, UninvestedLoggingInfo uninvestedLoggingInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            modal = retirementUninvestedModal.modalState;
        }
        if ((i & 2) != 0) {
            screen = retirementUninvestedModal.eventScreen;
        }
        if ((i & 4) != 0) {
            uninvestedLoggingInfo = retirementUninvestedModal.loggingInfo;
        }
        return retirementUninvestedModal.copy(modal, screen, uninvestedLoggingInfo);
    }

    /* renamed from: component1, reason: from getter */
    public final RetirementUninvestedViewModel.Modal getModalState() {
        return this.modalState;
    }

    /* renamed from: component2, reason: from getter */
    public final Screen getEventScreen() {
        return this.eventScreen;
    }

    /* renamed from: component3, reason: from getter */
    public final UninvestedLoggingInfo getLoggingInfo() {
        return this.loggingInfo;
    }

    public final RetirementUninvestedModal copy(RetirementUninvestedViewModel.Modal modalState, Screen eventScreen, UninvestedLoggingInfo loggingInfo) {
        Intrinsics.checkNotNullParameter(modalState, "modalState");
        return new RetirementUninvestedModal(modalState, eventScreen, loggingInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RetirementUninvestedModal)) {
            return false;
        }
        RetirementUninvestedModal retirementUninvestedModal = (RetirementUninvestedModal) other;
        return Intrinsics.areEqual(this.modalState, retirementUninvestedModal.modalState) && Intrinsics.areEqual(this.eventScreen, retirementUninvestedModal.eventScreen) && Intrinsics.areEqual(this.loggingInfo, retirementUninvestedModal.loggingInfo);
    }

    public int hashCode() {
        int iHashCode = this.modalState.hashCode() * 31;
        Screen screen = this.eventScreen;
        int iHashCode2 = (iHashCode + (screen == null ? 0 : screen.hashCode())) * 31;
        UninvestedLoggingInfo uninvestedLoggingInfo = this.loggingInfo;
        return iHashCode2 + (uninvestedLoggingInfo != null ? uninvestedLoggingInfo.hashCode() : 0);
    }

    public String toString() {
        return "RetirementUninvestedModal(modalState=" + this.modalState + ", eventScreen=" + this.eventScreen + ", loggingInfo=" + this.loggingInfo + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.modalState, flags);
        dest.writeSerializable(this.eventScreen);
        UninvestedLoggingInfo uninvestedLoggingInfo = this.loggingInfo;
        if (uninvestedLoggingInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            uninvestedLoggingInfo.writeToParcel(dest, flags);
        }
    }

    public RetirementUninvestedModal(RetirementUninvestedViewModel.Modal modalState, Screen screen, UninvestedLoggingInfo uninvestedLoggingInfo) {
        Intrinsics.checkNotNullParameter(modalState, "modalState");
        this.modalState = modalState;
        this.eventScreen = screen;
        this.loggingInfo = uninvestedLoggingInfo;
    }

    public /* synthetic */ RetirementUninvestedModal(RetirementUninvestedViewModel.Modal modal, Screen screen, UninvestedLoggingInfo uninvestedLoggingInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(modal, (i & 2) != 0 ? null : screen, (i & 4) != 0 ? null : uninvestedLoggingInfo);
    }

    public final RetirementUninvestedViewModel.Modal getModalState() {
        return this.modalState;
    }

    public final Screen getEventScreen() {
        return this.eventScreen;
    }

    public final UninvestedLoggingInfo getLoggingInfo() {
        return this.loggingInfo;
    }

    public /* synthetic */ RetirementUninvestedModal(RetirementUninvestedModalAction retirementUninvestedModalAction, Screen screen, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(retirementUninvestedModalAction, (i & 2) != 0 ? null : screen, str);
    }

    public RetirementUninvestedModal(RetirementUninvestedModalAction action, Screen screen, String identifier) {
        RetirementAccountState retirementAccountState;
        com.robinhood.android.models.retirement.api.analytics.RecommendationsState recommendationsState;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        String title = action.getTitle();
        List<RetirementUninvestedCTA> ctas = action.getCtas();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(ctas, 10));
        for (RetirementUninvestedCTA retirementUninvestedCTA : ctas) {
            arrayList.add(new RetirementUninvestedViewModel.ModalCta(retirementUninvestedCTA.getPictogram(), retirementUninvestedCTA.getTitle(), retirementUninvestedCTA.getSubtitle(), retirementUninvestedCTA.getDeeplink(), retirementUninvestedCTA.getLogging_identifier()));
        }
        RetirementUninvestedViewModel.Modal modal = new RetirementUninvestedViewModel.Modal(title, arrayList);
        int i = WhenMappings.$EnumSwitchMapping$0[action.getAccount_state().ordinal()];
        if (i == 1) {
            retirementAccountState = RetirementAccountState.FUNDED_NOT_INVESTED;
        } else if (i == 2) {
            retirementAccountState = RetirementAccountState.INVESTED_ZERO_EQUITY;
        } else if (i == 3) {
            retirementAccountState = RetirementAccountState.INVESTED_POSITIVE_EQUITY;
        } else if (i == 4) {
            retirementAccountState = RetirementAccountState.UNFUNDED;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            retirementAccountState = RetirementAccountState.UNKNOWN;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$1[action.getRecommendations_state().ordinal()];
        if (i2 == 1) {
            recommendationsState = com.robinhood.android.models.retirement.api.analytics.RecommendationsState.INVESTED;
        } else if (i2 == 2) {
            recommendationsState = com.robinhood.android.models.retirement.api.analytics.RecommendationsState.NOT_INVESTED;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            recommendationsState = com.robinhood.android.models.retirement.api.analytics.RecommendationsState.UNKNOWN;
        }
        this(modal, screen, new UninvestedLoggingInfo(identifier, retirementAccountState, recommendationsState, null));
    }

    /* compiled from: RetirementFragmentKeys.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/retirement/contracts/RetirementUninvestedModal$UninvestedLoggingInfo;", "Landroid/os/Parcelable;", "identifier", "", "accountState", "Lcom/robinhood/android/models/retirement/api/analytics/RetirementAccountState;", "recsState", "Lcom/robinhood/android/models/retirement/api/analytics/RecommendationsState;", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/models/retirement/api/analytics/RetirementAccountState;Lcom/robinhood/android/models/retirement/api/analytics/RecommendationsState;Lcom/robinhood/models/api/BrokerageAccountType;)V", "getIdentifier", "()Ljava/lang/String;", "getAccountState", "()Lcom/robinhood/android/models/retirement/api/analytics/RetirementAccountState;", "getRecsState", "()Lcom/robinhood/android/models/retirement/api/analytics/RecommendationsState;", "getAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class UninvestedLoggingInfo implements Parcelable {
        public static final Parcelable.Creator<UninvestedLoggingInfo> CREATOR = new Creator();
        private final RetirementAccountState accountState;
        private final BrokerageAccountType accountType;
        private final String identifier;
        private final com.robinhood.android.models.retirement.api.analytics.RecommendationsState recsState;

        /* compiled from: RetirementFragmentKeys.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<UninvestedLoggingInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UninvestedLoggingInfo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UninvestedLoggingInfo(parcel.readString(), RetirementAccountState.valueOf(parcel.readString()), com.robinhood.android.models.retirement.api.analytics.RecommendationsState.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : BrokerageAccountType.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UninvestedLoggingInfo[] newArray(int i) {
                return new UninvestedLoggingInfo[i];
            }
        }

        public static /* synthetic */ UninvestedLoggingInfo copy$default(UninvestedLoggingInfo uninvestedLoggingInfo, String str, RetirementAccountState retirementAccountState, com.robinhood.android.models.retirement.api.analytics.RecommendationsState recommendationsState, BrokerageAccountType brokerageAccountType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uninvestedLoggingInfo.identifier;
            }
            if ((i & 2) != 0) {
                retirementAccountState = uninvestedLoggingInfo.accountState;
            }
            if ((i & 4) != 0) {
                recommendationsState = uninvestedLoggingInfo.recsState;
            }
            if ((i & 8) != 0) {
                brokerageAccountType = uninvestedLoggingInfo.accountType;
            }
            return uninvestedLoggingInfo.copy(str, retirementAccountState, recommendationsState, brokerageAccountType);
        }

        /* renamed from: component1, reason: from getter */
        public final String getIdentifier() {
            return this.identifier;
        }

        /* renamed from: component2, reason: from getter */
        public final RetirementAccountState getAccountState() {
            return this.accountState;
        }

        /* renamed from: component3, reason: from getter */
        public final com.robinhood.android.models.retirement.api.analytics.RecommendationsState getRecsState() {
            return this.recsState;
        }

        /* renamed from: component4, reason: from getter */
        public final BrokerageAccountType getAccountType() {
            return this.accountType;
        }

        public final UninvestedLoggingInfo copy(String identifier, RetirementAccountState accountState, com.robinhood.android.models.retirement.api.analytics.RecommendationsState recsState, BrokerageAccountType accountType) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(accountState, "accountState");
            Intrinsics.checkNotNullParameter(recsState, "recsState");
            return new UninvestedLoggingInfo(identifier, accountState, recsState, accountType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UninvestedLoggingInfo)) {
                return false;
            }
            UninvestedLoggingInfo uninvestedLoggingInfo = (UninvestedLoggingInfo) other;
            return Intrinsics.areEqual(this.identifier, uninvestedLoggingInfo.identifier) && this.accountState == uninvestedLoggingInfo.accountState && this.recsState == uninvestedLoggingInfo.recsState && this.accountType == uninvestedLoggingInfo.accountType;
        }

        public int hashCode() {
            int iHashCode = ((((this.identifier.hashCode() * 31) + this.accountState.hashCode()) * 31) + this.recsState.hashCode()) * 31;
            BrokerageAccountType brokerageAccountType = this.accountType;
            return iHashCode + (brokerageAccountType == null ? 0 : brokerageAccountType.hashCode());
        }

        public String toString() {
            return "UninvestedLoggingInfo(identifier=" + this.identifier + ", accountState=" + this.accountState + ", recsState=" + this.recsState + ", accountType=" + this.accountType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.identifier);
            dest.writeString(this.accountState.name());
            dest.writeString(this.recsState.name());
            BrokerageAccountType brokerageAccountType = this.accountType;
            if (brokerageAccountType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(brokerageAccountType.name());
            }
        }

        public UninvestedLoggingInfo(String identifier, RetirementAccountState accountState, com.robinhood.android.models.retirement.api.analytics.RecommendationsState recsState, BrokerageAccountType brokerageAccountType) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(accountState, "accountState");
            Intrinsics.checkNotNullParameter(recsState, "recsState");
            this.identifier = identifier;
            this.accountState = accountState;
            this.recsState = recsState;
            this.accountType = brokerageAccountType;
        }

        public final String getIdentifier() {
            return this.identifier;
        }

        public /* synthetic */ UninvestedLoggingInfo(String str, RetirementAccountState retirementAccountState, com.robinhood.android.models.retirement.api.analytics.RecommendationsState recommendationsState, BrokerageAccountType brokerageAccountType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? RetirementAccountState.UNKNOWN : retirementAccountState, (i & 4) != 0 ? com.robinhood.android.models.retirement.api.analytics.RecommendationsState.UNKNOWN : recommendationsState, (i & 8) != 0 ? null : brokerageAccountType);
        }

        public final RetirementAccountState getAccountState() {
            return this.accountState;
        }

        public final com.robinhood.android.models.retirement.api.analytics.RecommendationsState getRecsState() {
            return this.recsState;
        }

        public final BrokerageAccountType getAccountType() {
            return this.accountType;
        }
    }
}
