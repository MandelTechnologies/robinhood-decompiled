package com.robinhood.android.individualaccounts.onboarding.outro;

import com.robinhood.android.individualaccounts.onboarding.C18897R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndividualAccountOutroState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001+B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J)\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010&\u001a\u00020\u00032\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000bR\u0011\u0010\u001c\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000bR\u0011\u0010\u001e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u000bR\u0011\u0010 \u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b!\u0010\u000b¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroDataState;", "", "hasRefreshed", "", "accountNumber", "", "loadingState", "Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroDataState$LoadingState;", "<init>", "(ZLjava/lang/String;Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroDataState$LoadingState;)V", "getHasRefreshed", "()Z", "getAccountNumber", "()Ljava/lang/String;", "getLoadingState", "()Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroDataState$LoadingState;", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "subtitle", "getSubtitle", "icon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "showCloseIcon", "getShowCloseIcon", "showLoadingAnimation", "getShowLoadingAnimation", "showRefreshButton", "getShowRefreshButton", "showContactSupportButton", "getShowContactSupportButton", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "LoadingState", "feature-individual-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class IndividualAccountOutroDataState {
    public static final int $stable = 0;
    private final String accountNumber;
    private final boolean hasRefreshed;
    private final LoadingState loadingState;

    /* compiled from: IndividualAccountOutroState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadingState.values().length];
            try {
                iArr[LoadingState.SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadingState.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadingState.TIMED_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public IndividualAccountOutroDataState() {
        this(false, null, null, 7, null);
    }

    public static /* synthetic */ IndividualAccountOutroDataState copy$default(IndividualAccountOutroDataState individualAccountOutroDataState, boolean z, String str, LoadingState loadingState, int i, Object obj) {
        if ((i & 1) != 0) {
            z = individualAccountOutroDataState.hasRefreshed;
        }
        if ((i & 2) != 0) {
            str = individualAccountOutroDataState.accountNumber;
        }
        if ((i & 4) != 0) {
            loadingState = individualAccountOutroDataState.loadingState;
        }
        return individualAccountOutroDataState.copy(z, str, loadingState);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getHasRefreshed() {
        return this.hasRefreshed;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final LoadingState getLoadingState() {
        return this.loadingState;
    }

    public final IndividualAccountOutroDataState copy(boolean hasRefreshed, String accountNumber, LoadingState loadingState) {
        Intrinsics.checkNotNullParameter(loadingState, "loadingState");
        return new IndividualAccountOutroDataState(hasRefreshed, accountNumber, loadingState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndividualAccountOutroDataState)) {
            return false;
        }
        IndividualAccountOutroDataState individualAccountOutroDataState = (IndividualAccountOutroDataState) other;
        return this.hasRefreshed == individualAccountOutroDataState.hasRefreshed && Intrinsics.areEqual(this.accountNumber, individualAccountOutroDataState.accountNumber) && this.loadingState == individualAccountOutroDataState.loadingState;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.hasRefreshed) * 31;
        String str = this.accountNumber;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.loadingState.hashCode();
    }

    public String toString() {
        return "IndividualAccountOutroDataState(hasRefreshed=" + this.hasRefreshed + ", accountNumber=" + this.accountNumber + ", loadingState=" + this.loadingState + ")";
    }

    public IndividualAccountOutroDataState(boolean z, String str, LoadingState loadingState) {
        Intrinsics.checkNotNullParameter(loadingState, "loadingState");
        this.hasRefreshed = z;
        this.accountNumber = str;
        this.loadingState = loadingState;
    }

    public final boolean getHasRefreshed() {
        return this.hasRefreshed;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public /* synthetic */ IndividualAccountOutroDataState(boolean z, String str, LoadingState loadingState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? LoadingState.SHORT : loadingState);
    }

    public final LoadingState getLoadingState() {
        return this.loadingState;
    }

    public final StringResource getTitle() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.loadingState.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C18897R.string.opening_account_loading_title, new Object[0]);
        }
        if (i == 2 || i == 3) {
            return StringResource.INSTANCE.invoke(C18897R.string.opening_account_loading_refresh_title, new Object[0]);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final StringResource getSubtitle() {
        StringResource stringResourceInvoke = StringResource.INSTANCE.invoke(C18897R.string.opening_account_loading_refresh_subtitle, new Object[0]);
        if (this.loadingState == LoadingState.TIMED_OUT) {
            return stringResourceInvoke;
        }
        return null;
    }

    public final ServerToBentoAssetMapper2 getIcon() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.loadingState.ordinal()];
        if (i == 1) {
            return ServerToBentoAssetMapper2.ROBINHOOD_24;
        }
        if (i == 2 || i == 3) {
            return ServerToBentoAssetMapper2.CLOCK_24;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean getShowCloseIcon() {
        return this.loadingState == LoadingState.TIMED_OUT;
    }

    public final boolean getShowLoadingAnimation() {
        return this.loadingState != LoadingState.TIMED_OUT;
    }

    public final boolean getShowRefreshButton() {
        return this.loadingState == LoadingState.TIMED_OUT;
    }

    public final boolean getShowContactSupportButton() {
        return this.loadingState == LoadingState.TIMED_OUT && this.hasRefreshed;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IndividualAccountOutroState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroDataState$LoadingState;", "", "<init>", "(Ljava/lang/String;I)V", "SHORT", "LONG", "TIMED_OUT", "feature-individual-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class LoadingState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LoadingState[] $VALUES;
        public static final LoadingState SHORT = new LoadingState("SHORT", 0);
        public static final LoadingState LONG = new LoadingState("LONG", 1);
        public static final LoadingState TIMED_OUT = new LoadingState("TIMED_OUT", 2);

        private static final /* synthetic */ LoadingState[] $values() {
            return new LoadingState[]{SHORT, LONG, TIMED_OUT};
        }

        public static EnumEntries<LoadingState> getEntries() {
            return $ENTRIES;
        }

        private LoadingState(String str, int i) {
        }

        static {
            LoadingState[] loadingStateArr$values = $values();
            $VALUES = loadingStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(loadingStateArr$values);
        }

        public static LoadingState valueOf(String str) {
            return (LoadingState) Enum.valueOf(LoadingState.class, str);
        }

        public static LoadingState[] values() {
            return (LoadingState[]) $VALUES.clone();
        }
    }
}
