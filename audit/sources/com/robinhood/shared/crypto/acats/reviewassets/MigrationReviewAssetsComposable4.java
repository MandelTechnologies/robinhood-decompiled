package com.robinhood.shared.crypto.acats.reviewassets;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.animation.AnimationModifier;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.LinkAnnotation;
import androidx.compose.p011ui.text.LinkInteractionListener;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
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
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.BentoTextButton3;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.util.AnnotatedStringResource;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.crypto.acats.C37511R;
import com.robinhood.shared.crypto.acats.MigrationErrorHandler;
import com.robinhood.shared.crypto.acats.MigrationSubmitAssetsDest;
import com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposable4;
import com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsDuxo2;
import crypto_portkey.service.p443v1.ProcessMigrationAuthedResponseDto;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: MigrationReviewAssetsComposable.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\u0012\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\u0010\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u008a\u0084\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\n\u0010\u001a\u001a\u00020\u001bX\u008a\u0084\u0002"}, m3636d2 = {"MigrationReviewAssetsComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/crypto/acats/reviewassets/MigrationReviewAssetsDuxo;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/crypto/acats/reviewassets/MigrationReviewAssetsDuxo;Landroidx/compose/runtime/Composer;II)V", "AssetListSection", "state", "Lcom/robinhood/shared/crypto/acats/reviewassets/AssetListSectionState;", "(Lcom/robinhood/shared/crypto/acats/reviewassets/AssetListSectionState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AssetListSectionPreviewDay", "(Landroidx/compose/runtime/Composer;I)V", "feature-acats_externalRelease", "viewState", "Lcom/robinhood/shared/crypto/acats/reviewassets/MigrationReviewAssetsViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/crypto/acats/reviewassets/MigrationReviewAssetsEvent;", "isExpanded", "", "displayedRows", "", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState;", "buttonText", "", "buttonIcon", "Lcom/robinhood/compose/bento/component/BentoTextButtons$Icon$Size12;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class MigrationReviewAssetsComposable4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssetListSection$lambda$23(AssetListSectionState assetListSectionState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AssetListSection(assetListSectionState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssetListSectionPreviewDay$lambda$24(int i, Composer composer, int i2) {
        AssetListSectionPreviewDay(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MigrationReviewAssetsComposable$lambda$3(Modifier modifier, MigrationReviewAssetsDuxo migrationReviewAssetsDuxo, int i, int i2, Composer composer, int i3) {
        MigrationReviewAssetsComposable(modifier, migrationReviewAssetsDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MigrationReviewAssetsComposable(Modifier modifier, MigrationReviewAssetsDuxo migrationReviewAssetsDuxo, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final MigrationReviewAssetsDuxo migrationReviewAssetsDuxo2;
        final Modifier modifier3;
        CreationExtras defaultViewModelCreationExtras;
        final MigrationReviewAssetsDuxo migrationReviewAssetsDuxo3;
        final MigrationErrorHandler migrationErrorHandler;
        final Event<MigrationReviewAssetsDuxo2> eventMigrationReviewAssetsComposable$lambda$1;
        EventConsumer<MigrationReviewAssetsDuxo2> eventConsumerInvoke;
        Composer composerStartRestartGroup = composer.startRestartGroup(1423235046);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                migrationReviewAssetsDuxo2 = migrationReviewAssetsDuxo;
                int i5 = composerStartRestartGroup.changedInstance(migrationReviewAssetsDuxo2) ? 32 : 16;
                i3 |= i5;
            } else {
                migrationReviewAssetsDuxo2 = migrationReviewAssetsDuxo;
            }
            i3 |= i5;
        } else {
            migrationReviewAssetsDuxo2 = migrationReviewAssetsDuxo;
        }
        int i6 = i3;
        if ((i6 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i6 &= -113;
                }
                modifier3 = modifier2;
            } else {
                modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    if (current instanceof HasDefaultViewModelProviderFactory) {
                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                    }
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(MigrationReviewAssetsDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposableKt$MigrationReviewAssetsComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposableKt$MigrationReviewAssetsComposable$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    i6 &= -113;
                    migrationReviewAssetsDuxo3 = (MigrationReviewAssetsDuxo) baseDuxo;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1423235046, i6, -1, "com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposable (MigrationReviewAssetsComposable.kt:68)");
                }
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(migrationReviewAssetsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, new Screen(Screen.Name.ACATS_CRYPTO_MIGRATION_FLOW_ASSET_REVIEW, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-1649438949, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposableKt.MigrationReviewAssetsComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1649438949, i7, -1, "com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposable.<anonymous> (MigrationReviewAssetsComposable.kt:76)");
                        }
                        final Modifier modifier4 = modifier3;
                        final SnapshotState4<MigrationReviewAssetsViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                        final MigrationReviewAssetsDuxo migrationReviewAssetsDuxo4 = migrationReviewAssetsDuxo3;
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-259648922, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposableKt.MigrationReviewAssetsComposable.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i8) {
                                if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-259648922, i8, -1, "com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposable.<anonymous>.<anonymous> (MigrationReviewAssetsComposable.kt:77)");
                                }
                                BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(ModifiersKt.logScreenTransitions$default(modifier4, null, 1, null), false, ComposableLambda3.rememberComposableLambda(1869891857, true, new C506751(snapshotState4, migrationReviewAssetsDuxo4), composer3, 54), ComposableLambda3.rememberComposableLambda(1546195582, true, new AnonymousClass2(snapshotState4), composer3, 54), composer3, 3504, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: MigrationReviewAssetsComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposableKt$MigrationReviewAssetsComposable$1$1$1, reason: invalid class name and collision with other inner class name */
                            static final class C506751 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                                final /* synthetic */ MigrationReviewAssetsDuxo $duxo;
                                final /* synthetic */ SnapshotState4<MigrationReviewAssetsViewState> $viewState$delegate;

                                C506751(SnapshotState4<MigrationReviewAssetsViewState> snapshotState4, MigrationReviewAssetsDuxo migrationReviewAssetsDuxo) {
                                    this.$viewState$delegate = snapshotState4;
                                    this.$duxo = migrationReviewAssetsDuxo;
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
                                        ComposerKt.traceEventStart(1869891857, i2, -1, "com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposable.<anonymous>.<anonymous>.<anonymous> (MigrationReviewAssetsComposable.kt:81)");
                                    }
                                    final LifecycleAwareNavigator lifecycleAwareNavigator = (LifecycleAwareNavigator) composer.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                                    final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer, AutoLoggingCompositionLocals4.$stable);
                                    Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    composer.startReplaceGroup(-1224400529);
                                    boolean zChangedInstance = composer.changedInstance(current) | composer.changed(lifecycleAwareNavigator) | composer.changed(this.$viewState$delegate) | composer.changedInstance(this.$duxo);
                                    final MigrationReviewAssetsDuxo migrationReviewAssetsDuxo = this.$duxo;
                                    final SnapshotState4<MigrationReviewAssetsViewState> snapshotState4 = this.$viewState$delegate;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposableKt$MigrationReviewAssetsComposable$1$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return MigrationReviewAssetsComposable4.C375791.AnonymousClass1.C506751.invoke$lambda$1$lambda$0(current, lifecycleAwareNavigator, migrationReviewAssetsDuxo, snapshotState4);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    BentoButtonBarScreenLayout.PrimaryButtonOnly(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, (Function0) objRememberedValue, StringResources_androidKt.stringResource(C37511R.string.crypto_acats_label_continue, composer, 0), MigrationReviewAssetsComposable4.MigrationReviewAssetsComposable$lambda$0(this.$viewState$delegate).isLoading(), null, MigrationReviewAssetsComposable4.MigrationReviewAssetsComposable$lambda$0(this.$viewState$delegate).getEnabled(), composer, (BentoButtonBar3.$stable << 21) | ((i2 << 21) & 29360128), 34);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, LifecycleAwareNavigator lifecycleAwareNavigator, MigrationReviewAssetsDuxo migrationReviewAssetsDuxo, SnapshotState4 snapshotState4) throws Resources.NotFoundException {
                                    EventLogger.DefaultImpls.logTap$default(eventLogger, null, null, new Component(Component.ComponentType.BUTTON, "continue", null, 4, null), null, null, false, 59, null);
                                    MigrationSubmitAssetsDest migrationSubmitAssetsDest = MigrationSubmitAssetsDest.INSTANCE;
                                    ProcessMigrationAuthedResponseDto migrationResponse = MigrationReviewAssetsComposable4.MigrationReviewAssetsComposable$lambda$0(snapshotState4).getMigrationResponse();
                                    if (migrationResponse != null) {
                                        LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, (ComposeNav) ComposableDestinationWithArgs.composeNav$default(migrationSubmitAssetsDest, new MigrationSubmitAssetsDest.Args(migrationResponse, migrationReviewAssetsDuxo.getRefId()), null, null, 6, null), false, (Function1) null, 6, (Object) null);
                                        return Unit.INSTANCE;
                                    }
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                            }

                            /* compiled from: MigrationReviewAssetsComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposableKt$MigrationReviewAssetsComposable$1$1$2, reason: invalid class name */
                            static final class AnonymousClass2 implements Function3<BoxScope, Composer, Integer, Unit> {
                                final /* synthetic */ SnapshotState4<MigrationReviewAssetsViewState> $viewState$delegate;

                                AnonymousClass2(SnapshotState4<MigrationReviewAssetsViewState> snapshotState4) {
                                    this.$viewState$delegate = snapshotState4;
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
                                        ComposerKt.traceEventStart(1546195582, i, -1, "com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposable.<anonymous>.<anonymous>.<anonymous> (MigrationReviewAssetsComposable.kt:107)");
                                    }
                                    final Navigator navigator = (Navigator) composer.consume(LocalNavigator.getLocalNavigator());
                                    final Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i2 = BentoTheme.$stable;
                                    Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxSize$default, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 1, null);
                                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM());
                                    composer.startReplaceGroup(-1746271574);
                                    boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(context) | composer.changed(this.$viewState$delegate);
                                    final SnapshotState4<MigrationReviewAssetsViewState> snapshotState4 = this.$viewState$delegate;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposableKt$MigrationReviewAssetsComposable$1$1$2$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return MigrationReviewAssetsComposable4.C375791.AnonymousClass1.AnonymousClass2.invoke$lambda$2$lambda$1(navigator, context, snapshotState4, (LazyListScope) obj);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    LazyDslKt.LazyColumn(modifierM5144paddingVpY3zN4$default, null, null, false, horizontalOrVerticalM5089spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, composer, 0, 494);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$2$lambda$1(final Navigator navigator, final Context context, final SnapshotState4 snapshotState4, LazyListScope LazyColumn) {
                                    Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                                    LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-787175223, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposableKt$MigrationReviewAssetsComposable$1$1$2$1$1$1
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
                                                ComposerKt.traceEventStart(-787175223, i, -1, "com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MigrationReviewAssetsComposable.kt:116)");
                                            }
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null);
                                            String strStringResource = StringResources_androidKt.stringResource(C37511R.string.crypto_acats_migration_assets_list_title, composer, 0);
                                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                            int i2 = BentoTheme.$stable;
                                            TextStyle displayCapsuleSmall = bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall();
                                            TextAlign.Companion companion2 = TextAlign.INSTANCE;
                                            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, null, null, null, TextAlign.m7912boximpl(companion2.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleSmall, composer, 0, 0, 8124);
                                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), composer, 0);
                                            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2 = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null);
                                            int i3 = C37511R.string.crypto_acats_migration_assets_list_subtitle;
                                            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                                            composer.startReplaceGroup(-1633490746);
                                            boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(context);
                                            final Navigator navigator2 = navigator;
                                            final Context context2 = context;
                                            Object objRememberedValue = composer.rememberedValue();
                                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new LinkInteractionListener() { // from class: com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposableKt$MigrationReviewAssetsComposable$1$1$2$1$1$1$1$1
                                                    @Override // androidx.compose.p011ui.text.LinkInteractionListener
                                                    public final void onClick(LinkAnnotation it) {
                                                        Intrinsics.checkNotNullParameter(it, "it");
                                                        Navigators3.showHelpCenterWebViewFragment(navigator2, context2, "https://robinhood.com/us/en/support/articles/transfer-your-assets-from-Bitstamp/#Whichassetsareeligible");
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue);
                                            }
                                            composer.endReplaceGroup();
                                            BentoText2.m20748BentoTextQnj7Zds(AnnotatedStringResource.m22062annotatedStringResourceV2eopBjH0(i3, jM21425getFg0d7_KjU, 0L, (LinkInteractionListener) objRememberedValue, composer, 0, 4), modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2, null, null, null, null, TextAlign.m7912boximpl(companion2.m7919getCentere0LSkKk()), 0, false, 0, 0, null, null, null, composer, 0, 0, 16316);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }), 3, null);
                                    final ImmutableList<AssetListSectionState> assetListSections = MigrationReviewAssetsComposable4.MigrationReviewAssetsComposable$lambda$0(snapshotState4).getAssetListSections();
                                    final C37575xd239d3cf c37575xd239d3cf = new Function1() { // from class: com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposableKt$MigrationReviewAssetsComposable$1$1$2$invoke$lambda$2$lambda$1$$inlined$items$default$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Void invoke(AssetListSectionState assetListSectionState) {
                                            return null;
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            return invoke((AssetListSectionState) obj);
                                        }
                                    };
                                    LazyColumn.items(assetListSections.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposableKt$MigrationReviewAssetsComposable$1$1$2$invoke$lambda$2$lambda$1$$inlined$items$default$3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                            return invoke(num.intValue());
                                        }

                                        public final Object invoke(int i) {
                                            return c37575xd239d3cf.invoke(assetListSections.get(i));
                                        }
                                    }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposableKt$MigrationReviewAssetsComposable$1$1$2$invoke$lambda$2$lambda$1$$inlined$items$default$4
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(4);
                                        }

                                        @Override // kotlin.jvm.functions.Function4
                                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                                            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                                            int i3;
                                            if ((i2 & 6) == 0) {
                                                i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                                            } else {
                                                i3 = i2;
                                            }
                                            if ((i2 & 48) == 0) {
                                                i3 |= composer.changed(i) ? 32 : 16;
                                            }
                                            if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                                                composer.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                                            }
                                            final AssetListSectionState assetListSectionState = (AssetListSectionState) assetListSections.get(i);
                                            composer.startReplaceGroup(1859599722);
                                            LocalShowPlaceholder.Loadable(MigrationReviewAssetsComposable4.MigrationReviewAssetsComposable$lambda$0(snapshotState4).isLoading(), null, null, ComposableLambda3.rememberComposableLambda(288708901, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposableKt$MigrationReviewAssetsComposable$1$1$2$1$1$2$1
                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                    invoke(composer2, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer2, int i4) {
                                                    if ((i4 & 3) == 2 && composer2.getSkipping()) {
                                                        composer2.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(288708901, i4, -1, "com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MigrationReviewAssetsComposable.kt:141)");
                                                    }
                                                    MigrationReviewAssetsComposable4.AssetListSection(assetListSectionState, null, composer2, BentoBaseRowState.$stable, 2);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composer, 54), composer, 3072, 6);
                                            composer.endReplaceGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }));
                                    return Unit.INSTANCE;
                                }
                            }
                        }, composer2, 54), composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(migrationReviewAssetsDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Object objConsume = composerStartRestartGroup.consume(AbsErrorHandler2.getLocalErrorHandler());
                Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type com.robinhood.shared.crypto.acats.MigrationErrorHandler");
                migrationErrorHandler = (MigrationErrorHandler) objConsume;
                eventMigrationReviewAssetsComposable$lambda$1 = MigrationReviewAssetsComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventMigrationReviewAssetsComposable$lambda$1 != null && (eventMigrationReviewAssetsComposable$lambda$1.getData() instanceof MigrationReviewAssetsDuxo2) && (eventConsumerInvoke = eventMigrationReviewAssetsComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventMigrationReviewAssetsComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposableKt$MigrationReviewAssetsComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m24890invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m24890invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            MigrationReviewAssetsDuxo2 migrationReviewAssetsDuxo22 = (MigrationReviewAssetsDuxo2) eventMigrationReviewAssetsComposable$lambda$1.getData();
                            if (migrationReviewAssetsDuxo22 instanceof MigrationReviewAssetsDuxo2.Error) {
                                AbsErrorHandler.handleError$default(migrationErrorHandler, ((MigrationReviewAssetsDuxo2.Error) migrationReviewAssetsDuxo22).getThrowable(), false, 2, null);
                            } else {
                                if (!(migrationReviewAssetsDuxo22 instanceof MigrationReviewAssetsDuxo2.ErrorDialog)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                migrationErrorHandler.showErrorDialog(((MigrationReviewAssetsDuxo2.ErrorDialog) migrationReviewAssetsDuxo22).getMessage());
                            }
                        }
                    });
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                migrationReviewAssetsDuxo2 = migrationReviewAssetsDuxo3;
            }
            migrationReviewAssetsDuxo3 = migrationReviewAssetsDuxo2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            final SnapshotState4<MigrationReviewAssetsViewState> snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(migrationReviewAssetsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, new Screen(Screen.Name.ACATS_CRYPTO_MIGRATION_FLOW_ASSET_REVIEW, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-1649438949, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposableKt.MigrationReviewAssetsComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i7) {
                    if ((i7 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1649438949, i7, -1, "com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposable.<anonymous> (MigrationReviewAssetsComposable.kt:76)");
                    }
                    final Modifier modifier4 = modifier3;
                    final SnapshotState4<MigrationReviewAssetsViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle3;
                    final MigrationReviewAssetsDuxo migrationReviewAssetsDuxo4 = migrationReviewAssetsDuxo3;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-259648922, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposableKt.MigrationReviewAssetsComposable.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i8) {
                            if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-259648922, i8, -1, "com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposable.<anonymous>.<anonymous> (MigrationReviewAssetsComposable.kt:77)");
                            }
                            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(ModifiersKt.logScreenTransitions$default(modifier4, null, 1, null), false, ComposableLambda3.rememberComposableLambda(1869891857, true, new C506751(snapshotState4, migrationReviewAssetsDuxo4), composer3, 54), ComposableLambda3.rememberComposableLambda(1546195582, true, new AnonymousClass2(snapshotState4), composer3, 54), composer3, 3504, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: MigrationReviewAssetsComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposableKt$MigrationReviewAssetsComposable$1$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C506751 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                            final /* synthetic */ MigrationReviewAssetsDuxo $duxo;
                            final /* synthetic */ SnapshotState4<MigrationReviewAssetsViewState> $viewState$delegate;

                            C506751(SnapshotState4<MigrationReviewAssetsViewState> snapshotState4, MigrationReviewAssetsDuxo migrationReviewAssetsDuxo) {
                                this.$viewState$delegate = snapshotState4;
                                this.$duxo = migrationReviewAssetsDuxo;
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
                                    ComposerKt.traceEventStart(1869891857, i2, -1, "com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposable.<anonymous>.<anonymous>.<anonymous> (MigrationReviewAssetsComposable.kt:81)");
                                }
                                final LifecycleAwareNavigator lifecycleAwareNavigator = (LifecycleAwareNavigator) composer.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                                final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer, AutoLoggingCompositionLocals4.$stable);
                                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                                composer.startReplaceGroup(-1224400529);
                                boolean zChangedInstance = composer.changedInstance(current) | composer.changed(lifecycleAwareNavigator) | composer.changed(this.$viewState$delegate) | composer.changedInstance(this.$duxo);
                                final MigrationReviewAssetsDuxo migrationReviewAssetsDuxo = this.$duxo;
                                final SnapshotState4 snapshotState4 = this.$viewState$delegate;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposableKt$MigrationReviewAssetsComposable$1$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return MigrationReviewAssetsComposable4.C375791.AnonymousClass1.C506751.invoke$lambda$1$lambda$0(current, lifecycleAwareNavigator, migrationReviewAssetsDuxo, snapshotState4);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                BentoButtonBarScreenLayout.PrimaryButtonOnly(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, (Function0) objRememberedValue, StringResources_androidKt.stringResource(C37511R.string.crypto_acats_label_continue, composer, 0), MigrationReviewAssetsComposable4.MigrationReviewAssetsComposable$lambda$0(this.$viewState$delegate).isLoading(), null, MigrationReviewAssetsComposable4.MigrationReviewAssetsComposable$lambda$0(this.$viewState$delegate).getEnabled(), composer, (BentoButtonBar3.$stable << 21) | ((i2 << 21) & 29360128), 34);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, LifecycleAwareNavigator lifecycleAwareNavigator, MigrationReviewAssetsDuxo migrationReviewAssetsDuxo, SnapshotState4 snapshotState4) throws Resources.NotFoundException {
                                EventLogger.DefaultImpls.logTap$default(eventLogger, null, null, new Component(Component.ComponentType.BUTTON, "continue", null, 4, null), null, null, false, 59, null);
                                MigrationSubmitAssetsDest migrationSubmitAssetsDest = MigrationSubmitAssetsDest.INSTANCE;
                                ProcessMigrationAuthedResponseDto migrationResponse = MigrationReviewAssetsComposable4.MigrationReviewAssetsComposable$lambda$0(snapshotState4).getMigrationResponse();
                                if (migrationResponse != null) {
                                    LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, (ComposeNav) ComposableDestinationWithArgs.composeNav$default(migrationSubmitAssetsDest, new MigrationSubmitAssetsDest.Args(migrationResponse, migrationReviewAssetsDuxo.getRefId()), null, null, 6, null), false, (Function1) null, 6, (Object) null);
                                    return Unit.INSTANCE;
                                }
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        }

                        /* compiled from: MigrationReviewAssetsComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposableKt$MigrationReviewAssetsComposable$1$1$2, reason: invalid class name */
                        static final class AnonymousClass2 implements Function3<BoxScope, Composer, Integer, Unit> {
                            final /* synthetic */ SnapshotState4<MigrationReviewAssetsViewState> $viewState$delegate;

                            AnonymousClass2(SnapshotState4<MigrationReviewAssetsViewState> snapshotState4) {
                                this.$viewState$delegate = snapshotState4;
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
                                    ComposerKt.traceEventStart(1546195582, i, -1, "com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposable.<anonymous>.<anonymous>.<anonymous> (MigrationReviewAssetsComposable.kt:107)");
                                }
                                final Navigator navigator = (Navigator) composer.consume(LocalNavigator.getLocalNavigator());
                                final Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i2 = BentoTheme.$stable;
                                Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxSize$default, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 1, null);
                                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM());
                                composer.startReplaceGroup(-1746271574);
                                boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(context) | composer.changed(this.$viewState$delegate);
                                final SnapshotState4 snapshotState4 = this.$viewState$delegate;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposableKt$MigrationReviewAssetsComposable$1$1$2$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return MigrationReviewAssetsComposable4.C375791.AnonymousClass1.AnonymousClass2.invoke$lambda$2$lambda$1(navigator, context, snapshotState4, (LazyListScope) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                LazyDslKt.LazyColumn(modifierM5144paddingVpY3zN4$default, null, null, false, horizontalOrVerticalM5089spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, composer, 0, 494);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$2$lambda$1(final Navigator navigator, final Context context, final SnapshotState4 snapshotState4, LazyListScope LazyColumn) {
                                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                                LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-787175223, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposableKt$MigrationReviewAssetsComposable$1$1$2$1$1$1
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
                                            ComposerKt.traceEventStart(-787175223, i, -1, "com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MigrationReviewAssetsComposable.kt:116)");
                                        }
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null);
                                        String strStringResource = StringResources_androidKt.stringResource(C37511R.string.crypto_acats_migration_assets_list_title, composer, 0);
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i2 = BentoTheme.$stable;
                                        TextStyle displayCapsuleSmall = bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall();
                                        TextAlign.Companion companion2 = TextAlign.INSTANCE;
                                        BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, null, null, null, TextAlign.m7912boximpl(companion2.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleSmall, composer, 0, 0, 8124);
                                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), composer, 0);
                                        Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2 = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null);
                                        int i3 = C37511R.string.crypto_acats_migration_assets_list_subtitle;
                                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                                        composer.startReplaceGroup(-1633490746);
                                        boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(context);
                                        final Navigator navigator2 = navigator;
                                        final Context context2 = context;
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new LinkInteractionListener() { // from class: com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposableKt$MigrationReviewAssetsComposable$1$1$2$1$1$1$1$1
                                                @Override // androidx.compose.p011ui.text.LinkInteractionListener
                                                public final void onClick(LinkAnnotation it) {
                                                    Intrinsics.checkNotNullParameter(it, "it");
                                                    Navigators3.showHelpCenterWebViewFragment(navigator2, context2, "https://robinhood.com/us/en/support/articles/transfer-your-assets-from-Bitstamp/#Whichassetsareeligible");
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        composer.endReplaceGroup();
                                        BentoText2.m20748BentoTextQnj7Zds(AnnotatedStringResource.m22062annotatedStringResourceV2eopBjH0(i3, jM21425getFg0d7_KjU, 0L, (LinkInteractionListener) objRememberedValue, composer, 0, 4), modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2, null, null, null, null, TextAlign.m7912boximpl(companion2.m7919getCentere0LSkKk()), 0, false, 0, 0, null, null, null, composer, 0, 0, 16316);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), 3, null);
                                final List assetListSections = MigrationReviewAssetsComposable4.MigrationReviewAssetsComposable$lambda$0(snapshotState4).getAssetListSections();
                                final Function1 c37575xd239d3cf = new Function1() { // from class: com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposableKt$MigrationReviewAssetsComposable$1$1$2$invoke$lambda$2$lambda$1$$inlined$items$default$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Void invoke(AssetListSectionState assetListSectionState) {
                                        return null;
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        return invoke((AssetListSectionState) obj);
                                    }
                                };
                                LazyColumn.items(assetListSections.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposableKt$MigrationReviewAssetsComposable$1$1$2$invoke$lambda$2$lambda$1$$inlined$items$default$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                        return invoke(num.intValue());
                                    }

                                    public final Object invoke(int i) {
                                        return c37575xd239d3cf.invoke(assetListSections.get(i));
                                    }
                                }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposableKt$MigrationReviewAssetsComposable$1$1$2$invoke$lambda$2$lambda$1$$inlined$items$default$4
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(4);
                                    }

                                    @Override // kotlin.jvm.functions.Function4
                                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                                        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                                        int i3;
                                        if ((i2 & 6) == 0) {
                                            i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                                        } else {
                                            i3 = i2;
                                        }
                                        if ((i2 & 48) == 0) {
                                            i3 |= composer.changed(i) ? 32 : 16;
                                        }
                                        if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                                        }
                                        final AssetListSectionState assetListSectionState = (AssetListSectionState) assetListSections.get(i);
                                        composer.startReplaceGroup(1859599722);
                                        LocalShowPlaceholder.Loadable(MigrationReviewAssetsComposable4.MigrationReviewAssetsComposable$lambda$0(snapshotState4).isLoading(), null, null, ComposableLambda3.rememberComposableLambda(288708901, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposableKt$MigrationReviewAssetsComposable$1$1$2$1$1$2$1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                invoke(composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer2, int i4) {
                                                if ((i4 & 3) == 2 && composer2.getSkipping()) {
                                                    composer2.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(288708901, i4, -1, "com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MigrationReviewAssetsComposable.kt:141)");
                                                }
                                                MigrationReviewAssetsComposable4.AssetListSection(assetListSectionState, null, composer2, BentoBaseRowState.$stable, 2);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer, 54), composer, 3072, 6);
                                        composer.endReplaceGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }));
                                return Unit.INSTANCE;
                            }
                        }
                    }, composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(migrationReviewAssetsDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            Object objConsume2 = composerStartRestartGroup.consume(AbsErrorHandler2.getLocalErrorHandler());
            Intrinsics.checkNotNull(objConsume2, "null cannot be cast to non-null type com.robinhood.shared.crypto.acats.MigrationErrorHandler");
            migrationErrorHandler = (MigrationErrorHandler) objConsume2;
            eventMigrationReviewAssetsComposable$lambda$1 = MigrationReviewAssetsComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
            if (eventMigrationReviewAssetsComposable$lambda$1 != null) {
                eventConsumerInvoke.consume(eventMigrationReviewAssetsComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposableKt$MigrationReviewAssetsComposable$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m24890invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m24890invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        MigrationReviewAssetsDuxo2 migrationReviewAssetsDuxo22 = (MigrationReviewAssetsDuxo2) eventMigrationReviewAssetsComposable$lambda$1.getData();
                        if (migrationReviewAssetsDuxo22 instanceof MigrationReviewAssetsDuxo2.Error) {
                            AbsErrorHandler.handleError$default(migrationErrorHandler, ((MigrationReviewAssetsDuxo2.Error) migrationReviewAssetsDuxo22).getThrowable(), false, 2, null);
                        } else {
                            if (!(migrationReviewAssetsDuxo22 instanceof MigrationReviewAssetsDuxo2.ErrorDialog)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            migrationErrorHandler.showErrorDialog(((MigrationReviewAssetsDuxo2.ErrorDialog) migrationReviewAssetsDuxo22).getMessage());
                        }
                    }
                });
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            migrationReviewAssetsDuxo2 = migrationReviewAssetsDuxo3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MigrationReviewAssetsComposable4.MigrationReviewAssetsComposable$lambda$3(modifier3, migrationReviewAssetsDuxo2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final int AssetListSection$lambda$12(SnapshotState4<Integer> snapshotState4) {
        return snapshotState4.getValue().intValue();
    }

    private static final BentoTextButton3.Icon.Size12 AssetListSection$lambda$15(SnapshotState4<BentoTextButton3.Icon.Size12> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean AssetListSection$lambda$5(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final List<BentoBaseRowState> AssetListSection$lambda$9(SnapshotState4<? extends List<BentoBaseRowState>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MigrationReviewAssetsViewState MigrationReviewAssetsComposable$lambda$0(SnapshotState4<MigrationReviewAssetsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<MigrationReviewAssetsDuxo2> MigrationReviewAssetsComposable$lambda$1(SnapshotState4<Event<MigrationReviewAssetsDuxo2>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03f1 A[LOOP:0: B:107:0x03ea->B:109:0x03f1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0394  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AssetListSection(final AssetListSectionState assetListSectionState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        Object objRememberedValue4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        boolean z;
        Composer composer2;
        int currentCompositeKeyHash4;
        Composer composerM6388constructorimpl4;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4;
        Iterator<T> it;
        Composer composer3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1249471370);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | ((i & 8) == 0 ? composerStartRestartGroup.changed(assetListSectionState) : composerStartRestartGroup.changedInstance(assetListSectionState) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1249471370, i3, -1, "com.robinhood.shared.crypto.acats.reviewassets.AssetListSection (MigrationReviewAssetsComposable.kt:171)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                final int i5 = 5;
                final boolean z2 = assetListSectionState.getRows().size() <= 5;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MigrationReviewAssetsComposable4.AssetListSection$lambda$8$lambda$7(z2, assetListSectionState, i5, snapshotState);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(MigrationReviewAssetsComposable4.AssetListSection$lambda$11$lambda$10(snapshotState));
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                SnapshotState4 snapshotState42 = (SnapshotState4) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MigrationReviewAssetsComposable4.AssetListSection$lambda$14$lambda$13(snapshotState);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                SnapshotState4 snapshotState43 = (SnapshotState4) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion4, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i6).m21595getXsmallD9Ej5fM()), companion2.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion4);
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor3);
                }
                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                z = z2;
                Modifier modifier4 = modifier3;
                BentoText2.m20747BentoText38GnDrw(assetListSectionState.getTitle(), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 24576, 0, 16366);
                Composer composer4 = composerStartRestartGroup;
                composer4.startReplaceGroup(1926603605);
                if (assetListSectionState.getRows().size() > 1) {
                    BentoText2.m20747BentoText38GnDrw("(" + assetListSectionState.getRows().size() + ")", null, Color.m6701boximpl(bentoTheme.getColors(composer4, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, null, composer4, 0, 0, 16378);
                    composer4 = composer4;
                }
                composer4.endReplaceGroup();
                composer4.endNode();
                Composer composer5 = composer4;
                BentoText2.m20747BentoText38GnDrw(assetListSectionState.getSubtitle(), null, Color.m6701boximpl(bentoTheme.getColors(composer4, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer4, i6).getTextS(), composer5, 0, 0, 8186);
                composer2 = composer5;
                composer2.endNode();
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme.getSpacing(composer2, i6).m21593getSmallD9Ej5fM()), composer2, 0);
                Modifier modifierAnimateContentSize$default = AnimationModifier.animateContentSize$default(companion4, null, null, 3, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
                currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer2, modifierAnimateContentSize$default);
                Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.useNode();
                } else {
                    composer2.createNode(constructor4);
                }
                composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy3, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
                composer2.startReplaceGroup(-1649666486);
                it = AssetListSection$lambda$9(snapshotState4).iterator();
                while (it.hasNext()) {
                    Composer composer6 = composer2;
                    BentoBaseRowKt.m20915BentoBaseRowcd68TDI(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), (BentoBaseRowState) it.next(), false, false, false, 0L, null, composer6, (BentoBaseRowState.$stable << 3) | 6, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                    composer2 = composer6;
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                composer2.startReplaceGroup(817750194);
                if (z) {
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion5, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composer2, 0);
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion5, 0.0f, composer2, 6, 1);
                    String strStringResource = StringResources_androidKt.stringResource(AssetListSection$lambda$12(snapshotState42), composer2, 0);
                    BentoTextButton3.Icon.Size12 size12AssetListSection$lambda$15 = AssetListSection$lambda$15(snapshotState43);
                    composer2.startReplaceGroup(5004770);
                    Object objRememberedValue5 = composer2.rememberedValue();
                    if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new Function0() { // from class: com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposableKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MigrationReviewAssetsComposable4.AssetListSection$lambda$22$lambda$21$lambda$20(snapshotState);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    composer2.endReplaceGroup();
                    BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue5, strStringResource, modifierM21623defaultHorizontalPaddingrAjV9yQ, size12AssetListSection$lambda$15, null, false, null, composer2, (BentoTextButton3.Icon.Size12.$stable << 9) | 6, 112);
                }
                composer3 = composer2;
                composer3.endReplaceGroup();
                composer3.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer3 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MigrationReviewAssetsComposable4.AssetListSection$lambda$23(assetListSectionState, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            final int i52 = 5;
            if (assetListSectionState.getRows().size() <= 5) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            SnapshotState4 snapshotState44 = (SnapshotState4) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
            }
            SnapshotState4 snapshotState422 = (SnapshotState4) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
            }
            SnapshotState4 snapshotState432 = (SnapshotState4) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement2.getTop();
            Alignment.Companion companion22 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor5 = companion32.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy4, companion32.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap5, companion32.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier5, companion32.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion42 = Modifier.INSTANCE;
                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2 = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion42, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion22.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2);
                Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy22, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i62 = BentoTheme.$stable;
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21595getXsmallD9Ej5fM()), companion22.getTop(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion42);
                    Function0<ComposeUiNode> constructor32 = companion32.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion32.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion32.getSetResolvedCompositionLocals());
                    setCompositeKeyHash3 = companion32.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl3.getInserting()) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion32.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        z = z2;
                        Modifier modifier42 = modifier3;
                        BentoText2.m20747BentoText38GnDrw(assetListSectionState.getTitle(), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 24576, 0, 16366);
                        Composer composer42 = composerStartRestartGroup;
                        composer42.startReplaceGroup(1926603605);
                        if (assetListSectionState.getRows().size() > 1) {
                        }
                        composer42.endReplaceGroup();
                        composer42.endNode();
                        Composer composer52 = composer42;
                        BentoText2.m20747BentoText38GnDrw(assetListSectionState.getSubtitle(), null, Color.m6701boximpl(bentoTheme2.getColors(composer42, i62).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer42, i62).getTextS(), composer52, 0, 0, 8186);
                        composer2 = composer52;
                        composer2.endNode();
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion42, bentoTheme2.getSpacing(composer2, i62).m21593getSmallD9Ej5fM()), composer2, 0);
                        Modifier modifierAnimateContentSize$default2 = AnimationModifier.animateContentSize$default(companion42, null, null, 3, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy32 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion22.getStart(), composer2, 0);
                        currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap42 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier42 = ComposedModifier2.materializeModifier(composer2, modifierAnimateContentSize$default2);
                        Function0<ComposeUiNode> constructor42 = companion32.getConstructor();
                        if (composer2.getApplier() == null) {
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                        }
                        composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy32, companion32.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap42, companion32.getSetResolvedCompositionLocals());
                        setCompositeKeyHash4 = companion32.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl4.getInserting()) {
                            composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier42, companion32.getSetModifier());
                            composer2.startReplaceGroup(-1649666486);
                            it = AssetListSection$lambda$9(snapshotState44).iterator();
                            while (it.hasNext()) {
                            }
                            composer2.endReplaceGroup();
                            composer2.endNode();
                            composer2.startReplaceGroup(817750194);
                            if (z) {
                            }
                            composer3 = composer2;
                            composer3.endReplaceGroup();
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier2 = modifier42;
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void AssetListSection$lambda$6(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List AssetListSection$lambda$8$lambda$7(boolean z, AssetListSectionState assetListSectionState, int i, SnapshotState snapshotState) {
        if (z && !AssetListSection$lambda$5(snapshotState)) {
            return CollectionsKt.take(assetListSectionState.getRows(), i);
        }
        return assetListSectionState.getRows();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int AssetListSection$lambda$11$lambda$10(SnapshotState snapshotState) {
        if (AssetListSection$lambda$5(snapshotState)) {
            return C37511R.string.crypto_acats_label_show_less;
        }
        return C37511R.string.crypto_acats_label_show_more;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BentoTextButton3.Icon.Size12 AssetListSection$lambda$14$lambda$13(SnapshotState snapshotState) {
        if (AssetListSection$lambda$5(snapshotState)) {
            return new BentoTextButton3.Icon.Size12(ServerToBentoAssetMapper2.CARET_UP_12, BentoTextButton3.Icon.Position.Trailing);
        }
        return new BentoTextButton3.Icon.Size12(ServerToBentoAssetMapper2.CARET_DOWN_12, BentoTextButton3.Icon.Position.Trailing);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssetListSection$lambda$22$lambda$21$lambda$20(SnapshotState snapshotState) {
        AssetListSection$lambda$6(snapshotState, !AssetListSection$lambda$5(snapshotState));
        return Unit.INSTANCE;
    }

    private static final void AssetListSectionPreviewDay(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-610660199);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-610660199, i, -1, "com.robinhood.shared.crypto.acats.reviewassets.AssetListSectionPreviewDay (MigrationReviewAssetsComposable.kt:270)");
            }
            Boolean bool = Boolean.TRUE;
            BentoTheme2.BentoTheme(bool, null, null, null, null, bool, null, null, MigrationReviewAssetsComposable2.INSTANCE.m24886getLambda$1943391663$feature_acats_externalRelease(), composerStartRestartGroup, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MigrationReviewAssetsComposable4.AssetListSectionPreviewDay$lambda$24(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
