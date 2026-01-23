package com.robinhood.android.slip.onboarding.agreements.updateagreement;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.DialogFragmentResolver;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SlipRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.slip.C28532R;
import com.robinhood.android.slip.onboarding.agreements.updateagreement.SlipUpdateAgreementBottomSheetFragment;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.compose.bento.component.BentoPogSize;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownSpannedText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.slip.SlipUpdatedAgreementsStore;
import com.robinhood.librobinhood.data.store.identi.UserAgreementsStore;
import com.robinhood.models.api.identi.ApiUserAgreement;
import com.robinhood.models.p355ui.UiUpdatedAgreementsResponse;
import com.robinhood.rosetta.eventlogging.AgreementContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.CompletablesAndroid;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import io.reactivex.Observable;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SlipUpdateAgreementBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 22\u00020\u00012\u00020\u0002:\u00012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u0012\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020#H\u0016J\r\u0010'\u001a\u00020#H\u0017¢\u0006\u0002\u0010(J\u0012\u0010)\u001a\u00020#2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0019H\u0002J\u0012\u0010*\u001a\u00020#2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0019H\u0002J\u0010\u0010+\u001a\u00020#2\u0006\u0010 \u001a\u00020!H\u0002J\t\u0010,\u001a\u00020\u001dH\u0096\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.X\u0096\u0005¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/agreements/updateagreement/SlipUpdateAgreementBottomSheetFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "slipUpdatedAgreementsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipUpdatedAgreementsStore;", "getSlipUpdatedAgreementsStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipUpdatedAgreementsStore;", "setSlipUpdatedAgreementsStore", "(Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipUpdatedAgreementsStore;)V", "userAgreementsStore", "Lcom/robinhood/librobinhood/data/store/identi/UserAgreementsStore;", "getUserAgreementsStore", "()Lcom/robinhood/librobinhood/data/store/identi/UserAgreementsStore;", "setUserAgreementsStore", "(Lcom/robinhood/librobinhood/data/store/identi/UserAgreementsStore;)V", "agreement", "Landroidx/compose/runtime/MutableState;", "Lcom/robinhood/models/ui/UiUpdatedAgreementsResponse$UpdatedAgreement;", "agreementRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "accepting", "", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "agreementId", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onAccept", "onDismiss", "logAppear", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class SlipUpdateAgreementBottomSheetFragment extends GenericComposeBottomSheetDialogFragment implements RegionGated {
    public static final String placeholderBody = "This is the placeholder body. It is about the same length";
    public static final String placeholderTitle = "This is the placeholder title. It is a few lines long";
    private final SnapshotState<Boolean> accepting;
    private final BehaviorRelay<UiUpdatedAgreementsResponse.UpdatedAgreement> agreementRelay;
    public EventLogger eventLogger;
    public SlipUpdatedAgreementsStore slipUpdatedAgreementsStore;
    public UserAgreementsStore userAgreementsStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SlipRegionGate.INSTANCE);
    private final SnapshotState<UiUpdatedAgreementsResponse.UpdatedAgreement> agreement = SnapshotState3.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3(SlipUpdateAgreementBottomSheetFragment slipUpdateAgreementBottomSheetFragment, int i, Composer composer, int i2) {
        slipUpdateAgreementBottomSheetFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    public SlipUpdateAgreementBottomSheetFragment() {
        BehaviorRelay<UiUpdatedAgreementsResponse.UpdatedAgreement> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.agreementRelay = behaviorRelayCreate;
        this.accepting = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    public final SlipUpdatedAgreementsStore getSlipUpdatedAgreementsStore() {
        SlipUpdatedAgreementsStore slipUpdatedAgreementsStore = this.slipUpdatedAgreementsStore;
        if (slipUpdatedAgreementsStore != null) {
            return slipUpdatedAgreementsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("slipUpdatedAgreementsStore");
        return null;
    }

    public final void setSlipUpdatedAgreementsStore(SlipUpdatedAgreementsStore slipUpdatedAgreementsStore) {
        Intrinsics.checkNotNullParameter(slipUpdatedAgreementsStore, "<set-?>");
        this.slipUpdatedAgreementsStore = slipUpdatedAgreementsStore;
    }

    public final UserAgreementsStore getUserAgreementsStore() {
        UserAgreementsStore userAgreementsStore = this.userAgreementsStore;
        if (userAgreementsStore != null) {
            return userAgreementsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userAgreementsStore");
        return null;
    }

    public final void setUserAgreementsStore(UserAgreementsStore userAgreementsStore) {
        Intrinsics.checkNotNullParameter(userAgreementsStore, "<set-?>");
        this.userAgreementsStore = userAgreementsStore;
    }

    private final Context eventContext(String agreementId) {
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new AgreementContext(agreementId, ((LegacyDialogFragmentKey.SlipUpdateAgreement) INSTANCE.getArgs((Fragment) this)).getSource(), null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1073741825, -1, -1, -1, -1, 16383, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(getSlipUpdatedAgreementsStore().forceFetchUpdatedAgreementsIfNotCached()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.slip.onboarding.agreements.updateagreement.SlipUpdateAgreementBottomSheetFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SlipUpdateAgreementBottomSheetFragment.onCreate$lambda$0(this.f$0, (Optional) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.slip.onboarding.agreements.updateagreement.SlipUpdateAgreementBottomSheetFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SlipUpdateAgreementBottomSheetFragment.onCreate$lambda$1(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(SlipUpdateAgreementBottomSheetFragment slipUpdateAgreementBottomSheetFragment, Optional optional) {
        List<UiUpdatedAgreementsResponse.UpdatedAgreement> updatedAgreements;
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        UiUpdatedAgreementsResponse uiUpdatedAgreementsResponse = (UiUpdatedAgreementsResponse) optional.component1();
        UiUpdatedAgreementsResponse.UpdatedAgreement updatedAgreement = (uiUpdatedAgreementsResponse == null || (updatedAgreements = uiUpdatedAgreementsResponse.getUpdatedAgreements()) == null) ? null : (UiUpdatedAgreementsResponse.UpdatedAgreement) CollectionsKt.firstOrNull((List) updatedAgreements);
        if (updatedAgreement != null) {
            slipUpdateAgreementBottomSheetFragment.agreement.setValue(updatedAgreement);
            slipUpdateAgreementBottomSheetFragment.agreementRelay.accept(updatedAgreement);
        } else {
            android.content.Context contextRequireContext = slipUpdateAgreementBottomSheetFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            RhDialogFragment.Builder builderSlipUpdateAgreementDialog = SlipUpdateAgreementActivity2.slipUpdateAgreementDialog(contextRequireContext);
            FragmentManager supportFragmentManager = slipUpdateAgreementBottomSheetFragment.requireActivity().getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(builderSlipUpdateAgreementDialog, supportFragmentManager, "slip-already-signed-agreements", false, 4, null);
            slipUpdateAgreementBottomSheetFragment.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* compiled from: SlipUpdateAgreementBottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.slip.onboarding.agreements.updateagreement.SlipUpdateAgreementBottomSheetFragment$ComposeContent$1 */
    static final class C286271 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ float $default;
        final /* synthetic */ float $medium;
        final /* synthetic */ float $small;

        C286271(float f, float f2, float f3) {
            this.$default = f;
            this.$small = f2;
            this.$medium = f3;
        }

        public final void invoke(Composer composer, int i) {
            Tuples2 tuples2M3642to;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1391482098, i, -1, "com.robinhood.android.slip.onboarding.agreements.updateagreement.SlipUpdateAgreementBottomSheetFragment.ComposeContent.<anonymous> (SlipUpdateAgreementBottomSheetFragment.kt:116)");
            }
            boolean z = SlipUpdateAgreementBottomSheetFragment.this.agreement.getValue() == null;
            UiUpdatedAgreementsResponse.UpdatedAgreement updatedAgreement = (UiUpdatedAgreementsResponse.UpdatedAgreement) SlipUpdateAgreementBottomSheetFragment.this.agreement.getValue();
            if (updatedAgreement == null || (tuples2M3642to = Tuples4.m3642to(updatedAgreement.getBottomSheetHeader(), updatedAgreement.getBottomSheetDescriptionMarkdown())) == null) {
                tuples2M3642to = Tuples4.m3642to(SlipUpdateAgreementBottomSheetFragment.placeholderTitle, SlipUpdateAgreementBottomSheetFragment.placeholderBody);
            }
            String str = (String) tuples2M3642to.component1();
            String str2 = (String) tuples2M3642to.component2();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            float f = this.$default;
            float f2 = this.$small;
            float f3 = this.$medium;
            final SlipUpdateAgreementBottomSheetFragment slipUpdateAgreementBottomSheetFragment = SlipUpdateAgreementBottomSheetFragment.this;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, f, 1, null);
            int i2 = C20690R.drawable.pict_mono_rds_list;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoPogKt.m20684BentoPictogramPogRhg8lNc(i2, modifierM5144paddingVpY3zN4$default, false, BentoPogSize.Hero, null, null, Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU()), composer, 3072, 52);
            boolean z2 = z;
            BentoText2.m20747BentoText38GnDrw(str, ModifiersKt.bentoPlaceholder$default(PaddingKt.m5143paddingVpY3zN4(companion, f, f2), z, null, 2, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getDisplayCapsuleMedium(), composer, 0, 0, 8124);
            BentoMarkdownSpannedText2.m21101BentoMarkdownSpannedTextTHkziT8(str2, column6.align(ModifiersKt.bentoPlaceholder$default(PaddingKt.m5143paddingVpY3zN4(companion, f, f2), z2, null, 2, null), companion2.getCenterHorizontally()), null, null, C20690R.attr.textAppearanceRegularMedium, 1, 0, 0, null, composer, 196608, 460);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, f3), composer, 0);
            Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f, 0.0f, 2, null);
            String string2 = slipUpdateAgreementBottomSheetFragment.getString(C11048R.string.general_action_agree);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            boolean z3 = z2 || ((Boolean) slipUpdateAgreementBottomSheetFragment.accepting.getValue()).booleanValue();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(slipUpdateAgreementBottomSheetFragment);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.slip.onboarding.agreements.updateagreement.SlipUpdateAgreementBottomSheetFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SlipUpdateAgreementBottomSheetFragment.C286271.invoke$lambda$5$lambda$2$lambda$1(slipUpdateAgreementBottomSheetFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, string2, modifierM5144paddingVpY3zN4$default2, null, null, false, z3, null, null, null, null, false, null, composer, 0, 0, 8120);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, f2), composer, 0);
            Modifier modifierM5144paddingVpY3zN4$default3 = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f, 0.0f, 2, null);
            String string3 = slipUpdateAgreementBottomSheetFragment.getString(C11048R.string.general_label_dismiss);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            BentoButtons.Type type2 = BentoButtons.Type.Secondary;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(slipUpdateAgreementBottomSheetFragment);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.slip.onboarding.agreements.updateagreement.SlipUpdateAgreementBottomSheetFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SlipUpdateAgreementBottomSheetFragment.C286271.invoke$lambda$5$lambda$4$lambda$3(slipUpdateAgreementBottomSheetFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, string3, modifierM5144paddingVpY3zN4$default3, null, type2, false, z2, null, null, null, null, false, null, composer, 24576, 0, 8104);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, f), composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$2$lambda$1(SlipUpdateAgreementBottomSheetFragment slipUpdateAgreementBottomSheetFragment) {
            slipUpdateAgreementBottomSheetFragment.onAccept((UiUpdatedAgreementsResponse.UpdatedAgreement) slipUpdateAgreementBottomSheetFragment.agreement.getValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4$lambda$3(SlipUpdateAgreementBottomSheetFragment slipUpdateAgreementBottomSheetFragment) {
            slipUpdateAgreementBottomSheetFragment.onDismiss((UiUpdatedAgreementsResponse.UpdatedAgreement) slipUpdateAgreementBottomSheetFragment.agreement.getValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(SlipUpdateAgreementBottomSheetFragment slipUpdateAgreementBottomSheetFragment, Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = slipUpdateAgreementBottomSheetFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, t, false, false, 0, null, 60, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Observable<UiUpdatedAgreementsResponse.UpdatedAgreement> observableTake = this.agreementRelay.take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.slip.onboarding.agreements.updateagreement.SlipUpdateAgreementBottomSheetFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SlipUpdateAgreementBottomSheetFragment.onStart$lambda$2(this.f$0, (UiUpdatedAgreementsResponse.UpdatedAgreement) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(SlipUpdateAgreementBottomSheetFragment slipUpdateAgreementBottomSheetFragment, UiUpdatedAgreementsResponse.UpdatedAgreement updatedAgreement) {
        slipUpdateAgreementBottomSheetFragment.logAppear(updatedAgreement.getAgreementId());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(72370490);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(72370490, i2, -1, "com.robinhood.android.slip.onboarding.agreements.updateagreement.SlipUpdateAgreementBottomSheetFragment.ComposeContent (SlipUpdateAgreementBottomSheetFragment.kt:111)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(1391482098, true, new C286271(bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 54), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.slip.onboarding.agreements.updateagreement.SlipUpdateAgreementBottomSheetFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SlipUpdateAgreementBottomSheetFragment.ComposeContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAccept(UiUpdatedAgreementsResponse.UpdatedAgreement agreement) {
        if (agreement == null) {
            dismiss();
            return;
        }
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.APPROVE, new Screen(Screen.Name.HOME, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, "accept", null, 4, null), new ComponentHierarchy(new Component(Component.ComponentType.BOTTOM_SHEET, "slip-updated-agreement", null, 4, null), null, null, null, null, 30, null), eventContext(agreement.getAgreementId()), false, 32, null);
        this.accepting.setValue(Boolean.TRUE);
        LifecycleHost.DefaultImpls.bind$default(this, CompletablesAndroid.observeOnMainThread(getUserAgreementsStore().agree(new ApiUserAgreement.Request(agreement.getAgreementType(), null, 2, null))), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.slip.onboarding.agreements.updateagreement.SlipUpdateAgreementBottomSheetFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SlipUpdateAgreementBottomSheetFragment.onAccept$lambda$4(this.f$0);
            }
        }, Fragments2.getActivityErrorHandler(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAccept$lambda$4(SlipUpdateAgreementBottomSheetFragment slipUpdateAgreementBottomSheetFragment) {
        slipUpdateAgreementBottomSheetFragment.getSlipUpdatedAgreementsStore().bustAgreementCache();
        RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
        Snackbars snackbars = Snackbars.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = slipUpdateAgreementBottomSheetFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        RdsSnackbar rdsSnackbarMake = companion.make(snackbars.findRoot(fragmentActivityRequireActivity), C28532R.string.slip_updated_agreements_accepted_success, 0);
        android.content.Context contextRequireContext = slipUpdateAgreementBottomSheetFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        rdsSnackbarMake.setLeadingIcon(Contexts7.getThemeDrawable(contextRequireContext, C20690R.attr.iconCheckmark16dp)).show();
        slipUpdateAgreementBottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDismiss(UiUpdatedAgreementsResponse.UpdatedAgreement agreement) {
        if (agreement == null) {
            dismiss();
            return;
        }
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.DISMISS, new Screen(Screen.Name.HOME, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, "dismiss", null, 4, null), new ComponentHierarchy(new Component(Component.ComponentType.BOTTOM_SHEET, "slip-updated-agreement", null, 4, null), null, null, null, null, 30, null), eventContext(agreement.getAgreementId()), false, 32, null);
        dismiss();
    }

    private final void logAppear(String agreementId) {
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, new Screen(Screen.Name.HOME, null, null, null, 14, null), new Component(Component.ComponentType.BOTTOM_SHEET, "slip-updated-agreement", null, 4, null), null, eventContext(agreementId), 9, null);
    }

    /* compiled from: SlipUpdateAgreementBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00030\u0004B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/agreements/updateagreement/SlipUpdateAgreementBottomSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/slip/onboarding/agreements/updateagreement/SlipUpdateAgreementBottomSheetFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$SlipUpdateAgreement;", "Lcom/robinhood/android/navigation/DialogFragmentResolver;", "<init>", "()V", "placeholderTitle", "", "placeholderBody", "createDialogFragment", "Landroidx/fragment/app/DialogFragment;", "key", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<SlipUpdateAgreementBottomSheetFragment, LegacyDialogFragmentKey.SlipUpdateAgreement>, DialogFragmentResolver<LegacyDialogFragmentKey.SlipUpdateAgreement> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyDialogFragmentKey.SlipUpdateAgreement getArgs(SlipUpdateAgreementBottomSheetFragment slipUpdateAgreementBottomSheetFragment) {
            return (LegacyDialogFragmentKey.SlipUpdateAgreement) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, slipUpdateAgreementBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SlipUpdateAgreementBottomSheetFragment newInstance(LegacyDialogFragmentKey.SlipUpdateAgreement slipUpdateAgreement) {
            return (SlipUpdateAgreementBottomSheetFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, slipUpdateAgreement);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SlipUpdateAgreementBottomSheetFragment slipUpdateAgreementBottomSheetFragment, LegacyDialogFragmentKey.SlipUpdateAgreement slipUpdateAgreement) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, slipUpdateAgreementBottomSheetFragment, slipUpdateAgreement);
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolver
        public DialogFragment createDialogFragment(LegacyDialogFragmentKey.SlipUpdateAgreement key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (DialogFragment) SlipUpdateAgreementBottomSheetFragment.INSTANCE.newInstance((Parcelable) key);
        }
    }
}
