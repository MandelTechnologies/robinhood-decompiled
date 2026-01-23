package com.robinhood.android.gold.sage;

import android.net.Uri;
import android.webkit.WebView;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.gold.lib.sage.GoldSageWebViewCallbacks;
import com.robinhood.android.gold.lib.sage.GoldSageWebViewComposable;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import gold.proto.p464v1.CreateSageApplicationResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;

/* compiled from: GoldSageApplicationComposable.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u008d\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032#\u0010\u0004\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u00052#\u0010\n\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0001¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"GoldSageApplicationComposable", "", "sageApplicationResponse", "Lgold/proto/v1/CreateSageApplicationResponse;", "openUrlExternally", "Lkotlin/Function1;", "Landroid/net/Uri;", "Lkotlin/ParameterName;", "name", "uri", "openUrlInApp", "finishActivity", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "(Lgold/proto/v1/CreateSageApplicationResponse;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Context;Landroidx/compose/runtime/Composer;II)V", "feature-gold-sage_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.sage.GoldSageApplicationComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldSageApplicationComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldSageApplicationComposable$lambda$0(CreateSageApplicationResponse createSageApplicationResponse, Function1 function1, Function1 function12, Function0 function0, Modifier modifier, Screen screen, Context context, int i, int i2, Composer composer, int i3) {
        GoldSageApplicationComposable(createSageApplicationResponse, function1, function12, function0, modifier, screen, context, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012a  */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.robinhood.android.gold.sage.GoldSageApplicationComposableKt$GoldSageApplicationComposable$callbacks$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldSageApplicationComposable(final CreateSageApplicationResponse sageApplicationResponse, final Function1<? super Uri, Unit> openUrlExternally, final Function1<? super Uri, Unit> openUrlInApp, final Function0<Unit> finishActivity, Modifier modifier, Screen screen, Context context, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Screen screen2;
        int i4;
        Context context2;
        final Modifier modifier3;
        Context context3;
        Screen screen3;
        final Modifier modifier4;
        Composer composer2;
        final Screen screen4;
        final Context context4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(sageApplicationResponse, "sageApplicationResponse");
        Intrinsics.checkNotNullParameter(openUrlExternally, "openUrlExternally");
        Intrinsics.checkNotNullParameter(openUrlInApp, "openUrlInApp");
        Intrinsics.checkNotNullParameter(finishActivity, "finishActivity");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1000857687);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(sageApplicationResponse) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(openUrlExternally) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(openUrlInApp) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(finishActivity) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
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
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    context2 = context;
                    i3 |= composerStartRestartGroup.changedInstance(context2) ? 1048576 : 524288;
                }
                if ((599187 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            screen2 = new Screen(Screen.Name.GOLD_SAGE_APPLICATION, null, null, null, 14, null);
                        }
                        if (i4 == 0) {
                            context3 = null;
                            screen3 = screen2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1000857687, i3, -1, "com.robinhood.android.gold.sage.GoldSageApplicationComposable (GoldSageApplicationComposable.kt:26)");
                        }
                        final ?? r1 = new GoldSageWebViewCallbacks() { // from class: com.robinhood.android.gold.sage.GoldSageApplicationComposableKt$GoldSageApplicationComposable$callbacks$1
                            @Override // com.robinhood.android.gold.lib.sage.GoldSageWebViewCallbacks
                            public void onPageFinished(WebView view, String url) {
                            }

                            @Override // com.robinhood.android.gold.lib.sage.GoldSageWebViewCallbacks
                            public void onSageExit(String redirectUrl) {
                                if (redirectUrl != null) {
                                    openUrlExternally.invoke(Uri.parse(redirectUrl));
                                }
                                finishActivity.invoke();
                            }
                        };
                        AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen3, null, context3, null, null, 53, null), ComposableLambda3.rememberComposableLambda(1326058526, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.GoldSageApplicationComposableKt.GoldSageApplicationComposable.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i7) {
                                if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1326058526, i7, -1, "com.robinhood.android.gold.sage.GoldSageApplicationComposable.<anonymous> (GoldSageApplicationComposable.kt:43)");
                                }
                                GoldSageWebViewComposable.GoldSageWebViewComposable(r1, sageApplicationResponse.getUrl(), extensions2.toPersistentList(sageApplicationResponse.getAllowed_urls()), extensions2.toPersistentList(sageApplicationResponse.getAllowed_urls_to_open_externally()), extensions2.toPersistentList(sageApplicationResponse.getAllowed_urls_to_open_in_app()), openUrlExternally, openUrlInApp, finishActivity, ModifiersKt.logScreenTransitions$default(modifier3, null, 1, null), composer3, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        composer2 = composerStartRestartGroup;
                        screen4 = screen3;
                        context4 = context3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        modifier3 = modifier2;
                    }
                    screen3 = screen2;
                    context3 = context2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final GoldSageApplicationComposable2 r12 = new GoldSageWebViewCallbacks() { // from class: com.robinhood.android.gold.sage.GoldSageApplicationComposableKt$GoldSageApplicationComposable$callbacks$1
                        @Override // com.robinhood.android.gold.lib.sage.GoldSageWebViewCallbacks
                        public void onPageFinished(WebView view, String url) {
                        }

                        @Override // com.robinhood.android.gold.lib.sage.GoldSageWebViewCallbacks
                        public void onSageExit(String redirectUrl) {
                            if (redirectUrl != null) {
                                openUrlExternally.invoke(Uri.parse(redirectUrl));
                            }
                            finishActivity.invoke();
                        }
                    };
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen3, null, context3, null, null, 53, null), ComposableLambda3.rememberComposableLambda(1326058526, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.GoldSageApplicationComposableKt.GoldSageApplicationComposable.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i7) {
                            if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1326058526, i7, -1, "com.robinhood.android.gold.sage.GoldSageApplicationComposable.<anonymous> (GoldSageApplicationComposable.kt:43)");
                            }
                            GoldSageWebViewComposable.GoldSageWebViewComposable(r12, sageApplicationResponse.getUrl(), extensions2.toPersistentList(sageApplicationResponse.getAllowed_urls()), extensions2.toPersistentList(sageApplicationResponse.getAllowed_urls_to_open_externally()), extensions2.toPersistentList(sageApplicationResponse.getAllowed_urls_to_open_in_app()), openUrlExternally, openUrlInApp, finishActivity, ModifiersKt.logScreenTransitions$default(modifier3, null, 1, null), composer3, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                    composer2 = composerStartRestartGroup;
                    screen4 = screen3;
                    context4 = context3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier4 = modifier2;
                    screen4 = screen2;
                    context4 = context2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.sage.GoldSageApplicationComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return GoldSageApplicationComposable.GoldSageApplicationComposable$lambda$0(sageApplicationResponse, openUrlExternally, openUrlInApp, finishActivity, modifier4, screen4, context4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 1572864;
            context2 = context;
            if ((599187 & i3) != 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i5 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if (i4 == 0) {
                        screen3 = screen2;
                        context3 = context2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final GoldSageApplicationComposable2 r122 = new GoldSageWebViewCallbacks() { // from class: com.robinhood.android.gold.sage.GoldSageApplicationComposableKt$GoldSageApplicationComposable$callbacks$1
                        @Override // com.robinhood.android.gold.lib.sage.GoldSageWebViewCallbacks
                        public void onPageFinished(WebView view, String url) {
                        }

                        @Override // com.robinhood.android.gold.lib.sage.GoldSageWebViewCallbacks
                        public void onSageExit(String redirectUrl) {
                            if (redirectUrl != null) {
                                openUrlExternally.invoke(Uri.parse(redirectUrl));
                            }
                            finishActivity.invoke();
                        }
                    };
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen3, null, context3, null, null, 53, null), ComposableLambda3.rememberComposableLambda(1326058526, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.GoldSageApplicationComposableKt.GoldSageApplicationComposable.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i7) {
                            if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1326058526, i7, -1, "com.robinhood.android.gold.sage.GoldSageApplicationComposable.<anonymous> (GoldSageApplicationComposable.kt:43)");
                            }
                            GoldSageWebViewComposable.GoldSageWebViewComposable(r122, sageApplicationResponse.getUrl(), extensions2.toPersistentList(sageApplicationResponse.getAllowed_urls()), extensions2.toPersistentList(sageApplicationResponse.getAllowed_urls_to_open_externally()), extensions2.toPersistentList(sageApplicationResponse.getAllowed_urls_to_open_in_app()), openUrlExternally, openUrlInApp, finishActivity, ModifiersKt.logScreenTransitions$default(modifier3, null, 1, null), composer3, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                    composer2 = composerStartRestartGroup;
                    screen4 = screen3;
                    context4 = context3;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((196608 & i) != 0) {
        }
        i4 = i2 & 64;
        if (i4 != 0) {
        }
        context2 = context;
        if ((599187 & i3) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
