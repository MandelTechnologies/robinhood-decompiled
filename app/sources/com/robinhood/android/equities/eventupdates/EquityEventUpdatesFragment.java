package com.robinhood.android.equities.eventupdates;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.paging.PagingData;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.equities.contracts.EquityEventUpdatesKey;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.arsenal.proto.p281v1.idl.EquityEventUpdateDto;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.models.card.p311db.Card;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import p479j$.time.Clock;

/* compiled from: EquityEventUpdatesFragment.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/equities/eventupdates/EquityEventUpdatesFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Lcom/robinhood/android/equities/eventupdates/EquityEventUpdatesScreenDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "getDuxo", "()Lcom/robinhood/android/equities/eventupdates/EquityEventUpdatesScreenDuxo;", "duxo", "j$/time/Clock", Card.Icon.CLOCK, "Lj$/time/Clock;", "getClock", "()Lj$/time/Clock;", "setClock", "(Lj$/time/Clock;)V", "", "toolbarVisible", "Z", "getToolbarVisible", "()Z", "Companion", "feature-equity-event-updates_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EquityEventUpdatesFragment extends GenericComposeFragment {
    public Clock clock;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, EquityEventUpdatesScreenDuxo.class);
    private final boolean toolbarVisible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(EquityEventUpdatesFragment equityEventUpdatesFragment, int i, Composer composer, int i2) {
        equityEventUpdatesFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private final EquityEventUpdatesScreenDuxo getDuxo() {
        return (EquityEventUpdatesScreenDuxo) this.duxo.getValue();
    }

    public final Clock getClock() {
        Clock clock = this.clock;
        if (clock != null) {
            return clock;
        }
        Intrinsics.throwUninitializedPropertyAccessException(Card.Icon.CLOCK);
        return null;
    }

    public final void setClock(Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "<set-?>");
        this.clock = clock;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(953963082);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(953963082, i2, -1, "com.robinhood.android.equities.eventupdates.EquityEventUpdatesFragment.ComposeContent (EquityEventUpdatesFragment.kt:22)");
            }
            Flow<PagingData<EquityEventUpdateDto>> pagingData = getDuxo().getPagingData();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.equities.eventupdates.EquityEventUpdatesFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EquityEventUpdatesFragment.ComposeContent$lambda$1$lambda$0(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EquityEventUpdatesScreenKt.EquityEventUpdatesScreen(pagingData, (Function0) objRememberedValue, getClock(), null, composerStartRestartGroup, 0, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.eventupdates.EquityEventUpdatesFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EquityEventUpdatesFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1$lambda$0(EquityEventUpdatesFragment equityEventUpdatesFragment) {
        equityEventUpdatesFragment.requireBaseActivity().onBackPressed();
        return Unit.INSTANCE;
    }

    /* compiled from: EquityEventUpdatesFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equities/eventupdates/EquityEventUpdatesFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/equities/eventupdates/EquityEventUpdatesFragment;", "Lcom/robinhood/android/equities/contracts/EquityEventUpdatesKey;", "<init>", "()V", "feature-equity-event-updates_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<EquityEventUpdatesFragment, EquityEventUpdatesKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(EquityEventUpdatesKey equityEventUpdatesKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, equityEventUpdatesKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public EquityEventUpdatesKey getArgs(EquityEventUpdatesFragment equityEventUpdatesFragment) {
            return (EquityEventUpdatesKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, equityEventUpdatesFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public EquityEventUpdatesFragment newInstance(EquityEventUpdatesKey equityEventUpdatesKey) {
            return (EquityEventUpdatesFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, equityEventUpdatesKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(EquityEventUpdatesFragment equityEventUpdatesFragment, EquityEventUpdatesKey equityEventUpdatesKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, equityEventUpdatesFragment, equityEventUpdatesKey);
        }
    }
}
