package com.robinhood.android.creditcard.p091ui.creditapplication.downloadapp;

import android.content.Context;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationScaffoldKt;
import com.robinhood.android.creditcard.p091ui.creditapplication.downloadapp.DownloadAppComposable3;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DownloadAppComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a'\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0006\"\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"DownloadApp", "", "onClosePress", "Lkotlin/Function0;", "appStoreUrl", "", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "DOWNLOAD_APP_TITLE_TEST_TAG", "DOWNLOAD_APP_SUBTITLE_TEST_TAG", "feature-credit-card_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.downloadapp.DownloadAppComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class DownloadAppComposable3 {
    public static final String DOWNLOAD_APP_SUBTITLE_TEST_TAG = "download-app-subtitle-test-tag";
    public static final String DOWNLOAD_APP_TITLE_TEST_TAG = "download-app-title-test-tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DownloadApp$lambda$0(Function0 function0, String str, int i, int i2, Composer composer, int i3) {
        DownloadApp(function0, str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DownloadApp(final Function0<Unit> onClosePress, String str, Composer composer, final int i, final int i2) {
        int i3;
        final String str2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClosePress, "onClosePress");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1219865721);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onClosePress) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                str2 = str;
                i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                String str3 = i4 == 0 ? null : str2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1219865721, i3, -1, "com.robinhood.android.creditcard.ui.creditapplication.downloadapp.DownloadApp (DownloadAppComposable.kt:44)");
                }
                final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceGroup(235121259);
                final String strStringResource = str3 != null ? StringResources_androidKt.stringResource(C12201R.string.credit_app_download_app_link, composerStartRestartGroup, 0) : str3;
                composerStartRestartGroup.endReplaceGroup();
                BentoTheme2.BentoTheme(Boolean.FALSE, null, Boolean.TRUE, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1933946687, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.downloadapp.DownloadAppComposableKt.DownloadApp.1
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
                            ComposerKt.traceEventStart(1933946687, i5, -1, "com.robinhood.android.creditcard.ui.creditapplication.downloadapp.DownloadApp.<anonymous> (DownloadAppComposable.kt:49)");
                        }
                        Screen screen = new Screen(Screen.Name.CC_APPLICATION_DOWNLOAD_APP, null, null, null, 14, null);
                        Function0<Unit> function0 = onClosePress;
                        final EventLogger eventLogger = current;
                        final Context context2 = context;
                        final String str4 = strStringResource;
                        CreditApplicationScaffoldKt.m12623CreditApplicationScaffoldTuSUGN0(screen, null, null, null, function0, null, null, ComposableLambda3.rememberComposableLambda(-892382822, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.downloadapp.DownloadAppComposableKt.DownloadApp.1.1

                            /* compiled from: DownloadAppComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.downloadapp.DownloadAppComposableKt$DownloadApp$1$1$1, reason: invalid class name and collision with other inner class name */
                            static final class C497211 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ Context $context;
                                final /* synthetic */ String $downloadLink;
                                final /* synthetic */ EventLogger $eventLogger;

                                C497211(EventLogger eventLogger, Context context, String str) {
                                    this.$eventLogger = eventLogger;
                                    this.$context = context;
                                    this.$downloadLink = str;
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
                                        ComposerKt.traceEventStart(-215870100, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.downloadapp.DownloadApp.<anonymous>.<anonymous>.<anonymous> (DownloadAppComposable.kt:54)");
                                    }
                                    String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_download_app_cta, composer, 0);
                                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, composer, 6, 1);
                                    composer.startReplaceGroup(-1746271574);
                                    boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$context) | composer.changed(this.$downloadLink);
                                    final EventLogger eventLogger = this.$eventLogger;
                                    final Context context = this.$context;
                                    final String str = this.$downloadLink;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.downloadapp.DownloadAppComposableKt$DownloadApp$1$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return DownloadAppComposable3.C123271.AnonymousClass1.C497211.invoke$lambda$1$lambda$0(eventLogger, context, str);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    BentoButtonBar2.BentoButtonBar(modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, false, null, null, (Function0) objRememberedValue, strStringResource, false, null, false, null, null, false, null, false, composer, 0, 0, 65342);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, Context context, String str) {
                                    EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.DOWNLOAD, loggingUtils.getCcScreen(), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
                                    WebUtils.viewUrl$default(context, str, 0, 4, (Object) null);
                                    return Unit.INSTANCE;
                                }
                            }

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
                                    ComposerKt.traceEventStart(-892382822, i6, -1, "com.robinhood.android.creditcard.ui.creditapplication.downloadapp.DownloadApp.<anonymous>.<anonymous> (DownloadAppComposable.kt:53)");
                                }
                                BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21425getFg0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-215870100, true, new C497211(eventLogger, context2, str4), composer3, 54), composer3, 805306368, 510);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), null, null, false, false, DownloadAppComposable.INSTANCE.getLambda$950288651$feature_credit_card_externalDebug(), composer2, 12582912, 384, 3950);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663686, 250);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str2 = str3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.downloadapp.DownloadAppComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DownloadAppComposable3.DownloadApp$lambda$0(onClosePress, str2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        str2 = str;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceGroup(235121259);
            if (str3 != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoTheme2.BentoTheme(Boolean.FALSE, null, Boolean.TRUE, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1933946687, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.downloadapp.DownloadAppComposableKt.DownloadApp.1
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
                        ComposerKt.traceEventStart(1933946687, i5, -1, "com.robinhood.android.creditcard.ui.creditapplication.downloadapp.DownloadApp.<anonymous> (DownloadAppComposable.kt:49)");
                    }
                    Screen screen = new Screen(Screen.Name.CC_APPLICATION_DOWNLOAD_APP, null, null, null, 14, null);
                    Function0<Unit> function0 = onClosePress;
                    final EventLogger eventLogger = current2;
                    final Context context22 = context2;
                    final String str4 = strStringResource;
                    CreditApplicationScaffoldKt.m12623CreditApplicationScaffoldTuSUGN0(screen, null, null, null, function0, null, null, ComposableLambda3.rememberComposableLambda(-892382822, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.downloadapp.DownloadAppComposableKt.DownloadApp.1.1

                        /* compiled from: DownloadAppComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.downloadapp.DownloadAppComposableKt$DownloadApp$1$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C497211 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ Context $context;
                            final /* synthetic */ String $downloadLink;
                            final /* synthetic */ EventLogger $eventLogger;

                            C497211(EventLogger eventLogger, Context context, String str) {
                                this.$eventLogger = eventLogger;
                                this.$context = context;
                                this.$downloadLink = str;
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
                                    ComposerKt.traceEventStart(-215870100, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.downloadapp.DownloadApp.<anonymous>.<anonymous>.<anonymous> (DownloadAppComposable.kt:54)");
                                }
                                String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_download_app_cta, composer, 0);
                                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, composer, 6, 1);
                                composer.startReplaceGroup(-1746271574);
                                boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$context) | composer.changed(this.$downloadLink);
                                final EventLogger eventLogger = this.$eventLogger;
                                final Context context = this.$context;
                                final String str = this.$downloadLink;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.downloadapp.DownloadAppComposableKt$DownloadApp$1$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return DownloadAppComposable3.C123271.AnonymousClass1.C497211.invoke$lambda$1$lambda$0(eventLogger, context, str);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                BentoButtonBar2.BentoButtonBar(modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, false, null, null, (Function0) objRememberedValue, strStringResource, false, null, false, null, null, false, null, false, composer, 0, 0, 65342);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, Context context, String str) {
                                EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.DOWNLOAD, loggingUtils.getCcScreen(), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
                                WebUtils.viewUrl$default(context, str, 0, 4, (Object) null);
                                return Unit.INSTANCE;
                            }
                        }

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
                                ComposerKt.traceEventStart(-892382822, i6, -1, "com.robinhood.android.creditcard.ui.creditapplication.downloadapp.DownloadApp.<anonymous>.<anonymous> (DownloadAppComposable.kt:53)");
                            }
                            BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21425getFg0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-215870100, true, new C497211(eventLogger, context22, str4), composer3, 54), composer3, 805306368, 510);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), null, null, false, false, DownloadAppComposable.INSTANCE.getLambda$950288651$feature_credit_card_externalDebug(), composer2, 12582912, 384, 3950);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663686, 250);
            if (ComposerKt.isTraceInProgress()) {
            }
            str2 = str3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
