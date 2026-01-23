package com.robinhood.shared.common.agreementview;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoProgressBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AgreementScaffold.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ag\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"", "title", "Lkotlin/Function0;", "", "onBackClicked", "Landroidx/compose/ui/Modifier;", "modifier", "", "loading", "centerTitle", "bottomBar", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "AgreementScaffold", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "ProgressIndicatorHeight", "F", "lib-agreement-view_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.common.agreementview.AgreementScaffoldKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class AgreementScaffold {
    private static final float ProgressIndicatorHeight = C2002Dp.m7995constructorimpl(3);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AgreementScaffold$lambda$0(String str, Function0 function0, Modifier modifier, boolean z, boolean z2, Function2 function2, Function3 function3, int i, int i2, Composer composer, int i3) {
        AgreementScaffold(str, function0, modifier, z, z2, function2, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AgreementScaffold(final String title, final Function0<Unit> onBackClicked, Modifier modifier, boolean z, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function22;
        final Modifier modifier3;
        final boolean z5;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final boolean z6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(589004431);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClicked) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z3 = z;
                    i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        z4 = z2;
                        i3 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 != 0) {
                        if ((196608 & i) == 0) {
                            function22 = function2;
                            i3 |= composerStartRestartGroup.changedInstance(function22) ? 131072 : 65536;
                        }
                        if ((i2 & 64) != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(content) ? 1048576 : 524288;
                        }
                        if ((599187 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
                            modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                            final boolean z7 = i4 == 0 ? false : z3;
                            final boolean z8 = i5 == 0 ? z4 : false;
                            Function2<? super Composer, ? super Integer, Unit> lambda$1098200051$lib_agreement_view_externalDebug = i6 == 0 ? AgreementScaffold2.INSTANCE.getLambda$1098200051$lib_agreement_view_externalDebug() : function22;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(589004431, i3, -1, "com.robinhood.shared.common.agreementview.AgreementScaffold (AgreementScaffold.kt:27)");
                            }
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i8 = BentoTheme.$stable;
                            long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i8).m21371getBg0d7_KjU();
                            long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i8).m21425getFg0d7_KjU();
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1143921483, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.common.agreementview.AgreementScaffoldKt.AgreementScaffold.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i9) {
                                    if ((i9 & 3) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1143921483, i9, -1, "com.robinhood.shared.common.agreementview.AgreementScaffold.<anonymous> (AgreementScaffold.kt:34)");
                                    }
                                    AppBarType appBarType = z8 ? AppBarType.CENTER_ALIGNED : AppBarType.DEFAULT;
                                    final String str = title;
                                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(1904176318, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.common.agreementview.AgreementScaffoldKt.AgreementScaffold.1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i10) {
                                            if ((i10 & 3) == 2 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1904176318, i10, -1, "com.robinhood.shared.common.agreementview.AgreementScaffold.<anonymous>.<anonymous> (AgreementScaffold.kt:36)");
                                            }
                                            BentoText2.m20747BentoText38GnDrw(str, null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextL(), composer3, 0, 0, 8190);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer2, 54);
                                    final Function0<Unit> function0 = onBackClicked;
                                    ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambda3.rememberComposableLambda(-1092600086, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.common.agreementview.AgreementScaffoldKt.AgreementScaffold.1.2
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                                            invoke(bentoAppBarScope, composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i10) {
                                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                            if ((i10 & 6) == 0) {
                                                i10 |= (i10 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                                            }
                                            if ((i10 & 19) == 18 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1092600086, i10, -1, "com.robinhood.shared.common.agreementview.AgreementScaffold.<anonymous>.<anonymous> (AgreementScaffold.kt:47)");
                                            }
                                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer3, (BentoAppBarScope.$stable << 12) | ((i10 << 12) & 57344), 7);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer2, 54);
                                    final boolean z9 = z7;
                                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableLambdaRememberComposableLambda2, null, composableLambdaRememberComposableLambda3, null, ComposableLambda3.rememberComposableLambda(698551321, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.common.agreementview.AgreementScaffoldKt.AgreementScaffold.1.3
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                                            invoke(boxScope, composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(BoxScope BentoAppBar, Composer composer3, int i10) {
                                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                            if ((i10 & 17) == 16 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(698551321, i10, -1, "com.robinhood.shared.common.agreementview.AgreementScaffold.<anonymous>.<anonymous> (AgreementScaffold.kt:52)");
                                            }
                                            if (z9) {
                                                BentoProgressBar2.m20697BentoIndeterminateProgressBareaDK9VM(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), AgreementScaffold.ProgressIndicatorHeight), false, BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21368getAccent0d7_KjU(), 0L, composer3, 6, 10);
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer2, 54), false, false, appBarType, null, 0L, null, composer2, 24966, 0, 1898);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54);
                            int i9 = ((i3 >> 6) & 14) | 48 | ((i3 >> 9) & 896) | ((i3 << 9) & 1879048192);
                            boolean z9 = z7;
                            boolean z10 = z8;
                            Function2<? super Composer, ? super Integer, Unit> function24 = lambda$1098200051$lib_agreement_view_externalDebug;
                            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier3, composableLambdaRememberComposableLambda, function24, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, content, composerStartRestartGroup, i9, EnumC7081g.f2774x74902ae0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z9;
                            function23 = function24;
                            z6 = z10;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            z5 = z3;
                            z6 = z4;
                            function23 = function22;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.common.agreementview.AgreementScaffoldKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return AgreementScaffold.AgreementScaffold$lambda$0(title, onBackClicked, modifier3, z5, z6, function23, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 196608;
                    function22 = function2;
                    if ((i2 & 64) != 0) {
                    }
                    if ((599187 & i3) != 599186) {
                        if (i7 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i82 = BentoTheme.$stable;
                        long jM21371getBg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i82).m21371getBg0d7_KjU();
                        long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i82).m21425getFg0d7_KjU();
                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(1143921483, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.common.agreementview.AgreementScaffoldKt.AgreementScaffold.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i92) {
                                if ((i92 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1143921483, i92, -1, "com.robinhood.shared.common.agreementview.AgreementScaffold.<anonymous> (AgreementScaffold.kt:34)");
                                }
                                AppBarType appBarType = z8 ? AppBarType.CENTER_ALIGNED : AppBarType.DEFAULT;
                                final String str = title;
                                ComposableLambda composableLambdaRememberComposableLambda22 = ComposableLambda3.rememberComposableLambda(1904176318, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.common.agreementview.AgreementScaffoldKt.AgreementScaffold.1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i10) {
                                        if ((i10 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1904176318, i10, -1, "com.robinhood.shared.common.agreementview.AgreementScaffold.<anonymous>.<anonymous> (AgreementScaffold.kt:36)");
                                        }
                                        BentoText2.m20747BentoText38GnDrw(str, null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextL(), composer3, 0, 0, 8190);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54);
                                final Function0<Unit> function0 = onBackClicked;
                                ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambda3.rememberComposableLambda(-1092600086, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.common.agreementview.AgreementScaffoldKt.AgreementScaffold.1.2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                                        invoke(bentoAppBarScope, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i10) {
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i10 & 6) == 0) {
                                            i10 |= (i10 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                                        }
                                        if ((i10 & 19) == 18 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1092600086, i10, -1, "com.robinhood.shared.common.agreementview.AgreementScaffold.<anonymous>.<anonymous> (AgreementScaffold.kt:47)");
                                        }
                                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer3, (BentoAppBarScope.$stable << 12) | ((i10 << 12) & 57344), 7);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54);
                                final boolean z92 = z7;
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableLambdaRememberComposableLambda22, null, composableLambdaRememberComposableLambda3, null, ComposableLambda3.rememberComposableLambda(698551321, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.common.agreementview.AgreementScaffoldKt.AgreementScaffold.1.3
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                                        invoke(boxScope, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BoxScope BentoAppBar, Composer composer3, int i10) {
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i10 & 17) == 16 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(698551321, i10, -1, "com.robinhood.shared.common.agreementview.AgreementScaffold.<anonymous>.<anonymous> (AgreementScaffold.kt:52)");
                                        }
                                        if (z92) {
                                            BentoProgressBar2.m20697BentoIndeterminateProgressBareaDK9VM(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), AgreementScaffold.ProgressIndicatorHeight), false, BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21368getAccent0d7_KjU(), 0L, composer3, 6, 10);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), false, false, appBarType, null, 0L, null, composer2, 24966, 0, 1898);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54);
                        int i92 = ((i3 >> 6) & 14) | 48 | ((i3 >> 9) & 896) | ((i3 << 9) & 1879048192);
                        boolean z92 = z7;
                        boolean z102 = z8;
                        Function2<? super Composer, ? super Integer, Unit> function242 = lambda$1098200051$lib_agreement_view_externalDebug;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifier3, composableLambdaRememberComposableLambda2, function242, null, null, 0, jM21371getBg0d7_KjU2, jM21425getFg0d7_KjU2, null, content, composerStartRestartGroup, i92, EnumC7081g.f2774x74902ae0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z5 = z92;
                        function23 = function242;
                        z6 = z102;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z4 = z2;
                i6 = i2 & 32;
                if (i6 != 0) {
                }
                function22 = function2;
                if ((i2 & 64) != 0) {
                }
                if ((599187 & i3) != 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z3 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            z4 = z2;
            i6 = i2 & 32;
            if (i6 != 0) {
            }
            function22 = function2;
            if ((i2 & 64) != 0) {
            }
            if ((599187 & i3) != 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        z4 = z2;
        i6 = i2 & 32;
        if (i6 != 0) {
        }
        function22 = function2;
        if ((i2 & 64) != 0) {
        }
        if ((599187 & i3) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
