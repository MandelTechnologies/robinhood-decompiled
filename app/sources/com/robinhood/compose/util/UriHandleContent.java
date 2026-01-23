package com.robinhood.compose.util;

import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UriHandleContent.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a@\u0010\t\u001a\u00020\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f²\u0006'\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00008\nX\u008a\u0084\u0002"}, m3636d2 = {"Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "uri", "", "openUriHandler", "Lkotlin/Function0;", "content", "UriHandleContent", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "latestOpenUriHandler", "lib-compose-common_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.util.UriHandleContentKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class UriHandleContent {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UriHandleContent$lambda$2(Function1 function1, Function2 function2, int i, Composer composer, int i2) {
        UriHandleContent(function1, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void UriHandleContent(final Function1<? super String, Unit> openUriHandler, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(openUriHandler, "openUriHandler");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(167767511);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(openUriHandler) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(167767511, i2, -1, "com.robinhood.compose.util.UriHandleContent (UriHandleContent.kt:17)");
            }
            final SnapshotState4 snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(openUriHandler, composerStartRestartGroup, i2 & 14);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new UriHandler() { // from class: com.robinhood.compose.util.UriHandleContentKt$UriHandleContent$uriHandler$1$1
                    @Override // androidx.compose.p011ui.platform.UriHandler
                    public void openUri(String uri) {
                        Intrinsics.checkNotNullParameter(uri, "uri");
                        UriHandleContent.UriHandleContent$lambda$0(snapshotState4RememberUpdatedState).invoke(uri);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            CompositionLocal3.CompositionLocalProvider(CompositionLocalsKt.getLocalUriHandler().provides((UriHandleContent2) objRememberedValue), content, composerStartRestartGroup, (i2 & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.util.UriHandleContentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UriHandleContent.UriHandleContent$lambda$2(openUriHandler, content, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<String, Unit> UriHandleContent$lambda$0(SnapshotState4<? extends Function1<? super String, Unit>> snapshotState4) {
        return (Function1) snapshotState4.getValue();
    }
}
