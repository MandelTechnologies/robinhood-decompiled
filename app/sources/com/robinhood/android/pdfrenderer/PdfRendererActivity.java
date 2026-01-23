package com.robinhood.android.pdfrenderer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.view.compose.ComponentActivity6;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.pdfrenderer.PdfRendererActivity;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.shared.common.contracts.PdfRendererIntentKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: PdfRendererActivity.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/pdfrenderer/PdfRendererActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "requiresAuthentication", "", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "lib-pdf-renderer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class PdfRendererActivity extends BaseActivity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseActivity.$stable;

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean requiresAuthentication() {
        return false;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        hideToolbar();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ComponentActivity6.setContent$default(this, null, ComposableLambda3.composableLambdaInstance(14392237, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pdfrenderer.PdfRendererActivity.onCreate.1
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
                    ComposerKt.traceEventStart(14392237, i, -1, "com.robinhood.android.pdfrenderer.PdfRendererActivity.onCreate.<anonymous> (PdfRendererActivity.kt:37)");
                }
                Boolean bool = Boolean.TRUE;
                final PdfRendererActivity pdfRendererActivity = PdfRendererActivity.this;
                BentoTheme2.BentoTheme(null, null, null, null, null, bool, null, null, ComposableLambda3.rememberComposableLambda(-1452764939, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pdfrenderer.PdfRendererActivity.onCreate.1.1

                    /* compiled from: PdfRendererActivity.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.pdfrenderer.PdfRendererActivity$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C504391 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ PdfRendererActivity this$0;

                        C504391(PdfRendererActivity pdfRendererActivity) {
                            this.this$0 = pdfRendererActivity;
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
                                ComposerKt.traceEventStart(-2085493707, i, -1, "com.robinhood.android.pdfrenderer.PdfRendererActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (PdfRendererActivity.kt:39)");
                            }
                            PdfRendererActivity pdfRendererActivity = this.this$0;
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(pdfRendererActivity);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new PdfRendererActivity2(pdfRendererActivity);
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            Function0 function0 = (Function0) ((KFunction) objRememberedValue);
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                            final PdfRendererActivity pdfRendererActivity2 = this.this$0;
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.pdfrenderer.PdfRendererActivity$onCreate$1$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return PdfRendererActivity.C254591.AnonymousClass1.C504391.invoke$lambda$2$lambda$1(pdfRendererActivity2);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            Function0 function02 = (Function0) objRememberedValue2;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance3 = composer.changedInstance(this.this$0);
                            final PdfRendererActivity pdfRendererActivity3 = this.this$0;
                            Object objRememberedValue3 = composer.rememberedValue();
                            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.pdfrenderer.PdfRendererActivity$onCreate$1$1$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return PdfRendererActivity.C254591.AnonymousClass1.C504391.invoke$lambda$4$lambda$3(pdfRendererActivity3);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue3);
                            }
                            composer.endReplaceGroup();
                            PdfRendererComposable.PdfRendererComposable(function0, function02, (Function0) objRememberedValue3, null, null, composer, 0, 24);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$2$lambda$1(PdfRendererActivity pdfRendererActivity) {
                            WebUtils.viewUrl$default(pdfRendererActivity, ((PdfRendererIntentKey) PdfRendererActivity.INSTANCE.getExtras((Activity) pdfRendererActivity)).getUrl(), 0, 4, (Object) null);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$4$lambda$3(PdfRendererActivity pdfRendererActivity) {
                            WebUtils.viewUrl$default(pdfRendererActivity, ((PdfRendererIntentKey) PdfRendererActivity.INSTANCE.getExtras((Activity) pdfRendererActivity)).getUrl(), 0, 4, (Object) null);
                            pdfRendererActivity.finish();
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1452764939, i2, -1, "com.robinhood.android.pdfrenderer.PdfRendererActivity.onCreate.<anonymous>.<anonymous> (PdfRendererActivity.kt:38)");
                        }
                        CompositionLocal3.CompositionLocalProvider(AndroidCompositionLocals_androidKt.getLocalContext().provides(pdfRendererActivity), ComposableLambda3.rememberComposableLambda(-2085493707, true, new C504391(pdfRendererActivity), composer2, 54), composer2, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 1, null);
    }

    /* compiled from: PdfRendererActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/pdfrenderer/PdfRendererActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/pdfrenderer/PdfRendererActivity;", "Lcom/robinhood/shared/common/contracts/PdfRendererIntentKey;", "<init>", "()V", "lib-pdf-renderer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<PdfRendererActivity, PdfRendererIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public PdfRendererIntentKey getExtras(PdfRendererActivity pdfRendererActivity) {
            return (PdfRendererIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, pdfRendererActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, PdfRendererIntentKey pdfRendererIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, pdfRendererIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, PdfRendererIntentKey pdfRendererIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, pdfRendererIntentKey);
        }
    }
}
