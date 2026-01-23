package com.robinhood.shared.crypto.transfer.enrollment.protect;

import android.content.Context;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.compose.BackHandler5;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.crypto.transfer.enrollment.protect.EnrollmentProtectComposable4;
import com.robinhood.utils.extensions.Contexts8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EnrollmentProtectComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a3\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u0007\u001a\u0017\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\t\u001a)\u0010\n\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0003¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"EnrollmentProtectComposable", "", "acknowledged", "Lkotlin/Function0;", "learnMore", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Content", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Footer", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-crypto-transfer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.enrollment.protect.EnrollmentProtectComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class EnrollmentProtectComposable4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$1(Modifier modifier, int i, int i2, Composer composer, int i3) {
        Content(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EnrollmentProtectComposable$lambda$0(Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EnrollmentProtectComposable(function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Footer$lambda$6(Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        Footer(function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EnrollmentProtectComposable(final Function0<Unit> acknowledged, final Function0<Unit> learnMore, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(acknowledged, "acknowledged");
        Intrinsics.checkNotNullParameter(learnMore, "learnMore");
        Composer composerStartRestartGroup = composer.startRestartGroup(2012683248);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(acknowledged) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(learnMore) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2012683248, i3, -1, "com.robinhood.shared.crypto.transfer.enrollment.protect.EnrollmentProtectComposable (EnrollmentProtectComposable.kt:43)");
                }
                OnBackPressedDispatcherOwner current = BackHandler5.INSTANCE.getCurrent(composerStartRestartGroup, BackHandler5.$stable);
                final OnBackPressedDispatcher onBackPressedDispatcher = current == null ? current.getOnBackPressedDispatcher() : null;
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null)), ComposableLambda3.rememberComposableLambda(1912430772, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.protect.EnrollmentProtectComposableKt.EnrollmentProtectComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1912430772, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.protect.EnrollmentProtectComposable.<anonymous> (EnrollmentProtectComposable.kt:50)");
                        }
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(EnrollmentProtectComposable.INSTANCE.m25009getLambda$1959070175$feature_crypto_transfer_externalDebug(), null, ComposableLambda3.rememberComposableLambda(1198021493, true, new AnonymousClass1(onBackPressedDispatcher), composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: EnrollmentProtectComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.transfer.enrollment.protect.EnrollmentProtectComposableKt$EnrollmentProtectComposable$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                        final /* synthetic */ OnBackPressedDispatcher $backPressedDispatcher;

                        AnonymousClass1(OnBackPressedDispatcher onBackPressedDispatcher) {
                            this.$backPressedDispatcher = onBackPressedDispatcher;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                            invoke(bentoAppBarScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i & 6) == 0) {
                                i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i & 19) == 18 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1198021493, i, -1, "com.robinhood.shared.crypto.transfer.enrollment.protect.EnrollmentProtectComposable.<anonymous>.<anonymous> (EnrollmentProtectComposable.kt:53)");
                            }
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(this.$backPressedDispatcher);
                            final OnBackPressedDispatcher onBackPressedDispatcher = this.$backPressedDispatcher;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.enrollment.protect.EnrollmentProtectComposableKt$EnrollmentProtectComposable$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return EnrollmentProtectComposable4.C379851.AnonymousClass1.invoke$lambda$1$lambda$0(onBackPressedDispatcher);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(OnBackPressedDispatcher onBackPressedDispatcher) {
                            if (onBackPressedDispatcher != null) {
                                onBackPressedDispatcher.onBackPressed();
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1582961995, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.protect.EnrollmentProtectComposableKt.EnrollmentProtectComposable.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1582961995, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.protect.EnrollmentProtectComposable.<anonymous> (EnrollmentProtectComposable.kt:67)");
                        }
                        EnrollmentProtectComposable4.Footer(acknowledged, learnMore, composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, 0, 0L, 0L, null, EnrollmentProtectComposable.INSTANCE.m25008getLambda$1381870721$feature_crypto_transfer_externalDebug(), composer2, 805306800, 504);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.enrollment.protect.EnrollmentProtectComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EnrollmentProtectComposable4.EnrollmentProtectComposable$lambda$0(acknowledged, learnMore, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            OnBackPressedDispatcherOwner current2 = BackHandler5.INSTANCE.getCurrent(composerStartRestartGroup, BackHandler5.$stable);
            if (current2 == null) {
            }
            Modifier modifier52 = modifier4;
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m5939ScaffoldTvnljyQ(WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null)), ComposableLambda3.rememberComposableLambda(1912430772, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.protect.EnrollmentProtectComposableKt.EnrollmentProtectComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1912430772, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.protect.EnrollmentProtectComposable.<anonymous> (EnrollmentProtectComposable.kt:50)");
                    }
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(EnrollmentProtectComposable.INSTANCE.m25009getLambda$1959070175$feature_crypto_transfer_externalDebug(), null, ComposableLambda3.rememberComposableLambda(1198021493, true, new AnonymousClass1(onBackPressedDispatcher), composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: EnrollmentProtectComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.crypto.transfer.enrollment.protect.EnrollmentProtectComposableKt$EnrollmentProtectComposable$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                    final /* synthetic */ OnBackPressedDispatcher $backPressedDispatcher;

                    AnonymousClass1(OnBackPressedDispatcher onBackPressedDispatcher) {
                        this.$backPressedDispatcher = onBackPressedDispatcher;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                        invoke(bentoAppBarScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i & 6) == 0) {
                            i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
                        }
                        if ((i & 19) == 18 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1198021493, i, -1, "com.robinhood.shared.crypto.transfer.enrollment.protect.EnrollmentProtectComposable.<anonymous>.<anonymous> (EnrollmentProtectComposable.kt:53)");
                        }
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(this.$backPressedDispatcher);
                        final OnBackPressedDispatcher onBackPressedDispatcher = this.$backPressedDispatcher;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.enrollment.protect.EnrollmentProtectComposableKt$EnrollmentProtectComposable$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return EnrollmentProtectComposable4.C379851.AnonymousClass1.invoke$lambda$1$lambda$0(onBackPressedDispatcher);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(OnBackPressedDispatcher onBackPressedDispatcher) {
                        if (onBackPressedDispatcher != null) {
                            onBackPressedDispatcher.onBackPressed();
                        }
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1582961995, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.protect.EnrollmentProtectComposableKt.EnrollmentProtectComposable.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1582961995, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.protect.EnrollmentProtectComposable.<anonymous> (EnrollmentProtectComposable.kt:67)");
                    }
                    EnrollmentProtectComposable4.Footer(acknowledged, learnMore, composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, 0, 0L, 0L, null, EnrollmentProtectComposable.INSTANCE.m25008getLambda$1381870721$feature_crypto_transfer_externalDebug(), composer2, 805306800, 504);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Content(Modifier modifier, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-517864455);
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
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-517864455, i3, -1, "com.robinhood.shared.crypto.transfer.enrollment.protect.Content (EnrollmentProtectComposable.kt:75)");
            }
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CRYPTO_TRANSFER_ENROLLMENT_FRAUD_INFO, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-302897500, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.protect.EnrollmentProtectComposableKt.Content.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-302897500, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.protect.Content.<anonymous> (EnrollmentProtectComposable.kt:79)");
                    }
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(ModifiersKt.logScreenTransitions(PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxSize$default, 0.0f, bentoTheme.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), 5, null), (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierVerticalScroll$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    boolean zIsRhcApp = Contexts8.isRhcApp((Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_enrollment_protect_title, composer2, 0), com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, composer2, 6, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i6).getBookCoverCapsuleSmall(), composer2, 0, 0, 8188);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM()), composer2, 0);
                    String strStringResource = StringResources_androidKt.stringResource(C37934R.string.crypto_enrollment_protect_value_prop_1_title, composer2, 0);
                    String strStringResource2 = StringResources_androidKt.stringResource(zIsRhcApp ? C37934R.string.crypto_enrollment_protect_value_prop_1_subtitle_rhc : C37934R.string.crypto_enrollment_protect_value_prop_1_subtitle, composer2, 0);
                    BentoValuePropRow2.Icon icon = new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.TRIANGLE_ALERT_24, null, 2, null);
                    BentoValuePropRow bentoValuePropRow = BentoValuePropRow.Top;
                    int i7 = BentoValuePropRow2.Icon.$stable;
                    BentoValuePropRow3.BentoValuePropRow(strStringResource, strStringResource2, icon, bentoValuePropRow, (Modifier) null, composer2, (i7 << 6) | 3072, 16);
                    BentoValuePropRow3.BentoValuePropRow(StringResources_androidKt.stringResource(C37934R.string.crypto_enrollment_protect_value_prop_2_title, composer2, 0), StringResources_androidKt.stringResource(C37934R.string.crypto_enrollment_protect_value_prop_2_subtitle, composer2, 0), new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.LOCK_24, null, 2, null), bentoValuePropRow, (Modifier) null, composer2, (i7 << 6) | 3072, 16);
                    BentoValuePropRow3.BentoValuePropRow(StringResources_androidKt.stringResource(C37934R.string.crypto_enrollment_protect_value_prop_3_title, composer2, 0), StringResources_androidKt.stringResource(C37934R.string.crypto_enrollment_protect_value_prop_3_subtitle, composer2, 0), new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.PERSON_24, null, 2, null), bentoValuePropRow, (Modifier) null, composer2, (i7 << 6) | 3072, 16);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.enrollment.protect.EnrollmentProtectComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EnrollmentProtectComposable4.Content$lambda$1(modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Footer(final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-852951000);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-852951000, i2, -1, "com.robinhood.shared.crypto.transfer.enrollment.protect.Footer (EnrollmentProtectComposable.kt:130)");
            }
            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, composerStartRestartGroup, 6, 1);
            String strStringResource = StringResources_androidKt.stringResource(C37934R.string.crypto_enrollment_acknowledge, composerStartRestartGroup, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_action_learn_more, composerStartRestartGroup, 0);
            String strStringResource3 = StringResources_androidKt.stringResource(C37934R.string.crypto_enrollment_protect_disclaimer, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance = ((i2 & 14) == 4) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.enrollment.protect.EnrollmentProtectComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EnrollmentProtectComposable4.Footer$lambda$3$lambda$2(current, userInteractionEventDescriptor, function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function03 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | ((i2 & 112) == 32);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.enrollment.protect.EnrollmentProtectComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EnrollmentProtectComposable4.Footer$lambda$5$lambda$4(current, userInteractionEventDescriptor, function02);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            BentoButtonBar2.BentoButtonBar(modifierM21623defaultHorizontalPaddingrAjV9yQ, strStringResource3, null, false, null, null, function03, strStringResource, false, null, false, (Function0) objRememberedValue2, strStringResource2, false, null, false, composer2, 0, 0, 59196);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.enrollment.protect.EnrollmentProtectComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EnrollmentProtectComposable4.Footer$lambda$6(function0, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Footer$lambda$3$lambda$2(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Function0 function0) {
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.DONE, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Footer$lambda$5$lambda$4(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Function0 function0) {
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.LEARN_MORE, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
        function0.invoke();
        return Unit.INSTANCE;
    }
}
