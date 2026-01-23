package com.robinhood.android.crypto.tab.p093ui.recurring;

import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoRecurringDuxo.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001*BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000b0\b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0019\u0010 \u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000b0\bHÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003J^\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000b0\b2\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0005HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R!\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000b0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/recurring/CryptoRecurringViewState;", "", "loading", "", "title", "", "description", "items", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "Lcom/robinhood/shared/models/history/shared/GenericStatefulHistoryEvent;", "ctaText", "navigationAction", "Lcom/robinhood/android/crypto/tab/ui/recurring/CryptoRecurringViewState$RecurringNavigationAction;", "<init>", "(ZILjava/lang/Integer;Lkotlinx/collections/immutable/ImmutableList;ILcom/robinhood/android/crypto/tab/ui/recurring/CryptoRecurringViewState$RecurringNavigationAction;)V", "getLoading", "()Z", "getTitle", "()I", "getDescription", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getItems", "()Lkotlinx/collections/immutable/ImmutableList;", "getCtaText", "getNavigationAction", "()Lcom/robinhood/android/crypto/tab/ui/recurring/CryptoRecurringViewState$RecurringNavigationAction;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(ZILjava/lang/Integer;Lkotlinx/collections/immutable/ImmutableList;ILcom/robinhood/android/crypto/tab/ui/recurring/CryptoRecurringViewState$RecurringNavigationAction;)Lcom/robinhood/android/crypto/tab/ui/recurring/CryptoRecurringViewState;", "equals", "other", "hashCode", "toString", "", "RecurringNavigationAction", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoRecurringViewState {
    public static final int $stable = 8;
    private final int ctaText;
    private final Integer description;
    private final ImmutableList<StatefulHistoryEvent<HistoryEvent>> items;
    private final boolean loading;
    private final RecurringNavigationAction navigationAction;
    private final int title;

    public static /* synthetic */ CryptoRecurringViewState copy$default(CryptoRecurringViewState cryptoRecurringViewState, boolean z, int i, Integer num, ImmutableList immutableList, int i2, RecurringNavigationAction recurringNavigationAction, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = cryptoRecurringViewState.loading;
        }
        if ((i3 & 2) != 0) {
            i = cryptoRecurringViewState.title;
        }
        if ((i3 & 4) != 0) {
            num = cryptoRecurringViewState.description;
        }
        if ((i3 & 8) != 0) {
            immutableList = cryptoRecurringViewState.items;
        }
        if ((i3 & 16) != 0) {
            i2 = cryptoRecurringViewState.ctaText;
        }
        if ((i3 & 32) != 0) {
            recurringNavigationAction = cryptoRecurringViewState.navigationAction;
        }
        int i4 = i2;
        RecurringNavigationAction recurringNavigationAction2 = recurringNavigationAction;
        return cryptoRecurringViewState.copy(z, i, num, immutableList, i4, recurringNavigationAction2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getDescription() {
        return this.description;
    }

    public final ImmutableList<StatefulHistoryEvent<HistoryEvent>> component4() {
        return this.items;
    }

    /* renamed from: component5, reason: from getter */
    public final int getCtaText() {
        return this.ctaText;
    }

    /* renamed from: component6, reason: from getter */
    public final RecurringNavigationAction getNavigationAction() {
        return this.navigationAction;
    }

    public final CryptoRecurringViewState copy(boolean loading, int title, Integer description, ImmutableList<? extends StatefulHistoryEvent<? extends HistoryEvent>> items, int ctaText, RecurringNavigationAction navigationAction) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new CryptoRecurringViewState(loading, title, description, items, ctaText, navigationAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoRecurringViewState)) {
            return false;
        }
        CryptoRecurringViewState cryptoRecurringViewState = (CryptoRecurringViewState) other;
        return this.loading == cryptoRecurringViewState.loading && this.title == cryptoRecurringViewState.title && Intrinsics.areEqual(this.description, cryptoRecurringViewState.description) && Intrinsics.areEqual(this.items, cryptoRecurringViewState.items) && this.ctaText == cryptoRecurringViewState.ctaText && Intrinsics.areEqual(this.navigationAction, cryptoRecurringViewState.navigationAction);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.loading) * 31) + Integer.hashCode(this.title)) * 31;
        Integer num = this.description;
        int iHashCode2 = (((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.items.hashCode()) * 31) + Integer.hashCode(this.ctaText)) * 31;
        RecurringNavigationAction recurringNavigationAction = this.navigationAction;
        return iHashCode2 + (recurringNavigationAction != null ? recurringNavigationAction.hashCode() : 0);
    }

    public String toString() {
        return "CryptoRecurringViewState(loading=" + this.loading + ", title=" + this.title + ", description=" + this.description + ", items=" + this.items + ", ctaText=" + this.ctaText + ", navigationAction=" + this.navigationAction + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoRecurringViewState(boolean z, int i, Integer num, ImmutableList<? extends StatefulHistoryEvent<? extends HistoryEvent>> items, int i2, RecurringNavigationAction recurringNavigationAction) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.loading = z;
        this.title = i;
        this.description = num;
        this.items = items;
        this.ctaText = i2;
        this.navigationAction = recurringNavigationAction;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final int getTitle() {
        return this.title;
    }

    public final Integer getDescription() {
        return this.description;
    }

    public final ImmutableList<StatefulHistoryEvent<HistoryEvent>> getItems() {
        return this.items;
    }

    public final int getCtaText() {
        return this.ctaText;
    }

    public final RecurringNavigationAction getNavigationAction() {
        return this.navigationAction;
    }

    /* compiled from: CryptoRecurringDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/recurring/CryptoRecurringViewState$RecurringNavigationAction;", "", "key", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "getKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "ShowFragment", "ShowFragmentInStandaloneRdsActivity", "Lcom/robinhood/android/crypto/tab/ui/recurring/CryptoRecurringViewState$RecurringNavigationAction$ShowFragment;", "Lcom/robinhood/android/crypto/tab/ui/recurring/CryptoRecurringViewState$RecurringNavigationAction$ShowFragmentInStandaloneRdsActivity;", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface RecurringNavigationAction {
        FragmentKey getKey();

        /* compiled from: CryptoRecurringDuxo.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/recurring/CryptoRecurringViewState$RecurringNavigationAction$ShowFragment;", "Lcom/robinhood/android/crypto/tab/ui/recurring/CryptoRecurringViewState$RecurringNavigationAction;", "key", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/FragmentKey;)V", "getKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ShowFragment implements RecurringNavigationAction {
            public static final int $stable = 8;
            private final FragmentKey key;

            public static /* synthetic */ ShowFragment copy$default(ShowFragment showFragment, FragmentKey fragmentKey, int i, Object obj) {
                if ((i & 1) != 0) {
                    fragmentKey = showFragment.key;
                }
                return showFragment.copy(fragmentKey);
            }

            /* renamed from: component1, reason: from getter */
            public final FragmentKey getKey() {
                return this.key;
            }

            public final ShowFragment copy(FragmentKey key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return new ShowFragment(key);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowFragment) && Intrinsics.areEqual(this.key, ((ShowFragment) other).key);
            }

            public int hashCode() {
                return this.key.hashCode();
            }

            public String toString() {
                return "ShowFragment(key=" + this.key + ")";
            }

            public ShowFragment(FragmentKey key) {
                Intrinsics.checkNotNullParameter(key, "key");
                this.key = key;
            }

            @Override // com.robinhood.android.crypto.tab.ui.recurring.CryptoRecurringViewState.RecurringNavigationAction
            public FragmentKey getKey() {
                return this.key;
            }
        }

        /* compiled from: CryptoRecurringDuxo.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/recurring/CryptoRecurringViewState$RecurringNavigationAction$ShowFragmentInStandaloneRdsActivity;", "Lcom/robinhood/android/crypto/tab/ui/recurring/CryptoRecurringViewState$RecurringNavigationAction;", "key", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/FragmentKey;)V", "getKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ShowFragmentInStandaloneRdsActivity implements RecurringNavigationAction {
            public static final int $stable = 8;
            private final FragmentKey key;

            public static /* synthetic */ ShowFragmentInStandaloneRdsActivity copy$default(ShowFragmentInStandaloneRdsActivity showFragmentInStandaloneRdsActivity, FragmentKey fragmentKey, int i, Object obj) {
                if ((i & 1) != 0) {
                    fragmentKey = showFragmentInStandaloneRdsActivity.key;
                }
                return showFragmentInStandaloneRdsActivity.copy(fragmentKey);
            }

            /* renamed from: component1, reason: from getter */
            public final FragmentKey getKey() {
                return this.key;
            }

            public final ShowFragmentInStandaloneRdsActivity copy(FragmentKey key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return new ShowFragmentInStandaloneRdsActivity(key);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowFragmentInStandaloneRdsActivity) && Intrinsics.areEqual(this.key, ((ShowFragmentInStandaloneRdsActivity) other).key);
            }

            public int hashCode() {
                return this.key.hashCode();
            }

            public String toString() {
                return "ShowFragmentInStandaloneRdsActivity(key=" + this.key + ")";
            }

            public ShowFragmentInStandaloneRdsActivity(FragmentKey key) {
                Intrinsics.checkNotNullParameter(key, "key");
                this.key = key;
            }

            @Override // com.robinhood.android.crypto.tab.ui.recurring.CryptoRecurringViewState.RecurringNavigationAction
            public FragmentKey getKey() {
                return this.key;
            }
        }
    }
}
