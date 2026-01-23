package com.robinhood.microgram.sdui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.robinhood.android.common.BuildConfig;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.microgram.sdui.MicrogramScreenDuxo2;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CanvasContent.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u008e\u0002"}, m3636d2 = {"CanvasContent", "", "url", "", "invokeJavascriptRequest", "Lcom/robinhood/microgram/sdui/ScreenEvent$InvokeJavascript;", "onHtmlCanvasCustomMessage", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Lcom/robinhood/microgram/sdui/ScreenEvent$InvokeJavascript;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-microgram-sdui_externalDebug", "backgroundLoaded", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.microgram.sdui.CanvasContentKt, reason: use source file name */
/* loaded from: classes13.dex */
public final class CanvasContent {
    /* JADX INFO: Access modifiers changed from: private */
    public static final WebView CanvasContent$lambda$11$lambda$10(WebView webView, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return webView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CanvasContent$lambda$12(String str, MicrogramScreenDuxo2.InvokeJavascript invokeJavascript, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CanvasContent(str, invokeJavascript, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    @SuppressLint({"SetJavaScriptEnabled"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CanvasContent(final String url, final MicrogramScreenDuxo2.InvokeJavascript invokeJavascript, final Function1<? super String, Unit> onHtmlCanvasCustomMessage, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        AppCompatActivity appCompatActivityFindActivityBaseContext;
        Object objRememberedValue2;
        final WebView webView;
        boolean zChangedInstance;
        Object objRememberedValue3;
        boolean zChangedInstance2;
        Object objRememberedValue4;
        boolean zChangedInstance3;
        Object objRememberedValue5;
        final Modifier modifier3;
        Window window;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(onHtmlCanvasCustomMessage, "onHtmlCanvasCustomMessage");
        Composer composerStartRestartGroup = composer.startRestartGroup(724948499);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(url) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(invokeJavascript) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onHtmlCanvasCustomMessage) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(724948499, i3, -1, "com.robinhood.microgram.sdui.CanvasContent (CanvasContent.kt:33)");
                }
                final HapticFeedback hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                appCompatActivityFindActivityBaseContext = BaseContexts.findActivityBaseContext((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
                if (appCompatActivityFindActivityBaseContext != null && (window = appCompatActivityFindActivityBaseContext.getWindow()) != null) {
                    window.setFlags(16777216, 16777216);
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                Object obj = objRememberedValue2;
                if (objRememberedValue2 == companion.getEmpty()) {
                    WebView webView2 = new WebView(context);
                    webView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    if (BuildConfig.DEBUG) {
                        webView2.clearCache(true);
                    }
                    webView2.setBackgroundColor(0);
                    webView2.setWebViewClient(new WebViewClient() { // from class: com.robinhood.microgram.sdui.CanvasContentKt$CanvasContent$webView$1$1$1
                        @Override // android.webkit.WebViewClient
                        public void onPageFinished(WebView view, String url2) {
                            Intrinsics.checkNotNullParameter(view, "view");
                            super.onPageFinished(view, url2);
                            if (view.getProgress() == 100) {
                                CanvasContent.CanvasContent$lambda$2(snapshotState, true);
                            }
                        }
                    });
                    OnClickListeners.onClick(webView2, new Function0() { // from class: com.robinhood.microgram.sdui.CanvasContentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CanvasContent.CanvasContent$lambda$5$lambda$4$lambda$3(hapticFeedback);
                        }
                    });
                    webView2.getSettings().setJavaScriptEnabled(true);
                    webView2.setWebChromeClient(new WebChromeClient());
                    webView2.getSettings().setLoadWithOverviewMode(false);
                    webView2.getSettings().setSupportZoom(false);
                    webView2.getSettings().setDomStorageEnabled(true);
                    webView2.addJavascriptInterface(new Object() { // from class: com.robinhood.microgram.sdui.CanvasContentKt$CanvasContent$webView$1$1$3
                        @JavascriptInterface
                        public final void handleMessage(String message) {
                            Intrinsics.checkNotNullParameter(message, "message");
                            onHtmlCanvasCustomMessage.invoke(message);
                        }
                    }, "HtmlCanvasContentBridge");
                    webView2.loadUrl(url);
                    composerStartRestartGroup.updateRememberedValue(webView2);
                    obj = webView2;
                }
                webView = (WebView) obj;
                composerStartRestartGroup.endReplaceGroup();
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(webView);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.microgram.sdui.CanvasContentKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return CanvasContent.CanvasContent$lambda$8$lambda$7(webView, (DisposableEffectScope) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(invokeJavascript) | composerStartRestartGroup.changedInstance(webView);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new CanvasContent2(invokeJavascript, webView, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(invokeJavascript, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, (i3 >> 3) & 14);
                Modifier modifierIsInvisible = ModifiersKt.isInvisible(modifier4, !CanvasContent$lambda$1(snapshotState));
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance3 = composerStartRestartGroup.changedInstance(webView);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance3 || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new Function1() { // from class: com.robinhood.microgram.sdui.CanvasContentKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return CanvasContent.CanvasContent$lambda$11$lambda$10(webView, (Context) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                AndroidView_androidKt.AndroidView((Function1) objRememberedValue5, modifierIsInvisible, null, composerStartRestartGroup, 0, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.microgram.sdui.CanvasContentKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return CanvasContent.CanvasContent$lambda$12(url, invokeJavascript, onHtmlCanvasCustomMessage, modifier3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final HapticFeedback hapticFeedback2 = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            final SnapshotState<Boolean> snapshotState2 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            appCompatActivityFindActivityBaseContext = BaseContexts.findActivityBaseContext((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
            if (appCompatActivityFindActivityBaseContext != null) {
                window.setFlags(16777216, 16777216);
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Object obj2 = objRememberedValue2;
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            webView = (WebView) obj2;
            composerStartRestartGroup.endReplaceGroup();
            Unit unit2 = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChangedInstance = composerStartRestartGroup.changedInstance(webView);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.microgram.sdui.CanvasContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj22) {
                        return CanvasContent.CanvasContent$lambda$8$lambda$7(webView, (DisposableEffectScope) obj22);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.DisposableEffect(unit2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(invokeJavascript) | composerStartRestartGroup.changedInstance(webView);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2) {
                    objRememberedValue4 = new CanvasContent2(invokeJavascript, webView, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(invokeJavascript, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, (i3 >> 3) & 14);
                    Modifier modifierIsInvisible2 = ModifiersKt.isInvisible(modifier4, !CanvasContent$lambda$1(snapshotState2));
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance3 = composerStartRestartGroup.changedInstance(webView);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance3) {
                        objRememberedValue5 = new Function1() { // from class: com.robinhood.microgram.sdui.CanvasContentKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj22) {
                                return CanvasContent.CanvasContent$lambda$11$lambda$10(webView, (Context) obj22);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        composerStartRestartGroup.endReplaceGroup();
                        AndroidView_androidKt.AndroidView((Function1) objRememberedValue5, modifierIsInvisible2, null, composerStartRestartGroup, 0, 4);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier4;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CanvasContent$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult CanvasContent$lambda$8$lambda$7(final WebView webView, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new DisposableEffectResult() { // from class: com.robinhood.microgram.sdui.CanvasContentKt$CanvasContent$lambda$8$lambda$7$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                webView.destroy();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CanvasContent$lambda$5$lambda$4$lambda$3(HapticFeedback hapticFeedback) {
        hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
        return Unit.INSTANCE;
    }

    private static final boolean CanvasContent$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }
}
