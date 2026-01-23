package com.truelayer.payments.p419ui.utils;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ContentChangeAccessibilityAnnouncement.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"ContentChangeAccessibilityAnnouncement", "", "launchedEffectKey", "", "text", "", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.utils.ContentChangeAccessibilityAnnouncementKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ContentChangeAccessibilityAnnouncement {
    public static final void ContentChangeAccessibilityAnnouncement(final Object obj, final String str, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2098817781);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2098817781, i, -1, "com.truelayer.payments.ui.utils.ContentChangeAccessibilityAnnouncement (ContentChangeAccessibilityAnnouncement.kt:12)");
        }
        EffectsKt.LaunchedEffect(obj, new C433111((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), str, null), composerStartRestartGroup, 72);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.utils.ContentChangeAccessibilityAnnouncementKt.ContentChangeAccessibilityAnnouncement.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    ContentChangeAccessibilityAnnouncement.ContentChangeAccessibilityAnnouncement(obj, str, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* compiled from: ContentChangeAccessibilityAnnouncement.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.utils.ContentChangeAccessibilityAnnouncementKt$ContentChangeAccessibilityAnnouncement$1", m3645f = "ContentChangeAccessibilityAnnouncement.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.utils.ContentChangeAccessibilityAnnouncementKt$ContentChangeAccessibilityAnnouncement$1 */
    static final class C433111 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $text;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C433111(Context context, String str, Continuation<? super C433111> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$text = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C433111(this.$context, this.$text, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C433111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            AccessibilityEvent accessibilityEventObtain;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int i = Build.VERSION.SDK_INT;
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.$context.getSystemService(AccessibilityManager.class);
            if (accessibilityManager != null && accessibilityManager.isEnabled() && this.$text != null) {
                if (i >= 30) {
                    accessibilityEventObtain = C43310x8b5cb9ef.m3177m(32);
                } else {
                    accessibilityEventObtain = AccessibilityEvent.obtain(32);
                }
                if (i >= 30) {
                    accessibilityEventObtain.setContentChangeTypes(64);
                } else {
                    accessibilityEventObtain.setContentChangeTypes(1);
                }
                accessibilityEventObtain.getText().add(this.$text);
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
            }
            return Unit.INSTANCE;
        }
    }
}
