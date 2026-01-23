package com.robinhood.android.account.accountfunding;

import android.net.Uri;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.account.models.onboarding.FundingOptionsViewModel;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdl;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertMobilePresentationStyle;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import rh_server_driven_ui.p531v1.AlertDto;
import rh_server_driven_ui.p531v1.GenericActionDto;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: AccountFundingOptionsComposable.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aC\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0001¢\u0006\u0002\u0010\u000b\u001aQ\u0010\f\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nH\u0001¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"AccountFundingOptionsScreen", "", "viewModel", "Lcom/robinhood/android/account/models/onboarding/FundingOptionsViewModel;", "onResolveDeeplink", "Lkotlin/Function1;", "Landroid/net/Uri;", "modifier", "Landroidx/compose/ui/Modifier;", "onCloseClicked", "Lkotlin/Function0;", "(Lcom/robinhood/android/account/models/onboarding/FundingOptionsViewModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "AccountFundingOptionsContent", "centerTitle", "", "onDismiss", "(Lcom/robinhood/android/account/models/onboarding/FundingOptionsViewModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "feature-account-funding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.account.accountfunding.AccountFundingOptionsComposableKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AccountFundingOptionsComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountFundingOptionsContent$lambda$2(FundingOptionsViewModel fundingOptionsViewModel, Function1 function1, Modifier modifier, boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        AccountFundingOptionsContent(fundingOptionsViewModel, function1, modifier, z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountFundingOptionsScreen$lambda$0(FundingOptionsViewModel fundingOptionsViewModel, Function1 function1, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        AccountFundingOptionsScreen(fundingOptionsViewModel, function1, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountFundingOptionsScreen(final FundingOptionsViewModel fundingOptionsViewModel, final Function1<? super Uri, Unit> onResolveDeeplink, Modifier modifier, final Function0<Unit> onCloseClicked, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onResolveDeeplink, "onResolveDeeplink");
        Intrinsics.checkNotNullParameter(onCloseClicked, "onCloseClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1093169761);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(fundingOptionsViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onResolveDeeplink) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onCloseClicked) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1093169761, i3, -1, "com.robinhood.android.account.accountfunding.AccountFundingOptionsScreen (AccountFundingOptionsComposable.kt:29)");
                }
                int i5 = ((i3 >> 6) & 14) | 805306416;
                composer2 = composerStartRestartGroup;
                Modifier modifier5 = modifier4;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, ComposableLambda3.rememberComposableLambda(329502237, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.account.accountfunding.AccountFundingOptionsComposableKt.AccountFundingOptionsScreen.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(329502237, i6, -1, "com.robinhood.android.account.accountfunding.AccountFundingOptionsScreen.<anonymous> (AccountFundingOptionsComposable.kt:33)");
                        }
                        Function2<Composer, Integer, Unit> function2M10785getLambda$1765793712$feature_account_funding_externalDebug = AccountFundingOptionsComposable5.INSTANCE.m10785getLambda$1765793712$feature_account_funding_externalDebug();
                        final Function0<Unit> function0 = onCloseClicked;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M10785getLambda$1765793712$feature_account_funding_externalDebug, null, ComposableLambda3.rememberComposableLambda(675777916, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.account.accountfunding.AccountFundingOptionsComposableKt.AccountFundingOptionsScreen.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i7) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i7 & 6) == 0) {
                                    i7 |= (i7 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(675777916, i7, -1, "com.robinhood.android.account.accountfunding.AccountFundingOptionsScreen.<anonymous>.<anonymous> (AccountFundingOptionsComposable.kt:36)");
                                }
                                BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-605066574, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.account.accountfunding.AccountFundingOptionsComposableKt.AccountFundingOptionsScreen.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i6 & 6) == 0) {
                            i6 |= composer3.changed(paddingValues) ? 4 : 2;
                        }
                        if ((i6 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-605066574, i6, -1, "com.robinhood.android.account.accountfunding.AccountFundingOptionsScreen.<anonymous> (AccountFundingOptionsComposable.kt:41)");
                        }
                        AccountFundingOptionsComposable.AccountFundingOptionsContent(fundingOptionsViewModel, onResolveDeeplink, PaddingKt.padding(Modifier.INSTANCE, paddingValues), false, null, composer3, 0, 24);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, i5, 508);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.account.accountfunding.AccountFundingOptionsComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AccountFundingOptionsComposable.AccountFundingOptionsScreen$lambda$0(fundingOptionsViewModel, onResolveDeeplink, modifier3, onCloseClicked, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i52 = ((i3 >> 6) & 14) | 805306416;
            composer2 = composerStartRestartGroup;
            Modifier modifier52 = modifier4;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier52, ComposableLambda3.rememberComposableLambda(329502237, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.account.accountfunding.AccountFundingOptionsComposableKt.AccountFundingOptionsScreen.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i6) {
                    if ((i6 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(329502237, i6, -1, "com.robinhood.android.account.accountfunding.AccountFundingOptionsScreen.<anonymous> (AccountFundingOptionsComposable.kt:33)");
                    }
                    Function2<Composer, Integer, Unit> function2M10785getLambda$1765793712$feature_account_funding_externalDebug = AccountFundingOptionsComposable5.INSTANCE.m10785getLambda$1765793712$feature_account_funding_externalDebug();
                    final Function0<Unit> function0 = onCloseClicked;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M10785getLambda$1765793712$feature_account_funding_externalDebug, null, ComposableLambda3.rememberComposableLambda(675777916, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.account.accountfunding.AccountFundingOptionsComposableKt.AccountFundingOptionsScreen.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                            invoke(bentoAppBarScope, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i7) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i7 & 6) == 0) {
                                i7 |= (i7 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(675777916, i7, -1, "com.robinhood.android.account.accountfunding.AccountFundingOptionsScreen.<anonymous>.<anonymous> (AccountFundingOptionsComposable.kt:36)");
                            }
                            BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-605066574, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.account.accountfunding.AccountFundingOptionsComposableKt.AccountFundingOptionsScreen.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i6 & 6) == 0) {
                        i6 |= composer3.changed(paddingValues) ? 4 : 2;
                    }
                    if ((i6 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-605066574, i6, -1, "com.robinhood.android.account.accountfunding.AccountFundingOptionsScreen.<anonymous> (AccountFundingOptionsComposable.kt:41)");
                    }
                    AccountFundingOptionsComposable.AccountFundingOptionsContent(fundingOptionsViewModel, onResolveDeeplink, PaddingKt.padding(Modifier.INSTANCE, paddingValues), false, null, composer3, 0, 24);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, i52, 508);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountFundingOptionsContent(final FundingOptionsViewModel fundingOptionsViewModel, final Function1<? super Uri, Unit> onResolveDeeplink, Modifier modifier, boolean z, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        Function0<Unit> function02;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        final boolean z3;
        final Function0<Unit> function03;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onResolveDeeplink, "onResolveDeeplink");
        Composer composerStartRestartGroup = composer.startRestartGroup(1067843280);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(fundingOptionsViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onResolveDeeplink) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
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
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        function02 = function0;
                        i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
                    }
                    if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        final boolean z4 = i4 == 0 ? false : z2;
                        final Function0<Unit> function04 = i5 == 0 ? null : function02;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1067843280, i3, -1, "com.robinhood.android.account.accountfunding.AccountFundingOptionsContent (AccountFundingOptionsComposable.kt:56)");
                        }
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        final FundingOptionsViewModel mockViewModel$feature_account_funding_externalDebug = fundingOptionsViewModel != null ? AccountFundingOptionsViewState.INSTANCE.getMockViewModel$feature_account_funding_externalDebug() : fundingOptionsViewModel;
                        LocalShowPlaceholder.Loadable(fundingOptionsViewModel != null, null, null, ComposableLambda3.rememberComposableLambda(1807600726, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.account.accountfunding.AccountFundingOptionsComposableKt$AccountFundingOptionsContent$1$1
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
                                    ComposerKt.traceEventStart(1807600726, i7, -1, "com.robinhood.android.account.accountfunding.AccountFundingOptionsContent.<anonymous>.<anonymous> (AccountFundingOptionsComposable.kt:61)");
                                }
                                String title = mockViewModel$feature_account_funding_externalDebug.getTitle();
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i8 = BentoTheme.$stable;
                                BentoText2.m20747BentoText38GnDrw(title, com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion2, 0.0f, bentoTheme.getSpacing(composer2, i8).m21592getMediumD9Ej5fM(), 1, null), null, null, null, null, TextAlign.m7912boximpl(z4 ? TextAlign.INSTANCE.m7919getCentere0LSkKk() : TextAlign.INSTANCE.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i8).getDisplayCapsuleMedium(), composer2, 0, 0, 8124);
                                composer2.startReplaceGroup(-1633490746);
                                boolean zChanged = composer2.changed(onResolveDeeplink) | composer2.changed(function04);
                                final Function1<Uri, Unit> function1 = onResolveDeeplink;
                                final Function0<Unit> function05 = function04;
                                Object objRememberedValue = composer2.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DtoActionHandler() { // from class: com.robinhood.android.account.accountfunding.AccountFundingOptionsComposableKt$AccountFundingOptionsContent$1$1$dtoActionHandler$1$1
                                        @Override // com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler
                                        public T convertAlertToAction(AlertDto alertDto) {
                                            return (T) DtoActionHandler.DefaultImpls.convertAlertToAction(this, alertDto);
                                        }

                                        @Override // com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler
                                        /* renamed from: handle-RsTtcXE, reason: not valid java name and merged with bridge method [inline-methods] */
                                        public final boolean mo10782handleRsTtcXE(GenericActionDto action, GenericAlertMobilePresentationStyle genericAlertMobilePresentationStyle, int i9) {
                                            Intrinsics.checkNotNullParameter(action, "action");
                                            Intrinsics.checkNotNullParameter(genericAlertMobilePresentationStyle, "<unused var>");
                                            GenericActionDto.ActionDto action2 = action.getAction();
                                            if (action2 instanceof GenericActionDto.ActionDto.Deeplink) {
                                                function1.invoke(Uri.parse(((GenericActionDto.ActionDto.Deeplink) action2).getValue().getUrl()));
                                                return true;
                                            }
                                            if (!(action2 instanceof GenericActionDto.ActionDto.Dismiss)) {
                                                return false;
                                            }
                                            Function0<Unit> function06 = function05;
                                            if (function06 != null) {
                                                function06.invoke();
                                            }
                                            return true;
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                composer2.endReplaceGroup();
                                final FundingOptionsViewModel fundingOptionsViewModel2 = mockViewModel$feature_account_funding_externalDebug;
                                SduiActionHandler3.ProvideActionHandler(null, (DtoActionHandler) objRememberedValue, ComposableLambda3.rememberComposableLambda(849342456, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.account.accountfunding.AccountFundingOptionsComposableKt$AccountFundingOptionsContent$1$1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i9) {
                                        if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(849342456, i9, -1, "com.robinhood.android.account.accountfunding.AccountFundingOptionsContent.<anonymous>.<anonymous>.<anonymous> (AccountFundingOptionsComposable.kt:88)");
                                        }
                                        List<UIComponentDto> contents = fundingOptionsViewModel2.getContents();
                                        ArrayList arrayList = new ArrayList();
                                        Iterator<T> it = contents.iterator();
                                        while (it.hasNext()) {
                                            UIComponentDto.ConcreteDto concrete = ((UIComponentDto) it.next()).getConcrete();
                                            if (concrete != null) {
                                                arrayList.add(concrete);
                                            }
                                        }
                                        ImmutableList immutableList = extensions2.toImmutableList(arrayList);
                                        composer3.startReplaceGroup(1849434622);
                                        Object objRememberedValue2 = composer3.rememberedValue();
                                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = AccountFundingOptionsComposable3.INSTANCE;
                                            composer3.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer3.endReplaceGroup();
                                        composer3.startReplaceGroup(40010095);
                                        SduiColumnsIdl.SduiColumn(immutableList, (Function1) ((KFunction) objRememberedValue2), GenericActionDto.class, Modifier.INSTANCE, null, null, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), true, composer3, 805306416, 0);
                                        composer3.endReplaceGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), composer2, 390, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        z3 = z4;
                        function03 = function04;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z3 = z2;
                        function03 = function02;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.account.accountfunding.AccountFundingOptionsComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return AccountFundingOptionsComposable.AccountFundingOptionsContent$lambda$2(fundingOptionsViewModel, onResolveDeeplink, modifier3, z3, function03, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                function02 = function0;
                if ((i3 & 9363) == 9362) {
                    if (i6 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        if (fundingOptionsViewModel != null) {
                        }
                        LocalShowPlaceholder.Loadable(fundingOptionsViewModel != null, null, null, ComposableLambda3.rememberComposableLambda(1807600726, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.account.accountfunding.AccountFundingOptionsComposableKt$AccountFundingOptionsContent$1$1
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
                                    ComposerKt.traceEventStart(1807600726, i7, -1, "com.robinhood.android.account.accountfunding.AccountFundingOptionsContent.<anonymous>.<anonymous> (AccountFundingOptionsComposable.kt:61)");
                                }
                                String title = mockViewModel$feature_account_funding_externalDebug.getTitle();
                                Modifier.Companion companion22 = Modifier.INSTANCE;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i8 = BentoTheme.$stable;
                                BentoText2.m20747BentoText38GnDrw(title, com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion22, 0.0f, bentoTheme.getSpacing(composer2, i8).m21592getMediumD9Ej5fM(), 1, null), null, null, null, null, TextAlign.m7912boximpl(z4 ? TextAlign.INSTANCE.m7919getCentere0LSkKk() : TextAlign.INSTANCE.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i8).getDisplayCapsuleMedium(), composer2, 0, 0, 8124);
                                composer2.startReplaceGroup(-1633490746);
                                boolean zChanged = composer2.changed(onResolveDeeplink) | composer2.changed(function04);
                                final Function1<? super Uri, Unit> function1 = onResolveDeeplink;
                                final Function0<Unit> function05 = function04;
                                Object objRememberedValue = composer2.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DtoActionHandler() { // from class: com.robinhood.android.account.accountfunding.AccountFundingOptionsComposableKt$AccountFundingOptionsContent$1$1$dtoActionHandler$1$1
                                        @Override // com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler
                                        public T convertAlertToAction(AlertDto alertDto) {
                                            return (T) DtoActionHandler.DefaultImpls.convertAlertToAction(this, alertDto);
                                        }

                                        @Override // com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler
                                        /* renamed from: handle-RsTtcXE, reason: not valid java name and merged with bridge method [inline-methods] */
                                        public final boolean mo10782handleRsTtcXE(GenericActionDto action, GenericAlertMobilePresentationStyle genericAlertMobilePresentationStyle, int i9) {
                                            Intrinsics.checkNotNullParameter(action, "action");
                                            Intrinsics.checkNotNullParameter(genericAlertMobilePresentationStyle, "<unused var>");
                                            GenericActionDto.ActionDto action2 = action.getAction();
                                            if (action2 instanceof GenericActionDto.ActionDto.Deeplink) {
                                                function1.invoke(Uri.parse(((GenericActionDto.ActionDto.Deeplink) action2).getValue().getUrl()));
                                                return true;
                                            }
                                            if (!(action2 instanceof GenericActionDto.ActionDto.Dismiss)) {
                                                return false;
                                            }
                                            Function0<Unit> function06 = function05;
                                            if (function06 != null) {
                                                function06.invoke();
                                            }
                                            return true;
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                composer2.endReplaceGroup();
                                final FundingOptionsViewModel fundingOptionsViewModel2 = mockViewModel$feature_account_funding_externalDebug;
                                SduiActionHandler3.ProvideActionHandler(null, (DtoActionHandler) objRememberedValue, ComposableLambda3.rememberComposableLambda(849342456, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.account.accountfunding.AccountFundingOptionsComposableKt$AccountFundingOptionsContent$1$1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i9) {
                                        if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(849342456, i9, -1, "com.robinhood.android.account.accountfunding.AccountFundingOptionsContent.<anonymous>.<anonymous>.<anonymous> (AccountFundingOptionsComposable.kt:88)");
                                        }
                                        List<UIComponentDto> contents = fundingOptionsViewModel2.getContents();
                                        ArrayList arrayList = new ArrayList();
                                        Iterator<T> it = contents.iterator();
                                        while (it.hasNext()) {
                                            UIComponentDto.ConcreteDto concrete = ((UIComponentDto) it.next()).getConcrete();
                                            if (concrete != null) {
                                                arrayList.add(concrete);
                                            }
                                        }
                                        ImmutableList immutableList = extensions2.toImmutableList(arrayList);
                                        composer3.startReplaceGroup(1849434622);
                                        Object objRememberedValue2 = composer3.rememberedValue();
                                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = AccountFundingOptionsComposable3.INSTANCE;
                                            composer3.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer3.endReplaceGroup();
                                        composer3.startReplaceGroup(40010095);
                                        SduiColumnsIdl.SduiColumn(immutableList, (Function1) ((KFunction) objRememberedValue2), GenericActionDto.class, Modifier.INSTANCE, null, null, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), true, composer3, 805306416, 0);
                                        composer3.endReplaceGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), composer2, 390, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier4;
                        z3 = z4;
                        function03 = function04;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            function02 = function0;
            if ((i3 & 9363) == 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        function02 = function0;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
