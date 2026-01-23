package com.truelayer.payments.p419ui.screens.processor;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.view.compose.ComponentActivity6;
import com.truelayer.payments.p419ui.models.PaymentContext;
import com.truelayer.payments.p419ui.screens.coordinator.FlowCoordinator;
import com.truelayer.payments.p419ui.screens.processor.ProcessorResult;
import com.truelayer.payments.p419ui.theme.Theme5;
import com.truelayer.payments.p419ui.theme.ThemeConverter;
import com.truelayer.payments.p419ui.theme.TrueLayerTheme;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ProcessorActivity.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u0007"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/processor/ProcessorActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class ProcessorActivity extends AppCompatActivity {
    public static final int $stable = 0;

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        final ProcessorContext processorContext;
        Bundle extras;
        Serializable serializable;
        Bundle extras2;
        Bundle extras3;
        ProcessorContext processorContext2;
        super.onCreate(savedInstanceState);
        Bundle extras4 = getIntent().getExtras();
        if (extras4 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                processorContext2 = (ProcessorContext) extras4.getParcelable(ProcessorActivityContract.PAYMENT_CONTEXT_KEY, ProcessorContext.class);
            } else {
                processorContext2 = (ProcessorContext) extras4.getParcelable(ProcessorActivityContract.PAYMENT_CONTEXT_KEY);
            }
            processorContext = processorContext2;
        } else {
            processorContext = null;
        }
        if (processorContext == null) {
            setResult(ProcessorResult.ResultCode.FAILURE.getCode(), ProcessorResult.INSTANCE.resultIntent$payments_ui_release(new ProcessorResult.Failure(ProcessorResult.FailureReason.ProcessorContextNotAvailable)));
            finish();
            return;
        }
        Intent intent = getIntent();
        boolean z = false;
        if (intent != null && (extras3 = intent.getExtras()) != null) {
            z = extras3.getBoolean("react-native", false);
        }
        final boolean z2 = z;
        Intent intent2 = getIntent();
        final String string2 = (intent2 == null || (extras2 = intent2.getExtras()) == null) ? null : extras2.getString("react-native-sdk-version");
        Intent intent3 = getIntent();
        final HashMap map = (intent3 == null || (extras = intent3.getExtras()) == null || (serializable = extras.getSerializable("theme")) == null) ? null : (HashMap) serializable;
        ComponentActivity6.setContent$default(this, null, ComposableLambda3.composableLambdaInstance(-1281070778, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.processor.ProcessorActivity.onCreate.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                TrueLayerTheme trueLayerThemeCreateTrueLayerTheme;
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1281070778, i, -1, "com.truelayer.payments.ui.screens.processor.ProcessorActivity.onCreate.<anonymous> (ProcessorActivity.kt:40)");
                    }
                    HashMap<String, HashMap<String, Object>> map2 = map;
                    if (map2 != null) {
                        ProcessorActivity processorActivity = this;
                        ThemeConverter.Companion companion = ThemeConverter.INSTANCE;
                        Resources resources = processorActivity.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                        String packageName = processorActivity.getPackageName();
                        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
                        trueLayerThemeCreateTrueLayerTheme = companion.convert(map2, resources, packageName);
                    } else {
                        trueLayerThemeCreateTrueLayerTheme = null;
                    }
                    composer.startReplaceableGroup(-942864559);
                    if (trueLayerThemeCreateTrueLayerTheme == null) {
                        trueLayerThemeCreateTrueLayerTheme = Theme5.createTrueLayerTheme(composer, 0);
                    }
                    composer.endReplaceableGroup();
                    final ProcessorContext processorContext3 = processorContext;
                    final boolean z3 = z2;
                    final String str = string2;
                    final ProcessorActivity processorActivity2 = this;
                    Theme5.Theme(trueLayerThemeCreateTrueLayerTheme, false, null, ComposableLambda3.composableLambda(composer, -1419149013, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.processor.ProcessorActivity.onCreate.1.2
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
                            if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1419149013, i2, -1, "com.truelayer.payments.ui.screens.processor.ProcessorActivity.onCreate.<anonymous>.<anonymous> (ProcessorActivity.kt:43)");
                                }
                                PaymentContext paymentContextIntoPaymentContext$payments_ui_release = processorContext3.intoPaymentContext$payments_ui_release(z3, str);
                                composer2.startReplaceableGroup(1324718964);
                                boolean zChanged = composer2.changed(processorActivity2);
                                final ProcessorActivity processorActivity3 = processorActivity2;
                                Object objRememberedValue = composer2.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1<ProcessorResult.Successful, Unit>() { // from class: com.truelayer.payments.ui.screens.processor.ProcessorActivity$onCreate$1$2$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(ProcessorResult.Successful successful) {
                                            invoke2(successful);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(ProcessorResult.Successful it) {
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            processorActivity3.setResult(ProcessorResult.ResultCode.SUCCESS.getCode(), ProcessorResult.INSTANCE.resultIntent$payments_ui_release(it));
                                            processorActivity3.finish();
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                Function1 function1 = (Function1) objRememberedValue;
                                composer2.endReplaceableGroup();
                                composer2.startReplaceableGroup(1324719245);
                                boolean zChanged2 = composer2.changed(processorActivity2);
                                final ProcessorActivity processorActivity4 = processorActivity2;
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function1<ProcessorResult.Failure, Unit>() { // from class: com.truelayer.payments.ui.screens.processor.ProcessorActivity$onCreate$1$2$2$1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(ProcessorResult.Failure failure) {
                                            invoke2(failure);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(ProcessorResult.Failure it) {
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            processorActivity4.setResult(ProcessorResult.ResultCode.FAILURE.getCode(), ProcessorResult.INSTANCE.resultIntent$payments_ui_release(it));
                                            processorActivity4.finish();
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceableGroup();
                                FlowCoordinator.FlowCoordinator(paymentContextIntoPaymentContext$payments_ui_release, function1, (Function1) objRememberedValue2, null, composer2, 0, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), composer, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }), 1, null);
    }
}
