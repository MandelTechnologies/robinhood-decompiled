package com.robinhood.android.gold.upgrade.legacy;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiController3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeValuePropsSduiScreen3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.serverdriven.experimental.api.CenterAlignedListPage;
import com.robinhood.models.serverdriven.experimental.api.GoldUpgradeValuePropsAction;
import com.robinhood.models.serverdriven.experimental.api.PageThemeOverride;
import com.robinhood.models.serverdriven.experimental.api.StandardPageTemplate;
import com.robinhood.models.serverdriven.experimental.api.TopAlignedListPage;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LegacyGoldUpgradeValuePropsSduiScreen.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a_\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010H\u0001¢\u0006\u0002\u0010\u0011\u001aE\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0003¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"GoldUpgradeValuePropsSduiScreen", "", "pageContent", "Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;", "Lcom/robinhood/models/serverdriven/experimental/api/GoldUpgradeValuePropsAction;", "onBackClick", "Lkotlin/Function0;", "shownInTab", "", "modifier", "Landroidx/compose/ui/Modifier;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "(Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/Modifier;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Landroidx/compose/runtime/Composer;II)V", "Toolbar", "hideBackButton", "transparent", "(ZLcom/robinhood/analytics/EventLogger;Lcom/robinhood/rosetta/eventlogging/Screen;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "feature-gold-upgrade_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeValuePropsSduiScreenKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class LegacyGoldUpgradeValuePropsSduiScreen3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUpgradeValuePropsSduiScreen$lambda$2(StandardPageTemplate standardPageTemplate, Function0 function0, boolean z, Modifier modifier, EventLogger eventLogger, Screen screen, SduiActionHandler sduiActionHandler, int i, int i2, Composer composer, int i3) {
        GoldUpgradeValuePropsSduiScreen(standardPageTemplate, function0, z, modifier, eventLogger, screen, sduiActionHandler, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Toolbar$lambda$3(boolean z, EventLogger eventLogger, Screen screen, boolean z2, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        Toolbar(z, eventLogger, screen, z2, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:251:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldUpgradeValuePropsSduiScreen(final StandardPageTemplate<? extends GoldUpgradeValuePropsAction> pageContent, final Function0<Unit> onBackClick, final boolean z, Modifier modifier, EventLogger eventLogger, Screen screen, SduiActionHandler<? super GoldUpgradeValuePropsAction> sduiActionHandler, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        EventLogger current;
        Screen screen2;
        final SduiActionHandler<? super GoldUpgradeValuePropsAction> sduiActionHandler2;
        Modifier modifier3;
        EventLogger eventLogger2;
        Modifier modifier4;
        Arrangement.Vertical top;
        SduiActionHandler<? super GoldUpgradeValuePropsAction> sduiActionHandler3;
        ImmutableList3 immutableList3PersistentListOf;
        final EventLogger eventLogger3;
        final Screen screen3;
        final SduiActionHandler<? super GoldUpgradeValuePropsAction> sduiActionHandler4;
        final Modifier modifier5;
        boolean z2;
        Arrangement.Vertical top2;
        Modifier.Companion companion;
        ImmutableList3 immutableList3PersistentListOf2;
        Composer composer2;
        SduiActionHandler<? super GoldUpgradeValuePropsAction> sduiActionHandler5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(pageContent, "pageContent");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(2121753457);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(pageContent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    current = eventLogger;
                    int i5 = composerStartRestartGroup.changedInstance(current) ? 16384 : 8192;
                    i3 |= i5;
                } else {
                    current = eventLogger;
                }
                i3 |= i5;
            } else {
                current = eventLogger;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    screen2 = screen;
                    int i6 = composerStartRestartGroup.changedInstance(screen2) ? 131072 : 65536;
                    i3 |= i6;
                } else {
                    screen2 = screen;
                }
                i3 |= i6;
            } else {
                screen2 = screen;
            }
            if ((1572864 & i) != 0) {
                if ((i2 & 64) == 0) {
                    sduiActionHandler2 = sduiActionHandler;
                    int i7 = composerStartRestartGroup.changedInstance(sduiActionHandler2) ? 1048576 : 524288;
                    i3 |= i7;
                } else {
                    sduiActionHandler2 = sduiActionHandler;
                }
                i3 |= i7;
            } else {
                sduiActionHandler2 = sduiActionHandler;
            }
            if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                    }
                    if ((i2 & 32) != 0) {
                        Screen.Name name = Screen.Name.GOLD_VALUE_PROPS;
                        String logging_screen_identifier = pageContent.getLogging_screen_identifier();
                        if (logging_screen_identifier == null) {
                            logging_screen_identifier = "gold-upgrade-value-props-revamp";
                        }
                        i3 &= -458753;
                        screen2 = new Screen(name, null, logging_screen_identifier, null, 10, null);
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        sduiActionHandler2 = SduiActionHandler.NotImplemented.INSTANCE;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    modifier3 = modifier2;
                }
                int i8 = i3;
                Modifier modifier6 = modifier3;
                Screen screen4 = screen2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2121753457, i8, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeValuePropsSduiScreen (LegacyGoldUpgradeValuePropsSduiScreen.kt:30)");
                }
                boolean z3 = !pageContent.getHide_back_button() || z;
                EventLogger eventLogger4 = current;
                if (pageContent.is_full_bleed()) {
                    boolean z4 = z3;
                    final SduiActionHandler<? super GoldUpgradeValuePropsAction> sduiActionHandler6 = sduiActionHandler2;
                    eventLogger2 = eventLogger4;
                    composerStartRestartGroup.startReplaceGroup(124697720);
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier6, 0.0f, 1, null);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top3 = arrangement.getTop();
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top3, companion2.getStart(), composerStartRestartGroup, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    int i9 = i8 >> 9;
                    modifier4 = modifier6;
                    Toolbar(z4, eventLogger2, screen4, false, null, onBackClick, composerStartRestartGroup, (i9 & 896) | (i9 & 112) | 3072 | ((i8 << 12) & 458752), 16);
                    int i10 = (i8 & 14) | ((i8 >> 15) & 112);
                    composerStartRestartGroup.startReplaceGroup(-962331744);
                    final Modifier.Companion companion4 = Modifier.INSTANCE;
                    PageThemeOverride theme_override = pageContent.getTheme_override();
                    if (theme_override != null) {
                        composerStartRestartGroup.startReplaceGroup(82012030);
                        BentoTheme2.BentoTheme(Boolean.valueOf(theme_override == PageThemeOverride.LIGHT), null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(873647597, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeValuePropsSduiScreenKt$GoldUpgradeValuePropsSduiScreen$lambda$1$$inlined$SduiStandardPage$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* compiled from: SduiStandardPage.kt */
                            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/robinhood/android/libdesignsystem/serverui/experimental/compose/SduiStandardPageKt$SduiStandardPage$1$1$1"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiStandardPageKt$SduiStandardPage$1$1$1", m3645f = "SduiStandardPage.kt", m3646l = {}, m3647m = "invokeSuspend")
                            /* renamed from: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeValuePropsSduiScreenKt$GoldUpgradeValuePropsSduiScreen$lambda$1$$inlined$SduiStandardPage$1$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ long $backgroundedColor;
                                final /* synthetic */ SystemUiController $systemUiController;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(SystemUiController systemUiController, long j, Continuation continuation) {
                                    super(2, continuation);
                                    this.$systemUiController = systemUiController;
                                    this.$backgroundedColor = j;
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new AnonymousClass1(this.$systemUiController, this.$backgroundedColor, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    if (this.label != 0) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                    SystemUiController.m9212setStatusBarColorek8zF_U$default(this.$systemUiController, this.$backgroundedColor, false, null, 6, null);
                                    return Unit.INSTANCE;
                                }
                            }

                            public final void invoke(Composer composer3, int i11) {
                                Arrangement.Vertical top4;
                                ImmutableList3 immutableList3PersistentListOf3;
                                if ((i11 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(873647597, i11, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiStandardPage.<anonymous> (SduiStandardPage.kt:34)");
                                }
                                StandardPageTemplate standardPageTemplate = pageContent;
                                SduiActionHandler sduiActionHandler7 = sduiActionHandler6;
                                Modifier modifier7 = companion4;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i12 = BentoTheme.$stable;
                                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifier7, bentoTheme.getColors(composer3, i12).m21371getBg0d7_KjU(), null, 2, null);
                                composer3.startReplaceGroup(-430325605);
                                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifierM4872backgroundbw27NRU$default, 0.0f, 1, null);
                                Arrangement arrangement2 = Arrangement.INSTANCE;
                                Arrangement.Vertical top5 = arrangement2.getTop();
                                Alignment.Companion companion5 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top5, companion5.getStart(), composer3, 0);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierFillMaxSize$default2);
                                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor2);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion6.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion6.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion6.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion6.getSetModifier());
                                Column6 column62 = Column6.INSTANCE;
                                if (standardPageTemplate instanceof CenterAlignedListPage) {
                                    top4 = arrangement2.getCenter();
                                } else {
                                    if (!(standardPageTemplate instanceof TopAlignedListPage)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    top4 = arrangement2.getTop();
                                }
                                Modifier.Companion companion7 = Modifier.INSTANCE;
                                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column62, companion7, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(top4, companion5.getCenterHorizontally(), composer3, 48);
                                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, modifierVerticalScroll$default);
                                Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor3);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion6.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion6.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion6.getSetModifier());
                                ImmutableList3 persistentList = extensions2.toPersistentList(standardPageTemplate.getBody());
                                composer3.startReplaceGroup(-1772220517);
                                HorizontalPadding horizontalPadding = HorizontalPadding.Default;
                                SduiColumns.SduiColumn(persistentList, GoldUpgradeValuePropsAction.class, companion7, null, sduiActionHandler7, horizontalPadding, arrangement2.getTop(), companion5.getStart(), true, composer3, 100663296, 0);
                                composer3.endReplaceGroup();
                                composer3.endNode();
                                List footer = standardPageTemplate.getFooter();
                                if (footer == null || (immutableList3PersistentListOf3 = extensions2.toPersistentList(footer)) == null) {
                                    immutableList3PersistentListOf3 = extensions2.persistentListOf();
                                }
                                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer3, i12).m21590getDefaultD9Ej5fM(), 1, null);
                                composer3.startReplaceGroup(-1772220517);
                                SduiColumns.SduiColumn(immutableList3PersistentListOf3, GoldUpgradeValuePropsAction.class, modifierM5144paddingVpY3zN4$default, null, sduiActionHandler7, horizontalPadding, arrangement2.getTop(), companion5.getStart(), true, composer3, 100666368, 0);
                                composer3.endReplaceGroup();
                                composer3.endNode();
                                composer3.endReplaceGroup();
                                SystemUiController systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composer3, 0, 1);
                                long jM21371getBg0d7_KjU = bentoTheme.getColors(composer3, i12).m21371getBg0d7_KjU();
                                Unit unit = Unit.INSTANCE;
                                composer3.startReplaceGroup(-1633490746);
                                boolean zChanged = composer3.changed(systemUiControllerRememberSystemUiController) | composer3.changed(jM21371getBg0d7_KjU);
                                Object objRememberedValue = composer3.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new AnonymousClass1(systemUiControllerRememberSystemUiController, jM21371getBg0d7_KjU, null);
                                    composer3.updateRememberedValue(objRememberedValue);
                                }
                                composer3.endReplaceGroup();
                                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer3, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                        composerStartRestartGroup.endReplaceGroup();
                        sduiActionHandler3 = sduiActionHandler6;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(82611105);
                        int i11 = i10 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE;
                        composerStartRestartGroup.startReplaceGroup(-430325605);
                        Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        if (pageContent instanceof CenterAlignedListPage) {
                            top = arrangement.getCenter();
                        } else {
                            if (!(pageContent instanceof TopAlignedListPage)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            top = arrangement.getTop();
                        }
                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, companion4, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(top, companion2.getCenterHorizontally(), composerStartRestartGroup, 48);
                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor3);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                        ImmutableList3 persistentList = extensions2.toPersistentList(pageContent.getBody());
                        int i12 = (i11 << 6) & 7168;
                        composerStartRestartGroup.startReplaceGroup(-1772220517);
                        HorizontalPadding horizontalPadding = HorizontalPadding.Default;
                        sduiActionHandler3 = sduiActionHandler6;
                        SduiColumns.SduiColumn(persistentList, GoldUpgradeValuePropsAction.class, companion4, null, sduiActionHandler3, horizontalPadding, arrangement.getTop(), companion2.getStart(), true, composerStartRestartGroup, (((i12 | 12582912) << 3) & 57344) | 100663296, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        Iterable footer = pageContent.getFooter();
                        if (footer == null || (immutableList3PersistentListOf = extensions2.toPersistentList(footer)) == null) {
                            immutableList3PersistentListOf = extensions2.persistentListOf();
                        }
                        ImmutableList3 immutableList3 = immutableList3PersistentListOf;
                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
                        composerStartRestartGroup.startReplaceGroup(-1772220517);
                        SduiColumns.SduiColumn(immutableList3, GoldUpgradeValuePropsAction.class, modifierM5144paddingVpY3zN4$default, null, sduiActionHandler3, horizontalPadding, arrangement.getTop(), companion2.getStart(), true, composerStartRestartGroup, (((i12 | 12583296) << 3) & 57344) | 100666368, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(124203363);
                    Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(modifier6, 0.0f, 1, null);
                    Alignment.Companion companion5 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), false);
                    int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default3);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor4);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy, companion6.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion6.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion6.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion6.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    int i13 = (i8 & 14) | ((i8 >> 15) & 112);
                    composerStartRestartGroup.startReplaceGroup(-962331744);
                    final Modifier.Companion companion7 = Modifier.INSTANCE;
                    PageThemeOverride theme_override2 = pageContent.getTheme_override();
                    if (theme_override2 != null) {
                        composerStartRestartGroup.startReplaceGroup(82012030);
                        composer2 = composerStartRestartGroup;
                        BentoTheme2.BentoTheme(Boolean.valueOf(theme_override2 == PageThemeOverride.LIGHT), null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(873647597, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeValuePropsSduiScreenKt$GoldUpgradeValuePropsSduiScreen$lambda$0$$inlined$SduiStandardPage$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* compiled from: SduiStandardPage.kt */
                            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/robinhood/android/libdesignsystem/serverui/experimental/compose/SduiStandardPageKt$SduiStandardPage$1$1$1"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiStandardPageKt$SduiStandardPage$1$1$1", m3645f = "SduiStandardPage.kt", m3646l = {}, m3647m = "invokeSuspend")
                            /* renamed from: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeValuePropsSduiScreenKt$GoldUpgradeValuePropsSduiScreen$lambda$0$$inlined$SduiStandardPage$1$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ long $backgroundedColor;
                                final /* synthetic */ SystemUiController $systemUiController;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(SystemUiController systemUiController, long j, Continuation continuation) {
                                    super(2, continuation);
                                    this.$systemUiController = systemUiController;
                                    this.$backgroundedColor = j;
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new AnonymousClass1(this.$systemUiController, this.$backgroundedColor, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    if (this.label != 0) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                    SystemUiController.m9212setStatusBarColorek8zF_U$default(this.$systemUiController, this.$backgroundedColor, false, null, 6, null);
                                    return Unit.INSTANCE;
                                }
                            }

                            public final void invoke(Composer composer3, int i14) {
                                Arrangement.Vertical top4;
                                ImmutableList3 immutableList3PersistentListOf3;
                                if ((i14 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(873647597, i14, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiStandardPage.<anonymous> (SduiStandardPage.kt:34)");
                                }
                                StandardPageTemplate standardPageTemplate = pageContent;
                                SduiActionHandler sduiActionHandler7 = sduiActionHandler2;
                                Modifier modifier7 = companion7;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i15 = BentoTheme.$stable;
                                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifier7, bentoTheme.getColors(composer3, i15).m21371getBg0d7_KjU(), null, 2, null);
                                composer3.startReplaceGroup(-430325605);
                                Modifier modifierFillMaxSize$default4 = SizeKt.fillMaxSize$default(modifierM4872backgroundbw27NRU$default, 0.0f, 1, null);
                                Arrangement arrangement2 = Arrangement.INSTANCE;
                                Arrangement.Vertical top5 = arrangement2.getTop();
                                Alignment.Companion companion8 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(top5, companion8.getStart(), composer3, 0);
                                int currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composer3, modifierFillMaxSize$default4);
                                ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor5 = companion9.getConstructor();
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor5);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyColumnMeasurePolicy4, companion9.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion9.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion9.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                    composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                    composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion9.getSetModifier());
                                Column6 column62 = Column6.INSTANCE;
                                if (standardPageTemplate instanceof CenterAlignedListPage) {
                                    top4 = arrangement2.getCenter();
                                } else {
                                    if (!(standardPageTemplate instanceof TopAlignedListPage)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    top4 = arrangement2.getTop();
                                }
                                Modifier.Companion companion10 = Modifier.INSTANCE;
                                Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(Column5.weight$default(column62, companion10, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy5 = Column2.columnMeasurePolicy(top4, companion8.getCenterHorizontally(), composer3, 48);
                                int currentCompositeKeyHash6 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier6 = ComposedModifier2.materializeModifier(composer3, modifierVerticalScroll$default2);
                                Function0<ComposeUiNode> constructor6 = companion9.getConstructor();
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor6);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM6388constructorimpl6 = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl6, measurePolicyColumnMeasurePolicy5, companion9.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl6, currentCompositionLocalMap6, companion9.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion9.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                    composerM6388constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                    composerM6388constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl6, modifierMaterializeModifier6, companion9.getSetModifier());
                                ImmutableList3 persistentList2 = extensions2.toPersistentList(standardPageTemplate.getBody());
                                composer3.startReplaceGroup(-1772220517);
                                HorizontalPadding horizontalPadding2 = HorizontalPadding.Default;
                                SduiColumns.SduiColumn(persistentList2, GoldUpgradeValuePropsAction.class, companion10, null, sduiActionHandler7, horizontalPadding2, arrangement2.getTop(), companion8.getStart(), true, composer3, 100663296, 0);
                                composer3.endReplaceGroup();
                                composer3.endNode();
                                List footer2 = standardPageTemplate.getFooter();
                                if (footer2 == null || (immutableList3PersistentListOf3 = extensions2.toPersistentList(footer2)) == null) {
                                    immutableList3PersistentListOf3 = extensions2.persistentListOf();
                                }
                                Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion10, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer3, i15).m21590getDefaultD9Ej5fM(), 1, null);
                                composer3.startReplaceGroup(-1772220517);
                                SduiColumns.SduiColumn(immutableList3PersistentListOf3, GoldUpgradeValuePropsAction.class, modifierM5144paddingVpY3zN4$default2, null, sduiActionHandler7, horizontalPadding2, arrangement2.getTop(), companion8.getStart(), true, composer3, 100666368, 0);
                                composer3.endReplaceGroup();
                                composer3.endNode();
                                composer3.endReplaceGroup();
                                SystemUiController systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composer3, 0, 1);
                                long jM21371getBg0d7_KjU = bentoTheme.getColors(composer3, i15).m21371getBg0d7_KjU();
                                Unit unit = Unit.INSTANCE;
                                composer3.startReplaceGroup(-1633490746);
                                boolean zChanged = composer3.changed(systemUiControllerRememberSystemUiController) | composer3.changed(jM21371getBg0d7_KjU);
                                Object objRememberedValue = composer3.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new AnonymousClass1(systemUiControllerRememberSystemUiController, jM21371getBg0d7_KjU, null);
                                    composer3.updateRememberedValue(objRememberedValue);
                                }
                                composer3.endReplaceGroup();
                                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer3, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composer2, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                        composerStartRestartGroup.endReplaceGroup();
                        z2 = z3;
                        companion = companion7;
                        sduiActionHandler5 = sduiActionHandler2;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(82611105);
                        int i14 = i13 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE;
                        composerStartRestartGroup.startReplaceGroup(-430325605);
                        Modifier modifierFillMaxSize$default4 = SizeKt.fillMaxSize$default(companion7, 0.0f, 1, null);
                        Arrangement arrangement2 = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion5.getStart(), composerStartRestartGroup, 0);
                        int currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default4);
                        Function0<ComposeUiNode> constructor5 = companion6.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor5);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM6388constructorimpl5 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        z2 = z3;
                        Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyColumnMeasurePolicy4, companion6.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion6.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion6.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                            composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                            composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion6.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        if (pageContent instanceof CenterAlignedListPage) {
                            top2 = arrangement2.getCenter();
                        } else {
                            if (!(pageContent instanceof TopAlignedListPage)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            top2 = arrangement2.getTop();
                        }
                        Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(Column5.weight$default(column62, companion7, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy5 = Column2.columnMeasurePolicy(top2, companion5.getCenterHorizontally(), composerStartRestartGroup, 48);
                        int currentCompositeKeyHash6 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier6 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default2);
                        Function0<ComposeUiNode> constructor6 = companion6.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor6);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM6388constructorimpl6 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl6, measurePolicyColumnMeasurePolicy5, companion6.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl6, currentCompositionLocalMap6, companion6.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion6.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                            composerM6388constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                            composerM6388constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl6, modifierMaterializeModifier6, companion6.getSetModifier());
                        ImmutableList3 persistentList2 = extensions2.toPersistentList(pageContent.getBody());
                        int i15 = (i14 << 6) & 7168;
                        composerStartRestartGroup.startReplaceGroup(-1772220517);
                        HorizontalPadding horizontalPadding2 = HorizontalPadding.Default;
                        SduiActionHandler<? super GoldUpgradeValuePropsAction> sduiActionHandler7 = sduiActionHandler2;
                        SduiColumns.SduiColumn(persistentList2, GoldUpgradeValuePropsAction.class, companion7, null, sduiActionHandler7, horizontalPadding2, arrangement2.getTop(), companion5.getStart(), true, composerStartRestartGroup, (((i15 | 12582912) << 3) & 57344) | 100663296, 0);
                        companion = companion7;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        Iterable footer2 = pageContent.getFooter();
                        if (footer2 == null || (immutableList3PersistentListOf2 = extensions2.toPersistentList(footer2)) == null) {
                            immutableList3PersistentListOf2 = extensions2.persistentListOf();
                        }
                        ImmutableList3 immutableList32 = immutableList3PersistentListOf2;
                        Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
                        composerStartRestartGroup.startReplaceGroup(-1772220517);
                        composer2 = composerStartRestartGroup;
                        SduiColumns.SduiColumn(immutableList32, GoldUpgradeValuePropsAction.class, modifierM5144paddingVpY3zN4$default2, null, sduiActionHandler7, horizontalPadding2, arrangement2.getTop(), companion5.getStart(), true, composer2, (((i15 | 12583296) << 3) & 57344) | 100666368, 0);
                        sduiActionHandler5 = sduiActionHandler7;
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        composer2.endReplaceGroup();
                        composer2.endReplaceGroup();
                    }
                    composer2.endReplaceGroup();
                    Modifier modifierStatusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(companion);
                    int i16 = i8 >> 9;
                    composerStartRestartGroup = composer2;
                    eventLogger2 = eventLogger4;
                    Toolbar(z2, eventLogger2, screen4, true, modifierStatusBarsPadding, onBackClick, composerStartRestartGroup, (i16 & 896) | (i16 & 112) | 3072 | ((i8 << 12) & 458752), 0);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                    sduiActionHandler3 = sduiActionHandler5;
                    modifier4 = modifier6;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                eventLogger3 = eventLogger2;
                screen3 = screen4;
                sduiActionHandler4 = sduiActionHandler3;
                modifier5 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier5 = modifier2;
                eventLogger3 = current;
                screen3 = screen2;
                sduiActionHandler4 = sduiActionHandler2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeValuePropsSduiScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LegacyGoldUpgradeValuePropsSduiScreen3.GoldUpgradeValuePropsSduiScreen$lambda$2(pageContent, onBackClick, z, modifier5, eventLogger3, screen3, sduiActionHandler4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if ((599187 & i3) == 599186) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i4 == 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                int i82 = i3;
                Modifier modifier62 = modifier3;
                Screen screen42 = screen2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                if (pageContent.getHide_back_button()) {
                    EventLogger eventLogger42 = current;
                    if (pageContent.is_full_bleed()) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    eventLogger3 = eventLogger2;
                    screen3 = screen42;
                    sduiActionHandler4 = sduiActionHandler3;
                    modifier5 = modifier4;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void Toolbar(final boolean z, final EventLogger eventLogger, final Screen screen, final boolean z2, Modifier modifier, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        boolean z3;
        Modifier modifier2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1114007230);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(eventLogger) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(screen) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            z3 = z2;
        } else {
            z3 = z2;
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
            }
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function0) ? 131072 : 65536;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1114007230, i3, -1, "com.robinhood.android.gold.upgrade.legacy.Toolbar (LegacyGoldUpgradeValuePropsSduiScreen.kt:72)");
                }
                composer2 = composerStartRestartGroup;
                BentoAppBarKt.m20573BentoAppBarSGdaT3c(LegacyGoldUpgradeValuePropsSduiScreen.INSTANCE.getLambda$17256757$feature_gold_upgrade_externalRelease(), modifier2, ComposableLambda3.rememberComposableLambda(-887976607, true, new C181471(z, eventLogger, screen, function0), composerStartRestartGroup, 54), null, null, z3, false, null, null, 0L, null, composer2, ((i3 >> 9) & 112) | 1573254 | ((i3 << 6) & 458752), 0, 1944);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeValuePropsSduiScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LegacyGoldUpgradeValuePropsSduiScreen3.Toolbar$lambda$3(z, eventLogger, screen, z2, modifier3, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i2 & 32) == 0) {
        }
        if ((74899 & i3) == 74898) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = composerStartRestartGroup;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(LegacyGoldUpgradeValuePropsSduiScreen.INSTANCE.getLambda$17256757$feature_gold_upgrade_externalRelease(), modifier2, ComposableLambda3.rememberComposableLambda(-887976607, true, new C181471(z, eventLogger, screen, function0), composerStartRestartGroup, 54), null, null, z3, false, null, null, 0L, null, composer2, ((i3 >> 9) & 112) | 1573254 | ((i3 << 6) & 458752), 0, 1944);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        final Modifier modifier32 = modifier2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: LegacyGoldUpgradeValuePropsSduiScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeValuePropsSduiScreenKt$Toolbar$1 */
    static final class C181471 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ boolean $hideBackButton;
        final /* synthetic */ Function0<Unit> $onBackClick;
        final /* synthetic */ Screen $screen;

        C181471(boolean z, EventLogger eventLogger, Screen screen, Function0<Unit> function0) {
            this.$hideBackButton = z;
            this.$eventLogger = eventLogger;
            this.$screen = screen;
            this.$onBackClick = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
            invoke(bentoAppBarScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
            if ((i & 6) == 0) {
                i2 = ((i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-887976607, i2, -1, "com.robinhood.android.gold.upgrade.legacy.Toolbar.<anonymous> (LegacyGoldUpgradeValuePropsSduiScreen.kt:77)");
            }
            if (!this.$hideBackButton) {
                composer.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$screen) | composer.changed(this.$onBackClick);
                final EventLogger eventLogger = this.$eventLogger;
                final Screen screen = this.$screen;
                final Function0<Unit> function0 = this.$onBackClick;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeValuePropsSduiScreenKt$Toolbar$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LegacyGoldUpgradeValuePropsSduiScreen3.C181471.invoke$lambda$1$lambda$0(eventLogger, screen, function0);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i2 << 12) & 57344), 7);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, Screen screen, Function0 function0) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, new Component(Component.ComponentType.BACK_BUTTON, null, null, 6, null), null, null, false, 57, null);
            function0.invoke();
            return Unit.INSTANCE;
        }
    }
}
