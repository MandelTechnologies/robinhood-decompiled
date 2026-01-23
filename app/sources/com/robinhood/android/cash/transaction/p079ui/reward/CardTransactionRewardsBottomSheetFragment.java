package com.robinhood.android.cash.transaction.p079ui.reward;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.rxjava2.RxJava2Adapter;
import androidx.fragment.app.Fragment;
import com.robinhood.android.cash.transaction.p079ui.reward.CardTransactionRewardsBottomSheetFragment;
import com.robinhood.android.cash.transaction.p079ui.reward.CardTransactionRewardsBottomSheetViewState;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.p320db.MerchantReward;
import com.robinhood.models.p320db.mcduckling.MerchantCardReward;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: CardTransactionRewardsBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0003\u001b\u001c\u001dB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0011\u001a\u00020\u0012H\u0017¢\u0006\u0002\u0010\u0013J\t\u0010\u0014\u001a\u00020\u0015H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e²\u0006\n\u0010\u001f\u001a\u00020 X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/reward/CardTransactionRewardsBottomSheetFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/cash/transaction/ui/reward/CardTransactionRewardsBottomSheetFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/cash/transaction/ui/reward/CardTransactionRewardsBottomSheetFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/cash/transaction/ui/reward/CardTransactionRewardsBottomSheetDuxo;", "getDuxo", "()Lcom/robinhood/android/cash/transaction/ui/reward/CardTransactionRewardsBottomSheetDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-cash-transaction_externalDebug", "viewState", "Lcom/robinhood/android/cash/transaction/ui/reward/CardTransactionRewardsBottomSheetViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class CardTransactionRewardsBottomSheetFragment extends GenericComposeBottomSheetDialogFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.cash.transaction.ui.reward.CardTransactionRewardsBottomSheetFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, CardTransactionRewardsBottomSheetDuxo.class);
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CardTransactionRewardsBottomSheetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/cash/transaction/ui/reward/CardTransactionRewardsBottomSheetFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CardTransactionRewardsBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/reward/CardTransactionRewardsBottomSheetFragment$Callbacks;", "", "onSelectReward", "", "reward", "Lcom/robinhood/models/db/MerchantReward;", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onSelectReward(MerchantReward reward);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(CardTransactionRewardsBottomSheetFragment cardTransactionRewardsBottomSheetFragment, int i, Composer composer, int i2) {
        cardTransactionRewardsBottomSheetFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final CardTransactionRewardsBottomSheetDuxo getDuxo() {
        return (CardTransactionRewardsBottomSheetDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1037258679);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1037258679, i2, -1, "com.robinhood.android.cash.transaction.ui.reward.CardTransactionRewardsBottomSheetFragment.ComposeContent (CardTransactionRewardsBottomSheetFragment.kt:32)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-92851244, true, new C104711(RxJava2Adapter.subscribeAsState(getDuxo().getStates(), new CardTransactionRewardsBottomSheetViewState.Loading(((Args) INSTANCE.getArgs((Fragment) this)).getRewards()), composerStartRestartGroup, 0)), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.transaction.ui.reward.CardTransactionRewardsBottomSheetFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CardTransactionRewardsBottomSheetFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: CardTransactionRewardsBottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.cash.transaction.ui.reward.CardTransactionRewardsBottomSheetFragment$ComposeContent$1 */
    static final class C104711 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<CardTransactionRewardsBottomSheetViewState> $viewState$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C104711(SnapshotState4<? extends CardTransactionRewardsBottomSheetViewState> snapshotState4) {
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-92851244, i, -1, "com.robinhood.android.cash.transaction.ui.reward.CardTransactionRewardsBottomSheetFragment.ComposeContent.<anonymous> (CardTransactionRewardsBottomSheetFragment.kt:37)");
            }
            CardTransactionRewardsBottomSheetViewState cardTransactionRewardsBottomSheetViewStateComposeContent$lambda$0 = CardTransactionRewardsBottomSheetFragment.ComposeContent$lambda$0(this.$viewState$delegate);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(CardTransactionRewardsBottomSheetFragment.this);
            final CardTransactionRewardsBottomSheetFragment cardTransactionRewardsBottomSheetFragment = CardTransactionRewardsBottomSheetFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.cash.transaction.ui.reward.CardTransactionRewardsBottomSheetFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CardTransactionRewardsBottomSheetFragment.C104711.invoke$lambda$1$lambda$0(cardTransactionRewardsBottomSheetFragment, (MerchantReward) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            CardTransactionRewardsBottomSheetComposable.CardTransactionRewardsBottomSheetComposable(cardTransactionRewardsBottomSheetViewStateComposeContent$lambda$0, (Function1) objRememberedValue, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(CardTransactionRewardsBottomSheetFragment cardTransactionRewardsBottomSheetFragment, MerchantReward it) {
            Intrinsics.checkNotNullParameter(it, "it");
            cardTransactionRewardsBottomSheetFragment.getCallbacks().onSelectReward(it);
            cardTransactionRewardsBottomSheetFragment.dismiss();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CardTransactionRewardsBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/reward/CardTransactionRewardsBottomSheetFragment$Args;", "Landroid/os/Parcelable;", "rewards", "", "Lcom/robinhood/models/db/mcduckling/MerchantCardReward;", "<init>", "(Ljava/util/List;)V", "getRewards", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final List<MerchantCardReward> rewards;

        /* compiled from: CardTransactionRewardsBottomSheetFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(Args.class.getClassLoader()));
                }
                return new Args(arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Args copy$default(Args args, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = args.rewards;
            }
            return args.copy(list);
        }

        public final List<MerchantCardReward> component1() {
            return this.rewards;
        }

        public final Args copy(List<MerchantCardReward> rewards) {
            Intrinsics.checkNotNullParameter(rewards, "rewards");
            return new Args(rewards);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.rewards, ((Args) other).rewards);
        }

        public int hashCode() {
            return this.rewards.hashCode();
        }

        public String toString() {
            return "Args(rewards=" + this.rewards + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<MerchantCardReward> list = this.rewards;
            dest.writeInt(list.size());
            Iterator<MerchantCardReward> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }

        public Args(List<MerchantCardReward> rewards) {
            Intrinsics.checkNotNullParameter(rewards, "rewards");
            this.rewards = rewards;
        }

        public final List<MerchantCardReward> getRewards() {
            return this.rewards;
        }
    }

    /* compiled from: CardTransactionRewardsBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/reward/CardTransactionRewardsBottomSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/cash/transaction/ui/reward/CardTransactionRewardsBottomSheetFragment;", "Lcom/robinhood/android/cash/transaction/ui/reward/CardTransactionRewardsBottomSheetFragment$Args;", "<init>", "()V", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CardTransactionRewardsBottomSheetFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CardTransactionRewardsBottomSheetFragment cardTransactionRewardsBottomSheetFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, cardTransactionRewardsBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CardTransactionRewardsBottomSheetFragment newInstance(Args args) {
            return (CardTransactionRewardsBottomSheetFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CardTransactionRewardsBottomSheetFragment cardTransactionRewardsBottomSheetFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, cardTransactionRewardsBottomSheetFragment, args);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardTransactionRewardsBottomSheetViewState ComposeContent$lambda$0(SnapshotState4<? extends CardTransactionRewardsBottomSheetViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
