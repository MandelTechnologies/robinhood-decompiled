package com.withpersona.sdk2.inquiry.nfc;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.widget.Toast;
import androidx.view.result.ActivityResultLauncher;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderOutput;
import com.withpersona.sdk2.inquiry.sandbox.SandboxFlags;
import com.withpersona.sdk2.inquiry.shared.ContextUtils3;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import kotlin.p481io.FilesKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: ScanNfcWorker.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBo\b\u0007\u0012\u000e\b\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000f\u0012\u000e\b\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0014\u0010\u001a\u001a\u00020\u001b2\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001eH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0019¨\u0006 "}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/ScanNfcWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;", "passportNfcReaderLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;", "context", "Landroid/content/Context;", "sandboxFlags", "Lcom/withpersona/sdk2/inquiry/sandbox/SandboxFlags;", "cardAccessNumber", "", "mrzKey", "Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;", "passportNfcStrings", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;", "enabledDataGroups", "", "Lcom/withpersona/sdk2/inquiry/nfc/NfcDataGroupType;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "theme", "", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/sandbox/SandboxFlags;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "doesSameWorkAs", "", "otherWorker", "run", "Lkotlinx/coroutines/flow/Flow;", "Factory", "nfc_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class ScanNfcWorker implements Worker<PassportNfcReaderOutput> {
    private final String cardAccessNumber;
    private final Context context;
    private final List<NfcDataGroupType> enabledDataGroups;
    private final MrzKey mrzKey;
    private final ActivityResultLauncher<PassportNfcReaderConfig> passportNfcReaderLauncher;
    private final PassportNfcStrings passportNfcStrings;
    private final SandboxFlags sandboxFlags;
    private final StepStyles.UiStepStyle styles;
    private final Integer theme;

    /* compiled from: ScanNfcWorker.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JI\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/ScanNfcWorker$Factory;", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/withpersona/sdk2/inquiry/nfc/ScanNfcWorker;", "cardAccessNumber", "", "mrzKey", "Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;", "passportNfcStrings", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;", "enabledDataGroups", "", "Lcom/withpersona/sdk2/inquiry/nfc/NfcDataGroupType;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "theme", "", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/Integer;)Lcom/withpersona/sdk2/inquiry/nfc/ScanNfcWorker;", "nfc_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public interface Factory {
        ScanNfcWorker create(String cardAccessNumber, MrzKey mrzKey, PassportNfcStrings passportNfcStrings, List<? extends NfcDataGroupType> enabledDataGroups, StepStyles.UiStepStyle styles, Integer theme);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ScanNfcWorker(ActivityResultLauncher<PassportNfcReaderConfig> passportNfcReaderLauncher, Context context, SandboxFlags sandboxFlags, String cardAccessNumber, MrzKey mrzKey, PassportNfcStrings passportNfcStrings, List<? extends NfcDataGroupType> enabledDataGroups, StepStyles.UiStepStyle uiStepStyle, Integer num) {
        Intrinsics.checkNotNullParameter(passportNfcReaderLauncher, "passportNfcReaderLauncher");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sandboxFlags, "sandboxFlags");
        Intrinsics.checkNotNullParameter(cardAccessNumber, "cardAccessNumber");
        Intrinsics.checkNotNullParameter(mrzKey, "mrzKey");
        Intrinsics.checkNotNullParameter(passportNfcStrings, "passportNfcStrings");
        Intrinsics.checkNotNullParameter(enabledDataGroups, "enabledDataGroups");
        this.passportNfcReaderLauncher = passportNfcReaderLauncher;
        this.context = context;
        this.sandboxFlags = sandboxFlags;
        this.cardAccessNumber = cardAccessNumber;
        this.mrzKey = mrzKey;
        this.passportNfcStrings = passportNfcStrings;
        this.enabledDataGroups = enabledDataGroups;
        this.styles = uiStepStyle;
        this.theme = num;
    }

    @Override // com.squareup.workflow1.Worker
    public boolean doesSameWorkAs(Worker<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return otherWorker instanceof ScanNfcWorker;
    }

    /* compiled from: ScanNfcWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.nfc.ScanNfcWorker$run$1", m3645f = "ScanNfcWorker.kt", m3646l = {64, 87}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.withpersona.sdk2.inquiry.nfc.ScanNfcWorker$run$1 */
    static final class C437011 extends ContinuationImpl7 implements Function2<FlowCollector<? super PassportNfcReaderOutput>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C437011(Continuation<? super C437011> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C437011 c437011 = ScanNfcWorker.this.new C437011(continuation);
            c437011.L$0 = obj;
            return c437011;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super PassportNfcReaderOutput> flowCollector, Continuation<? super Unit> continuation) {
            return ((C437011) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x00c6, code lost:
        
            if (r12.emit(r3, r11) == r0) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0128, code lost:
        
            if (r1.collect(r2, r11) == r0) goto L43;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                throw new ExceptionsH();
            }
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            if (ScanNfcWorker.this.sandboxFlags.getSimulateGovIdNfc()) {
                ContextUtils3.getSdkCacheDir(ScanNfcWorker.this.context).mkdirs();
                File file = new File(ContextUtils3.getSdkCacheDir(ScanNfcWorker.this.context), "fake_dg1");
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    FilesKt.writeText$default(file, "this_is_some_fake_dg1_data", null, 2, null);
                    Unit unit = Unit.INSTANCE;
                    Closeable.closeFinally(fileOutputStream, null);
                    File file2 = new File(ContextUtils3.getSdkCacheDir(ScanNfcWorker.this.context), "fake_dg2");
                    fileOutputStream = new FileOutputStream(file2);
                    try {
                        FilesKt.writeText$default(file2, "this_is_some_fake_dg2_data", null, 2, null);
                        Closeable.closeFinally(fileOutputStream, null);
                        File file3 = new File(ContextUtils3.getSdkCacheDir(ScanNfcWorker.this.context), "fake_sod");
                        fileOutputStream = new FileOutputStream(file3);
                        try {
                            FilesKt.writeText$default(file3, "this_is_some_fake_sod_data", null, 2, null);
                            Closeable.closeFinally(fileOutputStream, null);
                            Toast.makeText(ScanNfcWorker.this.context, "Using simulated government ID NFC data", 0).show();
                            PassportNfcReaderOutput.Success success = new PassportNfcReaderOutput.Success(Uri.fromFile(file), Uri.fromFile(file2), Uri.fromFile(file3), ChipAuthenticationStatus.NotRequested);
                            this.label = 1;
                        } finally {
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            } else {
                ScanNfcWorker.this.passportNfcReaderLauncher.launch(new PassportNfcReaderConfig(ScanNfcWorker.this.cardAccessNumber, ScanNfcWorker.this.mrzKey, ScanNfcWorker.this.passportNfcStrings, ScanNfcWorker.this.enabledDataGroups, ScanNfcWorker.this.theme, ScanNfcWorker.this.styles));
                PassportNfcReaderResultSender passportNfcReaderResultSender = new PassportNfcReaderResultSender();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ScanNfcWorker.this, flowCollector);
                this.label = 2;
            }
            return coroutine_suspended;
        }

        /* compiled from: ScanNfcWorker.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.nfc.ScanNfcWorker$run$1$1, reason: invalid class name */
        static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ FlowCollector<PassportNfcReaderOutput> $$this$flow;
            final /* synthetic */ ScanNfcWorker this$0;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(ScanNfcWorker scanNfcWorker, FlowCollector<? super PassportNfcReaderOutput> flowCollector) {
                this.this$0 = scanNfcWorker;
                this.$$this$flow = flowCollector;
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
            
                if (kotlinx.coroutines.DelayKt.delay(r5, r0) == r1) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
            
                if (r9.emit(r8, r0) != r1) goto L26;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
            
                return r1;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(PassportNfcReaderOutput passportNfcReaderOutput, Continuation<? super Unit> continuation) {
                ScanNfcWorker2 scanNfcWorker2;
                AnonymousClass1<T> anonymousClass1;
                if (continuation instanceof ScanNfcWorker2) {
                    scanNfcWorker2 = (ScanNfcWorker2) continuation;
                    int i = scanNfcWorker2.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        scanNfcWorker2.label = i - Integer.MIN_VALUE;
                    } else {
                        scanNfcWorker2 = new ScanNfcWorker2(this, continuation);
                    }
                }
                Object obj = scanNfcWorker2.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = scanNfcWorker2.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        long integer = this.this$0.context.getResources().getInteger(R$integer.pi2_transition_animation_duration);
                        scanNfcWorker2.L$0 = this;
                        scanNfcWorker2.L$1 = passportNfcReaderOutput;
                        scanNfcWorker2.label = 1;
                    } catch (Resources.NotFoundException unused) {
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    passportNfcReaderOutput = (PassportNfcReaderOutput) scanNfcWorker2.L$1;
                    anonymousClass1 = (AnonymousClass1) scanNfcWorker2.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Resources.NotFoundException unused2) {
                    }
                }
                FlowCollector<PassportNfcReaderOutput> flowCollector = anonymousClass1.$$this$flow;
                scanNfcWorker2.L$0 = null;
                scanNfcWorker2.L$1 = null;
                scanNfcWorker2.label = 2;
                anonymousClass1 = this;
                FlowCollector<PassportNfcReaderOutput> flowCollector2 = anonymousClass1.$$this$flow;
                scanNfcWorker2.L$0 = null;
                scanNfcWorker2.L$1 = null;
                scanNfcWorker2.label = 2;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((PassportNfcReaderOutput) obj, (Continuation<? super Unit>) continuation);
            }
        }
    }

    @Override // com.squareup.workflow1.Worker
    public Flow<PassportNfcReaderOutput> run() {
        return FlowKt.flow(new C437011(null));
    }
}
