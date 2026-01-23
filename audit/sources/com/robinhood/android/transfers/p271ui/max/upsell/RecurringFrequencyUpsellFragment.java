package com.robinhood.android.transfers.p271ui.max.upsell;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding6;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.ach.format.C8331R;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.lib.C30383R;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: RecurringFrequencyUpsellFragment.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\u0019\u001a\u001bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\r\u0010\u0017\u001a\u00020\u0011H\u0017¢\u0006\u0002\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001c²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/upsell/RecurringFrequencyUpsellFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/transfers/ui/max/upsell/DepositFlowFrequencyCallbacks;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "duxo", "Lcom/robinhood/android/transfers/ui/max/upsell/RecurringFrequencyUpsellDuxo;", "getDuxo", "()Lcom/robinhood/android/transfers/ui/max/upsell/RecurringFrequencyUpsellDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onContinueClicked", "", "frequency", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "onBackClicked", "onBackPressed", "", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Args", "Companion", "TransferFrequencyRow", "feature-transfers_externalRelease", "viewState", "Lcom/robinhood/android/transfers/ui/max/upsell/RecurringFrequencyUpsellViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class RecurringFrequencyUpsellFragment extends GenericComposeFragment implements RecurringFrequencyUpsellComposable, AutoLoggableFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final Screen eventScreen = new Screen(Screen.Name.RECURRING_DEPOSIT_UPSELL, null, null, null, 14, null);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, RecurringFrequencyUpsellDuxo.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(RecurringFrequencyUpsellFragment recurringFrequencyUpsellFragment, int i, Composer composer, int i2) {
        recurringFrequencyUpsellFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    private final RecurringFrequencyUpsellDuxo getDuxo() {
        return (RecurringFrequencyUpsellDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.transfers.p271ui.max.upsell.RecurringFrequencyUpsellComposable
    public void onContinueClicked(ApiCreateTransferRequest2 frequency) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        requireActivity().finish();
        Companion companion = INSTANCE;
        TransferConfiguration.RadHookWithFrequency radHookWithFrequency = new TransferConfiguration.RadHookWithFrequency(((Args) companion.getArgs((Fragment) this)).getAmount(), ((Args) companion.getArgs((Fragment) this)).getAchRelationshipId(), ((Args) companion.getArgs((Fragment) this)).getRhsAccountNumber(), ((Args) companion.getArgs((Fragment) this)).getSinkAccountType(), frequency, MAXTransferContext.EntryPoint.RECURRING_DEPOSIT_UPSELL);
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Intent flags = Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, new Transfer(radHookWithFrequency), null, false, 12, null).setFlags(268435456);
        Intrinsics.checkNotNullExpressionValue(flags, "setFlags(...)");
        startActivity(flags);
    }

    @Override // com.robinhood.android.transfers.p271ui.max.upsell.RecurringFrequencyUpsellComposable
    public void onBackClicked() {
        requireActivity().finish();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        requireActivity().finish();
        return true;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-605812436);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i : i;
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-605812436, i2, -1, "com.robinhood.android.transfers.ui.max.upsell.RecurringFrequencyUpsellFragment.ComposeContent (RecurringFrequencyUpsellFragment.kt:64)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            EnumEntries<TransferFrequencyRow> entries = TransferFrequencyRow.getEntries();
            ArrayList arrayList = new ArrayList();
            for (TransferFrequencyRow transferFrequencyRow : entries) {
                if (transferFrequencyRow.getFrequency() != ApiCreateTransferRequest2.ONCE) {
                    arrayList.add(transferFrequencyRow);
                }
            }
            RecurringFrequencyUpsellComposable2.RecurringFrequencyUpsellComposable(this, extensions2.toImmutableList(arrayList), ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle), WindowInsetsPadding6.windowInsetsPadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), WindowInsetsKt.m5186onlybOOhFvg(WindowInsets_androidKt.getSafeContent(WindowInsets.INSTANCE, composerStartRestartGroup, 6), WindowInsetsSides.INSTANCE.m5198getBottomJoeWqyM())), composerStartRestartGroup, i2 & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.max.upsell.RecurringFrequencyUpsellFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecurringFrequencyUpsellFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: RecurringFrequencyUpsellFragment.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/upsell/RecurringFrequencyUpsellFragment$Args;", "Landroid/os/Parcelable;", "amount", "Ljava/math/BigDecimal;", "achRelationshipId", "Ljava/util/UUID;", "rhsAccountNumber", "", "sinkAccountType", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "<init>", "(Ljava/math/BigDecimal;Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;)V", "getAmount", "()Ljava/math/BigDecimal;", "getAchRelationshipId", "()Ljava/util/UUID;", "getRhsAccountNumber", "()Ljava/lang/String;", "getSinkAccountType", "()Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID achRelationshipId;
        private final BigDecimal amount;
        private final String rhsAccountNumber;
        private final ApiTransferAccount.TransferAccountType sinkAccountType;

        /* compiled from: RecurringFrequencyUpsellFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((BigDecimal) parcel.readSerializable(), (UUID) parcel.readSerializable(), parcel.readString(), ApiTransferAccount.TransferAccountType.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, BigDecimal bigDecimal, UUID uuid, String str, ApiTransferAccount.TransferAccountType transferAccountType, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = args.amount;
            }
            if ((i & 2) != 0) {
                uuid = args.achRelationshipId;
            }
            if ((i & 4) != 0) {
                str = args.rhsAccountNumber;
            }
            if ((i & 8) != 0) {
                transferAccountType = args.sinkAccountType;
            }
            return args.copy(bigDecimal, uuid, str, transferAccountType);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getAmount() {
            return this.amount;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getAchRelationshipId() {
            return this.achRelationshipId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getRhsAccountNumber() {
            return this.rhsAccountNumber;
        }

        /* renamed from: component4, reason: from getter */
        public final ApiTransferAccount.TransferAccountType getSinkAccountType() {
            return this.sinkAccountType;
        }

        public final Args copy(BigDecimal amount, UUID achRelationshipId, String rhsAccountNumber, ApiTransferAccount.TransferAccountType sinkAccountType) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(achRelationshipId, "achRelationshipId");
            Intrinsics.checkNotNullParameter(sinkAccountType, "sinkAccountType");
            return new Args(amount, achRelationshipId, rhsAccountNumber, sinkAccountType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.amount, args.amount) && Intrinsics.areEqual(this.achRelationshipId, args.achRelationshipId) && Intrinsics.areEqual(this.rhsAccountNumber, args.rhsAccountNumber) && this.sinkAccountType == args.sinkAccountType;
        }

        public int hashCode() {
            int iHashCode = ((this.amount.hashCode() * 31) + this.achRelationshipId.hashCode()) * 31;
            String str = this.rhsAccountNumber;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.sinkAccountType.hashCode();
        }

        public String toString() {
            return "Args(amount=" + this.amount + ", achRelationshipId=" + this.achRelationshipId + ", rhsAccountNumber=" + this.rhsAccountNumber + ", sinkAccountType=" + this.sinkAccountType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.amount);
            dest.writeSerializable(this.achRelationshipId);
            dest.writeString(this.rhsAccountNumber);
            dest.writeString(this.sinkAccountType.name());
        }

        public Args(BigDecimal amount, UUID achRelationshipId, String str, ApiTransferAccount.TransferAccountType sinkAccountType) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(achRelationshipId, "achRelationshipId");
            Intrinsics.checkNotNullParameter(sinkAccountType, "sinkAccountType");
            this.amount = amount;
            this.achRelationshipId = achRelationshipId;
            this.rhsAccountNumber = str;
            this.sinkAccountType = sinkAccountType;
        }

        public final BigDecimal getAmount() {
            return this.amount;
        }

        public final UUID getAchRelationshipId() {
            return this.achRelationshipId;
        }

        public final String getRhsAccountNumber() {
            return this.rhsAccountNumber;
        }

        public final ApiTransferAccount.TransferAccountType getSinkAccountType() {
            return this.sinkAccountType;
        }
    }

    private static final RecurringFrequencyUpsellViewState ComposeContent$lambda$0(SnapshotState4<? extends RecurringFrequencyUpsellViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: RecurringFrequencyUpsellFragment.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/upsell/RecurringFrequencyUpsellFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/transfers/ui/max/upsell/RecurringFrequencyUpsellFragment;", "Lcom/robinhood/android/transfers/ui/max/upsell/RecurringFrequencyUpsellFragment$Args;", "<init>", "()V", "newInstance", "amount", "Ljava/math/BigDecimal;", "achRelationshipId", "Ljava/util/UUID;", "rhsAccountNumber", "", "sinkAccountType", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RecurringFrequencyUpsellFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RecurringFrequencyUpsellFragment recurringFrequencyUpsellFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, recurringFrequencyUpsellFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RecurringFrequencyUpsellFragment newInstance(Args args) {
            return (RecurringFrequencyUpsellFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RecurringFrequencyUpsellFragment recurringFrequencyUpsellFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, recurringFrequencyUpsellFragment, args);
        }

        public final RecurringFrequencyUpsellFragment newInstance(BigDecimal amount, UUID achRelationshipId, String rhsAccountNumber, ApiTransferAccount.TransferAccountType sinkAccountType) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(achRelationshipId, "achRelationshipId");
            Intrinsics.checkNotNullParameter(sinkAccountType, "sinkAccountType");
            return (RecurringFrequencyUpsellFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, new Args(amount, achRelationshipId, rhsAccountNumber, sinkAccountType));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RecurringFrequencyUpsellFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B/\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/upsell/RecurringFrequencyUpsellFragment$TransferFrequencyRow;", "", "frequency", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "title", "", "description", "explaination", "<init>", "(Ljava/lang/String;ILcom/robinhood/models/api/bonfire/TransferFrequency;III)V", "getFrequency", "()Lcom/robinhood/models/api/bonfire/TransferFrequency;", "getTitle", "()I", "getDescription", "getExplaination", "ONCE", "WEEKLY", "BIWEEKLY", "MONTHLY", "QUARTERLY", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TransferFrequencyRow {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TransferFrequencyRow[] $VALUES;
        private final int description;
        private final int explaination;
        private final ApiCreateTransferRequest2 frequency;
        private final int title;
        public static final TransferFrequencyRow ONCE = new TransferFrequencyRow("ONCE", 0, ApiCreateTransferRequest2.ONCE, C11595R.string.investment_schedule_frequency_daily, C11595R.string.equity_recurring_schedule_daily_subtitle, C30383R.string.ach_transfer_automatic_deposit_description_once);
        public static final TransferFrequencyRow WEEKLY = new TransferFrequencyRow("WEEKLY", 1, ApiCreateTransferRequest2.WEEKLY, C30383R.string.deposit_schedule_frequency_weekly, C8331R.string.automatic_deposit_frequency_weekly_description, C30383R.string.ach_transfer_automatic_deposit_description_week);
        public static final TransferFrequencyRow BIWEEKLY = new TransferFrequencyRow("BIWEEKLY", 2, ApiCreateTransferRequest2.BIWEEKLY, C30383R.string.deposit_schedule_frequency_two_months, C8331R.string.automatic_deposit_frequency_biweekly_description, C30383R.string.ach_transfer_automatic_deposit_description_two_weeks);
        public static final TransferFrequencyRow MONTHLY = new TransferFrequencyRow("MONTHLY", 3, ApiCreateTransferRequest2.MONTHLY, C30383R.string.deposit_schedule_frequency_monthly, C8331R.string.automatic_deposit_frequency_monthly_description, C30383R.string.ach_transfer_automatic_deposit_description_month);
        public static final TransferFrequencyRow QUARTERLY = new TransferFrequencyRow("QUARTERLY", 4, ApiCreateTransferRequest2.QUARTERLY, C30383R.string.deposit_schedule_frequency_quarterly, C8331R.string.automatic_deposit_frequency_quarterly_description, C30383R.string.ach_transfer_automatic_deposit_description_quarter);

        private static final /* synthetic */ TransferFrequencyRow[] $values() {
            return new TransferFrequencyRow[]{ONCE, WEEKLY, BIWEEKLY, MONTHLY, QUARTERLY};
        }

        public static EnumEntries<TransferFrequencyRow> getEntries() {
            return $ENTRIES;
        }

        private TransferFrequencyRow(String str, int i, ApiCreateTransferRequest2 apiCreateTransferRequest2, int i2, int i3, int i4) {
            this.frequency = apiCreateTransferRequest2;
            this.title = i2;
            this.description = i3;
            this.explaination = i4;
        }

        public final ApiCreateTransferRequest2 getFrequency() {
            return this.frequency;
        }

        public final int getTitle() {
            return this.title;
        }

        public final int getDescription() {
            return this.description;
        }

        public final int getExplaination() {
            return this.explaination;
        }

        static {
            TransferFrequencyRow[] transferFrequencyRowArr$values = $values();
            $VALUES = transferFrequencyRowArr$values;
            $ENTRIES = EnumEntries2.enumEntries(transferFrequencyRowArr$values);
        }

        public static TransferFrequencyRow valueOf(String str) {
            return (TransferFrequencyRow) Enum.valueOf(TransferFrequencyRow.class, str);
        }

        public static TransferFrequencyRow[] values() {
            return (TransferFrequencyRow[]) $VALUES.clone();
        }
    }
}
