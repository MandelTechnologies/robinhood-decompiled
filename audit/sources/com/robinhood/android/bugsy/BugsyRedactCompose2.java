package com.robinhood.android.bugsy;

import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.bugsy.BugsyRedactCompose2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BugsyRedactCompose.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\"\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006²\u0006\n\u0010\u0007\u001a\u00020\bX\u008a\u0084\u0002"}, m3636d2 = {"redactable", "Landroidx/compose/ui/Modifier;", "LocalRedactDispatcher", "Lcom/robinhood/android/bugsy/RedactDispatcherCompositionLocal;", "getLocalRedactDispatcher", "()Lcom/robinhood/android/bugsy/RedactDispatcherCompositionLocal;", "lib-bugsy_externalRelease", "redacted", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.bugsy.BugsyRedactComposeKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class BugsyRedactCompose2 {
    private static final BugsyRedactCompose3 LocalRedactDispatcher = new BugsyRedactCompose3(null, 1, null);

    /* compiled from: BugsyRedactCompose.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.bugsy.BugsyRedactComposeKt$redactable$1 */
    static final class C99231 implements Function3<Modifier, Composer, Integer, Modifier> {
        public static final C99231 INSTANCE = new C99231();

        C99231() {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        public final Modifier invoke(Modifier composed, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            composer.startReplaceGroup(735511572);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(735511572, i, -1, "com.robinhood.android.bugsy.redactable.<anonymous> (BugsyRedactCompose.kt:23)");
            }
            if (invoke$lambda$0(SnapshotStateKt.collectAsState(BugsyRedactCompose2.getLocalRedactDispatcher().getCurrent(composer, 6).getRedacted(), null, composer, 0, 1))) {
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.bugsy.BugsyRedactComposeKt$redactable$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return BugsyRedactCompose2.C99231.invoke$lambda$2$lambda$1((ContentDrawScope) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                composed = DrawModifierKt.drawWithContent(composed, (Function1) objRememberedValue);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return composed;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(ContentDrawScope drawWithContent) {
            Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
            DrawScope.m6958drawRectnJ9OG0$default(drawWithContent, Color.INSTANCE.m6722getLightGray0d7_KjU(), 0L, 0L, 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
            return Unit.INSTANCE;
        }

        private static final boolean invoke$lambda$0(SnapshotState4<Boolean> snapshotState4) {
            return snapshotState4.getValue().booleanValue();
        }
    }

    public static final Modifier redactable(Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifier2.composed$default(modifier, null, C99231.INSTANCE, 1, null);
    }

    public static final BugsyRedactCompose3 getLocalRedactDispatcher() {
        return LocalRedactDispatcher;
    }
}
