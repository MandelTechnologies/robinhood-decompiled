package com.robinhood.shared.crypto.acats.submitassets;

import android.content.res.Resources;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.os.Bundle2;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras2;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs;
import com.robinhood.android.navigation.compose.destination.ComposeNav;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.android.util.p275rx.AbsErrorHandler2;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.crypto.acats.AssetRowText;
import com.robinhood.shared.crypto.acats.C37511R;
import com.robinhood.shared.crypto.acats.MigrationSubmissionConfirmationDest;
import com.robinhood.shared.crypto.acats.MigrationSubmissionFailureDest;
import com.robinhood.shared.crypto.acats.MigrationSubmitAssetsDest;
import com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsComposable5;
import com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsDuxo2;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: MigrationSubmitAssetsComposable.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\u0012\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u008a\u0084\u0002²\u0006\f\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u008a\u008e\u0002"}, m3636d2 = {"MigrationSubmitAssetsComposable", "", "args", "Lcom/robinhood/shared/crypto/acats/MigrationSubmitAssetsDest$Args;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/crypto/acats/submitassets/MigrationSubmitAssetsDuxo;", "(Lcom/robinhood/shared/crypto/acats/MigrationSubmitAssetsDest$Args;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/crypto/acats/submitassets/MigrationSubmitAssetsDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-acats_externalRelease", "viewState", "Lcom/robinhood/shared/crypto/acats/submitassets/MigrationSubmitAssetsViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/crypto/acats/submitassets/MigrationSubmitAssetsEvent;", "retriableErrorMessage", "Lcom/robinhood/utils/resource/StringResource;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class MigrationSubmitAssetsComposable5 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MigrationSubmitAssetsComposable$lambda$11(MigrationSubmitAssetsDest.Args args, Modifier modifier, MigrationSubmitAssetsDuxo migrationSubmitAssetsDuxo, int i, int i2, Composer composer, int i3) {
        MigrationSubmitAssetsComposable(args, modifier, migrationSubmitAssetsDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MigrationSubmitAssetsComposable(final MigrationSubmitAssetsDest.Args args, Modifier modifier, MigrationSubmitAssetsDuxo migrationSubmitAssetsDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        MigrationSubmitAssetsDuxo migrationSubmitAssetsDuxo2;
        Composer composer2;
        int i4;
        final MigrationSubmitAssetsDuxo migrationSubmitAssetsDuxo3;
        final Modifier modifier3;
        final LifecycleAwareNavigator lifecycleAwareNavigator;
        Composer composer3;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        final AbsErrorHandler absErrorHandler;
        final Event<MigrationSubmitAssetsDuxo2> eventMigrationSubmitAssetsComposable$lambda$1;
        StringResource stringResourceMigrationSubmitAssetsComposable$lambda$3;
        MigrationSubmitAssetsDuxo migrationSubmitAssetsDuxo4;
        final MigrationSubmitAssetsDuxo migrationSubmitAssetsDuxo5;
        EventConsumer<MigrationSubmitAssetsDuxo2> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(args, "args");
        Composer composerStartRestartGroup = composer.startRestartGroup(-194214667);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(args) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    migrationSubmitAssetsDuxo2 = migrationSubmitAssetsDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(migrationSubmitAssetsDuxo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    migrationSubmitAssetsDuxo2 = migrationSubmitAssetsDuxo;
                }
                i3 |= i6;
            } else {
                migrationSubmitAssetsDuxo2 = migrationSubmitAssetsDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, args)));
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        composer2 = composerStartRestartGroup;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(MigrationSubmitAssetsDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composer2, 0, 0);
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsComposableKt$MigrationSubmitAssetsComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsComposableKt$MigrationSubmitAssetsComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer2, 0);
                        composer2.endReplaceGroup();
                        migrationSubmitAssetsDuxo3 = (MigrationSubmitAssetsDuxo) baseDuxo;
                        i4 = i3 & (-897);
                    } else {
                        composer2 = composerStartRestartGroup;
                        i4 = i3;
                        migrationSubmitAssetsDuxo3 = migrationSubmitAssetsDuxo2;
                    }
                    modifier3 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                    migrationSubmitAssetsDuxo3 = migrationSubmitAssetsDuxo2;
                    composer2 = composerStartRestartGroup;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-194214667, i4, -1, "com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsComposable (MigrationSubmitAssetsComposable.kt:65)");
                }
                lifecycleAwareNavigator = (LifecycleAwareNavigator) composer2.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                Composer composer4 = composer2;
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(migrationSubmitAssetsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer4.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, new Screen(Screen.Name.ACATS_CRYPTO_MIGRATION_FLOW_ASSET_SUBMIT, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-987953440, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsComposableKt.MigrationSubmitAssetsComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                        invoke(composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer5, int i7) {
                        if ((i7 & 3) == 2 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-987953440, i7, -1, "com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsComposable.<anonymous> (MigrationSubmitAssetsComposable.kt:74)");
                        }
                        final Modifier modifier5 = modifier3;
                        final MigrationSubmitAssetsDuxo migrationSubmitAssetsDuxo6 = migrationSubmitAssetsDuxo3;
                        final SnapshotState4<MigrationSubmitAssetsViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                        final LifecycleAwareNavigator lifecycleAwareNavigator2 = lifecycleAwareNavigator;
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-757343627, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsComposableKt.MigrationSubmitAssetsComposable.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                invoke(composer6, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer6, int i8) {
                                if ((i8 & 3) == 2 && composer6.getSkipping()) {
                                    composer6.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-757343627, i8, -1, "com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsComposable.<anonymous>.<anonymous> (MigrationSubmitAssetsComposable.kt:75)");
                                }
                                BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(ModifiersKt.logScreenTransitions$default(modifier5, null, 1, null), false, ComposableLambda3.rememberComposableLambda(-1037298006, true, new C506761(migrationSubmitAssetsDuxo6, snapshotState4), composer6, 54), ComposableLambda3.rememberComposableLambda(1577920861, true, new AnonymousClass2(snapshotState4, lifecycleAwareNavigator2), composer6, 54), composer6, 3504, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: MigrationSubmitAssetsComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsComposableKt$MigrationSubmitAssetsComposable$1$1$1, reason: invalid class name and collision with other inner class name */
                            static final class C506761 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                                final /* synthetic */ MigrationSubmitAssetsDuxo $duxo;
                                final /* synthetic */ SnapshotState4<MigrationSubmitAssetsViewState> $viewState$delegate;

                                C506761(MigrationSubmitAssetsDuxo migrationSubmitAssetsDuxo, SnapshotState4<MigrationSubmitAssetsViewState> snapshotState4) {
                                    this.$duxo = migrationSubmitAssetsDuxo;
                                    this.$viewState$delegate = snapshotState4;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
                                    invoke(bentoButtonBar3, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
                                    int i2;
                                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                    if ((i & 6) == 0) {
                                        i2 = ((i & 8) == 0 ? composer.changed(BentoButtonBarScreenLayout) : composer.changedInstance(BentoButtonBarScreenLayout) ? 4 : 2) | i;
                                    } else {
                                        i2 = i;
                                    }
                                    if ((i2 & 19) == 18 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1037298006, i2, -1, "com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsComposable.<anonymous>.<anonymous>.<anonymous> (MigrationSubmitAssetsComposable.kt:79)");
                                    }
                                    final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer, AutoLoggingCompositionLocals4.$stable);
                                    Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    composer.startReplaceGroup(-1633490746);
                                    boolean zChangedInstance = composer.changedInstance(current) | composer.changedInstance(this.$duxo);
                                    final MigrationSubmitAssetsDuxo migrationSubmitAssetsDuxo = this.$duxo;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsComposableKt$MigrationSubmitAssetsComposable$1$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return MigrationSubmitAssetsComposable5.C375951.AnonymousClass1.C506761.invoke$lambda$1$lambda$0(current, migrationSubmitAssetsDuxo);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    BentoButtonBarScreenLayout.PrimaryButtonOnly(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, (Function0) objRememberedValue, StringResources_androidKt.stringResource(C37511R.string.crypto_acats_label_submit_transfer, composer, 0), MigrationSubmitAssetsComposable5.MigrationSubmitAssetsComposable$lambda$0(this.$viewState$delegate).getLoading(), null, false, composer, (BentoButtonBar3.$stable << 21) | ((i2 << 21) & 29360128), 98);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, MigrationSubmitAssetsDuxo migrationSubmitAssetsDuxo) {
                                    EventLogger.DefaultImpls.logTap$default(eventLogger, null, null, new Component(Component.ComponentType.BUTTON, "submit_transfer", null, 4, null), null, null, false, 59, null);
                                    migrationSubmitAssetsDuxo.submitMigration();
                                    return Unit.INSTANCE;
                                }
                            }

                            /* compiled from: MigrationSubmitAssetsComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsComposableKt$MigrationSubmitAssetsComposable$1$1$2, reason: invalid class name */
                            static final class AnonymousClass2 implements Function3<BoxScope, Composer, Integer, Unit> {
                                final /* synthetic */ LifecycleAwareNavigator $navigator;
                                final /* synthetic */ SnapshotState4<MigrationSubmitAssetsViewState> $viewState$delegate;

                                AnonymousClass2(SnapshotState4<MigrationSubmitAssetsViewState> snapshotState4, LifecycleAwareNavigator lifecycleAwareNavigator) {
                                    this.$viewState$delegate = snapshotState4;
                                    this.$navigator = lifecycleAwareNavigator;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
                                    invoke(boxScope, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer, int i) {
                                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                    if ((i & 17) == 16 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1577920861, i, -1, "com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsComposable.<anonymous>.<anonymous>.<anonymous> (MigrationSubmitAssetsComposable.kt:96)");
                                    }
                                    Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
                                    composer.startReplaceGroup(-1633490746);
                                    boolean zChanged = composer.changed(this.$viewState$delegate) | composer.changed(this.$navigator);
                                    final SnapshotState4<MigrationSubmitAssetsViewState> snapshotState4 = this.$viewState$delegate;
                                    final LifecycleAwareNavigator lifecycleAwareNavigator = this.$navigator;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsComposableKt$MigrationSubmitAssetsComposable$1$1$2$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return MigrationSubmitAssetsComposable5.C375951.AnonymousClass1.AnonymousClass2.invoke$lambda$5$lambda$4(snapshotState4, lifecycleAwareNavigator, (LazyListScope) obj);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    LazyDslKt.LazyColumn(modifierM5144paddingVpY3zN4$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 510);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$5$lambda$4(SnapshotState4 snapshotState4, LifecycleAwareNavigator lifecycleAwareNavigator, LazyListScope LazyColumn) {
                                    Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                                    MigrationSubmitAssetsComposable migrationSubmitAssetsComposable = MigrationSubmitAssetsComposable.INSTANCE;
                                    LazyListScope.item$default(LazyColumn, null, null, migrationSubmitAssetsComposable.m24891getLambda$1159017998$feature_acats_externalRelease(), 3, null);
                                    if (MigrationSubmitAssetsComposable5.MigrationSubmitAssetsComposable$lambda$0(snapshotState4).getTransferableUsdRow() != null || MigrationSubmitAssetsComposable5.MigrationSubmitAssetsComposable$lambda$0(snapshotState4).getTransferableCryptoRow() != null) {
                                        LazyListScope.item$default(LazyColumn, null, null, migrationSubmitAssetsComposable.getLambda$1633681037$feature_acats_externalRelease(), 3, null);
                                        Tuples2<BentoBaseRowState, ImmutableList<AssetRowText>> transferableUsdRow = MigrationSubmitAssetsComposable5.MigrationSubmitAssetsComposable$lambda$0(snapshotState4).getTransferableUsdRow();
                                        if (transferableUsdRow != null) {
                                            final BentoBaseRowState bentoBaseRowStateComponent1 = transferableUsdRow.component1();
                                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1857785206, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsComposableKt$MigrationSubmitAssetsComposable$1$1$2$1$1$1$1
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                                    invoke(lazyItemScope, composer, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(LazyItemScope item, Composer composer, int i) {
                                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                                    if ((i & 17) == 16 && composer.getSkipping()) {
                                                        composer.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1857785206, i, -1, "com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MigrationSubmitAssetsComposable.kt:142)");
                                                    }
                                                    BentoBaseRowKt.m20915BentoBaseRowcd68TDI(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), bentoBaseRowStateComponent1, false, false, false, 0L, null, composer, (BentoBaseRowState.$stable << 3) | 6, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), 3, null);
                                        }
                                        Tuples2<BentoBaseRowState, ImmutableList<AssetRowText>> transferableCryptoRow = MigrationSubmitAssetsComposable5.MigrationSubmitAssetsComposable$lambda$0(snapshotState4).getTransferableCryptoRow();
                                        if (transferableCryptoRow != null) {
                                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(542136813, true, new MigrationSubmitAssetsComposable7(transferableCryptoRow.component1(), lifecycleAwareNavigator, transferableCryptoRow.component2())), 3, null);
                                        }
                                    }
                                    if (MigrationSubmitAssetsComposable5.MigrationSubmitAssetsComposable$lambda$0(snapshotState4).getNonTransferableCashRow() != null || MigrationSubmitAssetsComposable5.MigrationSubmitAssetsComposable$lambda$0(snapshotState4).getNonTransferableCryptoRow() != null) {
                                        LazyListScope.item$default(LazyColumn, null, null, migrationSubmitAssetsComposable.getLambda$176475972$feature_acats_externalRelease(), 3, null);
                                        Tuples2<BentoBaseRowState, ImmutableList<AssetRowText>> nonTransferableCashRow = MigrationSubmitAssetsComposable5.MigrationSubmitAssetsComposable$lambda$0(snapshotState4).getNonTransferableCashRow();
                                        if (nonTransferableCashRow != null) {
                                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(792217581, true, new MigrationSubmitAssetsComposable8(nonTransferableCashRow.component1(), lifecycleAwareNavigator, nonTransferableCashRow.component2())), 3, null);
                                        }
                                        Tuples2<BentoBaseRowState, ImmutableList<AssetRowText>> nonTransferableCryptoRow = MigrationSubmitAssetsComposable5.MigrationSubmitAssetsComposable$lambda$0(snapshotState4).getNonTransferableCryptoRow();
                                        if (nonTransferableCryptoRow != null) {
                                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-825503068, true, new MigrationSubmitAssetsComposable9(nonTransferableCryptoRow.component1(), lifecycleAwareNavigator, nonTransferableCryptoRow.component2())), 3, null);
                                        }
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        }, composer5, 54), composer5, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer4, 54), composer4, 48);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(migrationSubmitAssetsDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                composer3 = composer4;
                composer3.startReplaceGroup(1849434622);
                objRememberedValue = composer3.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composer3.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composer3.endReplaceGroup();
                absErrorHandler = (AbsErrorHandler) composer3.consume(AbsErrorHandler2.getLocalErrorHandler());
                eventMigrationSubmitAssetsComposable$lambda$1 = MigrationSubmitAssetsComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventMigrationSubmitAssetsComposable$lambda$1 != null && (eventMigrationSubmitAssetsComposable$lambda$1.getData() instanceof MigrationSubmitAssetsDuxo2) && (eventConsumerInvoke = eventMigrationSubmitAssetsComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventMigrationSubmitAssetsComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsComposableKt$MigrationSubmitAssetsComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Resources.NotFoundException {
                            m24893invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m24893invoke(Object it) throws Resources.NotFoundException {
                            Intrinsics.checkNotNullParameter(it, "it");
                            MigrationSubmitAssetsDuxo2 migrationSubmitAssetsDuxo22 = (MigrationSubmitAssetsDuxo2) eventMigrationSubmitAssetsComposable$lambda$1.getData();
                            if (migrationSubmitAssetsDuxo22 instanceof MigrationSubmitAssetsDuxo2.Error) {
                                AbsErrorHandler.handleError$default(absErrorHandler, ((MigrationSubmitAssetsDuxo2.Error) migrationSubmitAssetsDuxo22).getThrowable(), false, 2, null);
                                return;
                            }
                            if (migrationSubmitAssetsDuxo22 instanceof MigrationSubmitAssetsDuxo2.NavigateToConfirmation) {
                                LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, (ComposeNav) ComposableDestinationWithArgs.composeNav$default(MigrationSubmissionConfirmationDest.INSTANCE, new MigrationSubmissionConfirmationDest.Args(((MigrationSubmitAssetsDuxo2.NavigateToConfirmation) migrationSubmitAssetsDuxo22).getMigrationId()), null, null, 6, null), false, (Function1) null, 6, (Object) null);
                                return;
                            }
                            if (!(migrationSubmitAssetsDuxo22 instanceof MigrationSubmitAssetsDuxo2.RetriableError)) {
                                if (Intrinsics.areEqual(migrationSubmitAssetsDuxo22, MigrationSubmitAssetsDuxo2.NonRetriableError.INSTANCE)) {
                                    LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, (ComposeNav) ComposableDestinationWithArgs.composeNav$default(MigrationSubmissionFailureDest.INSTANCE, new MigrationSubmissionFailureDest.Args(MigrationSubmissionFailureDest.FailureType.TryAgain.INSTANCE), null, null, 6, null), false, (Function1) null, 6, (Object) null);
                                    return;
                                } else {
                                    if (!(migrationSubmitAssetsDuxo22 instanceof MigrationSubmitAssetsDuxo2.NonRetriableContactSupportError)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, (ComposeNav) ComposableDestinationWithArgs.composeNav$default(MigrationSubmissionFailureDest.INSTANCE, new MigrationSubmissionFailureDest.Args(new MigrationSubmissionFailureDest.FailureType.ContactSupport(((MigrationSubmitAssetsDuxo2.NonRetriableContactSupportError) migrationSubmitAssetsDuxo22).getDeeplink())), null, null, 6, null), false, (Function1) null, 6, (Object) null);
                                    return;
                                }
                            }
                            snapshotState.setValue(((MigrationSubmitAssetsDuxo2.RetriableError) migrationSubmitAssetsDuxo22).getErrorMessage());
                        }
                    });
                }
                stringResourceMigrationSubmitAssetsComposable$lambda$3 = MigrationSubmitAssetsComposable$lambda$3(snapshotState);
                if (stringResourceMigrationSubmitAssetsComposable$lambda$3 != null) {
                    migrationSubmitAssetsDuxo4 = migrationSubmitAssetsDuxo3;
                } else {
                    String strStringResource = StringResources_androidKt.stringResource(C37511R.string.crypto_acats_confirmation_fallback_error_title, composer3, 0);
                    BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources6.getTextAsString(stringResourceMigrationSubmitAssetsComposable$lambda$3, composer3, StringResource.$stable));
                    String strStringResource2 = StringResources_androidKt.stringResource(C37511R.string.crypto_acats_label_ok, composer3, 0);
                    composer3.startReplaceGroup(5004770);
                    Object objRememberedValue3 = composer3.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MigrationSubmitAssetsComposable5.MigrationSubmitAssetsComposable$lambda$10$lambda$7$lambda$6(snapshotState);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue3);
                    }
                    composer3.endReplaceGroup();
                    BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource2, (Function0) objRememberedValue3);
                    composer3.startReplaceGroup(5004770);
                    Object objRememberedValue4 = composer3.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MigrationSubmitAssetsComposable5.MigrationSubmitAssetsComposable$lambda$10$lambda$9$lambda$8(snapshotState);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue4);
                    }
                    composer3.endReplaceGroup();
                    migrationSubmitAssetsDuxo4 = migrationSubmitAssetsDuxo3;
                    BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton, null, null, null, false, null, (Function0) objRememberedValue4, composer3, (BentoAlertDialog2.Body.Text.$stable << 3) | 100663296 | (BentoAlertButton.$stable << 6), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                    composer3 = composer3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                migrationSubmitAssetsDuxo5 = migrationSubmitAssetsDuxo4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                migrationSubmitAssetsDuxo5 = migrationSubmitAssetsDuxo2;
                composer3 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MigrationSubmitAssetsComposable5.MigrationSubmitAssetsComposable$lambda$11(args, modifier3, migrationSubmitAssetsDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i3 & 147) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
                modifier3 = modifier4;
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                lifecycleAwareNavigator = (LifecycleAwareNavigator) composer2.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                Composer composer42 = composer2;
                final SnapshotState4<MigrationSubmitAssetsViewState> snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(migrationSubmitAssetsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer42.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, new Screen(Screen.Name.ACATS_CRYPTO_MIGRATION_FLOW_ASSET_SUBMIT, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-987953440, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsComposableKt.MigrationSubmitAssetsComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                        invoke(composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer5, int i7) {
                        if ((i7 & 3) == 2 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-987953440, i7, -1, "com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsComposable.<anonymous> (MigrationSubmitAssetsComposable.kt:74)");
                        }
                        final Modifier modifier5 = modifier3;
                        final MigrationSubmitAssetsDuxo migrationSubmitAssetsDuxo6 = migrationSubmitAssetsDuxo3;
                        final SnapshotState4<MigrationSubmitAssetsViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle3;
                        final LifecycleAwareNavigator lifecycleAwareNavigator2 = lifecycleAwareNavigator;
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-757343627, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsComposableKt.MigrationSubmitAssetsComposable.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                invoke(composer6, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer6, int i8) {
                                if ((i8 & 3) == 2 && composer6.getSkipping()) {
                                    composer6.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-757343627, i8, -1, "com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsComposable.<anonymous>.<anonymous> (MigrationSubmitAssetsComposable.kt:75)");
                                }
                                BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(ModifiersKt.logScreenTransitions$default(modifier5, null, 1, null), false, ComposableLambda3.rememberComposableLambda(-1037298006, true, new C506761(migrationSubmitAssetsDuxo6, snapshotState4), composer6, 54), ComposableLambda3.rememberComposableLambda(1577920861, true, new AnonymousClass2(snapshotState4, lifecycleAwareNavigator2), composer6, 54), composer6, 3504, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: MigrationSubmitAssetsComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsComposableKt$MigrationSubmitAssetsComposable$1$1$1, reason: invalid class name and collision with other inner class name */
                            static final class C506761 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                                final /* synthetic */ MigrationSubmitAssetsDuxo $duxo;
                                final /* synthetic */ SnapshotState4<MigrationSubmitAssetsViewState> $viewState$delegate;

                                C506761(MigrationSubmitAssetsDuxo migrationSubmitAssetsDuxo, SnapshotState4<MigrationSubmitAssetsViewState> snapshotState4) {
                                    this.$duxo = migrationSubmitAssetsDuxo;
                                    this.$viewState$delegate = snapshotState4;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
                                    invoke(bentoButtonBar3, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
                                    int i2;
                                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                    if ((i & 6) == 0) {
                                        i2 = ((i & 8) == 0 ? composer.changed(BentoButtonBarScreenLayout) : composer.changedInstance(BentoButtonBarScreenLayout) ? 4 : 2) | i;
                                    } else {
                                        i2 = i;
                                    }
                                    if ((i2 & 19) == 18 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1037298006, i2, -1, "com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsComposable.<anonymous>.<anonymous>.<anonymous> (MigrationSubmitAssetsComposable.kt:79)");
                                    }
                                    final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer, AutoLoggingCompositionLocals4.$stable);
                                    Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    composer.startReplaceGroup(-1633490746);
                                    boolean zChangedInstance = composer.changedInstance(current) | composer.changedInstance(this.$duxo);
                                    final MigrationSubmitAssetsDuxo migrationSubmitAssetsDuxo = this.$duxo;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsComposableKt$MigrationSubmitAssetsComposable$1$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return MigrationSubmitAssetsComposable5.C375951.AnonymousClass1.C506761.invoke$lambda$1$lambda$0(current, migrationSubmitAssetsDuxo);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    BentoButtonBarScreenLayout.PrimaryButtonOnly(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, (Function0) objRememberedValue, StringResources_androidKt.stringResource(C37511R.string.crypto_acats_label_submit_transfer, composer, 0), MigrationSubmitAssetsComposable5.MigrationSubmitAssetsComposable$lambda$0(this.$viewState$delegate).getLoading(), null, false, composer, (BentoButtonBar3.$stable << 21) | ((i2 << 21) & 29360128), 98);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, MigrationSubmitAssetsDuxo migrationSubmitAssetsDuxo) {
                                    EventLogger.DefaultImpls.logTap$default(eventLogger, null, null, new Component(Component.ComponentType.BUTTON, "submit_transfer", null, 4, null), null, null, false, 59, null);
                                    migrationSubmitAssetsDuxo.submitMigration();
                                    return Unit.INSTANCE;
                                }
                            }

                            /* compiled from: MigrationSubmitAssetsComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsComposableKt$MigrationSubmitAssetsComposable$1$1$2, reason: invalid class name */
                            static final class AnonymousClass2 implements Function3<BoxScope, Composer, Integer, Unit> {
                                final /* synthetic */ LifecycleAwareNavigator $navigator;
                                final /* synthetic */ SnapshotState4<MigrationSubmitAssetsViewState> $viewState$delegate;

                                AnonymousClass2(SnapshotState4<MigrationSubmitAssetsViewState> snapshotState4, LifecycleAwareNavigator lifecycleAwareNavigator) {
                                    this.$viewState$delegate = snapshotState4;
                                    this.$navigator = lifecycleAwareNavigator;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
                                    invoke(boxScope, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer, int i) {
                                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                    if ((i & 17) == 16 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1577920861, i, -1, "com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsComposable.<anonymous>.<anonymous>.<anonymous> (MigrationSubmitAssetsComposable.kt:96)");
                                    }
                                    Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
                                    composer.startReplaceGroup(-1633490746);
                                    boolean zChanged = composer.changed(this.$viewState$delegate) | composer.changed(this.$navigator);
                                    final SnapshotState4 snapshotState4 = this.$viewState$delegate;
                                    final LifecycleAwareNavigator lifecycleAwareNavigator = this.$navigator;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsComposableKt$MigrationSubmitAssetsComposable$1$1$2$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return MigrationSubmitAssetsComposable5.C375951.AnonymousClass1.AnonymousClass2.invoke$lambda$5$lambda$4(snapshotState4, lifecycleAwareNavigator, (LazyListScope) obj);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    LazyDslKt.LazyColumn(modifierM5144paddingVpY3zN4$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 510);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$5$lambda$4(SnapshotState4 snapshotState4, LifecycleAwareNavigator lifecycleAwareNavigator, LazyListScope LazyColumn) {
                                    Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                                    MigrationSubmitAssetsComposable migrationSubmitAssetsComposable = MigrationSubmitAssetsComposable.INSTANCE;
                                    LazyListScope.item$default(LazyColumn, null, null, migrationSubmitAssetsComposable.m24891getLambda$1159017998$feature_acats_externalRelease(), 3, null);
                                    if (MigrationSubmitAssetsComposable5.MigrationSubmitAssetsComposable$lambda$0(snapshotState4).getTransferableUsdRow() != null || MigrationSubmitAssetsComposable5.MigrationSubmitAssetsComposable$lambda$0(snapshotState4).getTransferableCryptoRow() != null) {
                                        LazyListScope.item$default(LazyColumn, null, null, migrationSubmitAssetsComposable.getLambda$1633681037$feature_acats_externalRelease(), 3, null);
                                        Tuples2<BentoBaseRowState, ImmutableList<AssetRowText>> transferableUsdRow = MigrationSubmitAssetsComposable5.MigrationSubmitAssetsComposable$lambda$0(snapshotState4).getTransferableUsdRow();
                                        if (transferableUsdRow != null) {
                                            final BentoBaseRowState bentoBaseRowStateComponent1 = transferableUsdRow.component1();
                                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1857785206, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsComposableKt$MigrationSubmitAssetsComposable$1$1$2$1$1$1$1
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                                    invoke(lazyItemScope, composer, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(LazyItemScope item, Composer composer, int i) {
                                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                                    if ((i & 17) == 16 && composer.getSkipping()) {
                                                        composer.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1857785206, i, -1, "com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MigrationSubmitAssetsComposable.kt:142)");
                                                    }
                                                    BentoBaseRowKt.m20915BentoBaseRowcd68TDI(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), bentoBaseRowStateComponent1, false, false, false, 0L, null, composer, (BentoBaseRowState.$stable << 3) | 6, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), 3, null);
                                        }
                                        Tuples2<BentoBaseRowState, ImmutableList<AssetRowText>> transferableCryptoRow = MigrationSubmitAssetsComposable5.MigrationSubmitAssetsComposable$lambda$0(snapshotState4).getTransferableCryptoRow();
                                        if (transferableCryptoRow != null) {
                                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(542136813, true, new MigrationSubmitAssetsComposable7(transferableCryptoRow.component1(), lifecycleAwareNavigator, transferableCryptoRow.component2())), 3, null);
                                        }
                                    }
                                    if (MigrationSubmitAssetsComposable5.MigrationSubmitAssetsComposable$lambda$0(snapshotState4).getNonTransferableCashRow() != null || MigrationSubmitAssetsComposable5.MigrationSubmitAssetsComposable$lambda$0(snapshotState4).getNonTransferableCryptoRow() != null) {
                                        LazyListScope.item$default(LazyColumn, null, null, migrationSubmitAssetsComposable.getLambda$176475972$feature_acats_externalRelease(), 3, null);
                                        Tuples2<BentoBaseRowState, ImmutableList<AssetRowText>> nonTransferableCashRow = MigrationSubmitAssetsComposable5.MigrationSubmitAssetsComposable$lambda$0(snapshotState4).getNonTransferableCashRow();
                                        if (nonTransferableCashRow != null) {
                                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(792217581, true, new MigrationSubmitAssetsComposable8(nonTransferableCashRow.component1(), lifecycleAwareNavigator, nonTransferableCashRow.component2())), 3, null);
                                        }
                                        Tuples2<BentoBaseRowState, ImmutableList<AssetRowText>> nonTransferableCryptoRow = MigrationSubmitAssetsComposable5.MigrationSubmitAssetsComposable$lambda$0(snapshotState4).getNonTransferableCryptoRow();
                                        if (nonTransferableCryptoRow != null) {
                                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-825503068, true, new MigrationSubmitAssetsComposable9(nonTransferableCryptoRow.component1(), lifecycleAwareNavigator, nonTransferableCryptoRow.component2())), 3, null);
                                        }
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        }, composer5, 54), composer5, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer42, 54), composer42, 48);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(migrationSubmitAssetsDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                composer3 = composer42;
                composer3.startReplaceGroup(1849434622);
                objRememberedValue = composer3.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composer3.endReplaceGroup();
                absErrorHandler = (AbsErrorHandler) composer3.consume(AbsErrorHandler2.getLocalErrorHandler());
                eventMigrationSubmitAssetsComposable$lambda$1 = MigrationSubmitAssetsComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventMigrationSubmitAssetsComposable$lambda$1 != null) {
                    eventConsumerInvoke.consume(eventMigrationSubmitAssetsComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsComposableKt$MigrationSubmitAssetsComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Resources.NotFoundException {
                            m24893invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m24893invoke(Object it) throws Resources.NotFoundException {
                            Intrinsics.checkNotNullParameter(it, "it");
                            MigrationSubmitAssetsDuxo2 migrationSubmitAssetsDuxo22 = (MigrationSubmitAssetsDuxo2) eventMigrationSubmitAssetsComposable$lambda$1.getData();
                            if (migrationSubmitAssetsDuxo22 instanceof MigrationSubmitAssetsDuxo2.Error) {
                                AbsErrorHandler.handleError$default(absErrorHandler, ((MigrationSubmitAssetsDuxo2.Error) migrationSubmitAssetsDuxo22).getThrowable(), false, 2, null);
                                return;
                            }
                            if (migrationSubmitAssetsDuxo22 instanceof MigrationSubmitAssetsDuxo2.NavigateToConfirmation) {
                                LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, (ComposeNav) ComposableDestinationWithArgs.composeNav$default(MigrationSubmissionConfirmationDest.INSTANCE, new MigrationSubmissionConfirmationDest.Args(((MigrationSubmitAssetsDuxo2.NavigateToConfirmation) migrationSubmitAssetsDuxo22).getMigrationId()), null, null, 6, null), false, (Function1) null, 6, (Object) null);
                                return;
                            }
                            if (!(migrationSubmitAssetsDuxo22 instanceof MigrationSubmitAssetsDuxo2.RetriableError)) {
                                if (Intrinsics.areEqual(migrationSubmitAssetsDuxo22, MigrationSubmitAssetsDuxo2.NonRetriableError.INSTANCE)) {
                                    LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, (ComposeNav) ComposableDestinationWithArgs.composeNav$default(MigrationSubmissionFailureDest.INSTANCE, new MigrationSubmissionFailureDest.Args(MigrationSubmissionFailureDest.FailureType.TryAgain.INSTANCE), null, null, 6, null), false, (Function1) null, 6, (Object) null);
                                    return;
                                } else {
                                    if (!(migrationSubmitAssetsDuxo22 instanceof MigrationSubmitAssetsDuxo2.NonRetriableContactSupportError)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, (ComposeNav) ComposableDestinationWithArgs.composeNav$default(MigrationSubmissionFailureDest.INSTANCE, new MigrationSubmissionFailureDest.Args(new MigrationSubmissionFailureDest.FailureType.ContactSupport(((MigrationSubmitAssetsDuxo2.NonRetriableContactSupportError) migrationSubmitAssetsDuxo22).getDeeplink())), null, null, 6, null), false, (Function1) null, 6, (Object) null);
                                    return;
                                }
                            }
                            snapshotState.setValue(((MigrationSubmitAssetsDuxo2.RetriableError) migrationSubmitAssetsDuxo22).getErrorMessage());
                        }
                    });
                }
                stringResourceMigrationSubmitAssetsComposable$lambda$3 = MigrationSubmitAssetsComposable$lambda$3(snapshotState);
                if (stringResourceMigrationSubmitAssetsComposable$lambda$3 != null) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                migrationSubmitAssetsDuxo5 = migrationSubmitAssetsDuxo4;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MigrationSubmitAssetsViewState MigrationSubmitAssetsComposable$lambda$0(SnapshotState4<MigrationSubmitAssetsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<MigrationSubmitAssetsDuxo2> MigrationSubmitAssetsComposable$lambda$1(SnapshotState4<Event<MigrationSubmitAssetsDuxo2>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final StringResource MigrationSubmitAssetsComposable$lambda$3(SnapshotState<StringResource> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MigrationSubmitAssetsComposable$lambda$10$lambda$7$lambda$6(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MigrationSubmitAssetsComposable$lambda$10$lambda$9$lambda$8(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }
}
