package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.camera.BarcodeInfo;
import com.withpersona.sdk2.camera.ExtractedTexts;
import com.withpersona.sdk2.camera.GovernmentIdFeed;
import com.withpersona.sdk2.camera.GovernmentIdFeed5;
import com.withpersona.sdk2.camera.ImageIdMetadata;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.network.AutocaptureState;
import com.withpersona.sdk2.inquiry.governmentid.network.AutocaptureState2;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: GovernmentIdAnalyzeWorker.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u00010B5\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\u00192\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00192\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010+R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdAnalyzeWorker;", "Lcom/squareup/workflow1/Worker;", "Lkotlin/Result;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;", "Landroid/content/Context;", "context", "Lcom/withpersona/sdk2/camera/GovernmentIdFeed;", "governmentIdFeed", "Lcom/withpersona/sdk2/inquiry/shared/files/SdkFilesManager;", "sdkFilesManager", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;", "side", "", "idClassKey", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/camera/GovernmentIdFeed;Lcom/withpersona/sdk2/inquiry/shared/files/SdkFilesManager;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;Ljava/lang/String;)V", "Lcom/withpersona/sdk2/camera/ParsedIdSideOrNone$ParsedIdSide;", "parsedIdSide", "createGovernmentId-IoAF18A", "(Lcom/withpersona/sdk2/camera/ParsedIdSideOrNone$ParsedIdSide;)Ljava/lang/Object;", "createGovernmentId", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;", "getIdDetails", "(Lcom/withpersona/sdk2/camera/ParsedIdSideOrNone$ParsedIdSide;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;", "otherWorker", "", "doesSameWorkAs", "(Lcom/squareup/workflow1/Worker;)Z", "Lkotlinx/coroutines/flow/Flow;", "run", "()Lkotlinx/coroutines/flow/Flow;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroid/content/Context;", "Lcom/withpersona/sdk2/camera/GovernmentIdFeed;", "Lcom/withpersona/sdk2/inquiry/shared/files/SdkFilesManager;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;", "Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutocaptureState;", "autocaptureState", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutocaptureState;", "Factory", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final /* data */ class GovernmentIdAnalyzeWorker implements Worker<Result<? extends GovernmentId.GovernmentIdImage>> {
    private AutocaptureState autocaptureState;
    private final Context context;
    private final GovernmentIdFeed governmentIdFeed;
    private final String idClassKey;
    private final SdkFilesManager sdkFilesManager;
    private final IdConfig.Side side;

    /* compiled from: GovernmentIdAnalyzeWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdAnalyzeWorker$Factory;", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdAnalyzeWorker;", "side", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;", "idClassKey", "", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public interface Factory {
        GovernmentIdAnalyzeWorker create(IdConfig.Side side, String idClassKey);
    }

    /* compiled from: GovernmentIdAnalyzeWorker.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GovernmentIdFeed5.Side.values().length];
            try {
                iArr[GovernmentIdFeed5.Side.Front.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GovernmentIdFeed5.Side.Back.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GovernmentIdAnalyzeWorker)) {
            return false;
        }
        GovernmentIdAnalyzeWorker governmentIdAnalyzeWorker = (GovernmentIdAnalyzeWorker) other;
        return Intrinsics.areEqual(this.context, governmentIdAnalyzeWorker.context) && Intrinsics.areEqual(this.governmentIdFeed, governmentIdAnalyzeWorker.governmentIdFeed) && Intrinsics.areEqual(this.sdkFilesManager, governmentIdAnalyzeWorker.sdkFilesManager) && this.side == governmentIdAnalyzeWorker.side && Intrinsics.areEqual(this.idClassKey, governmentIdAnalyzeWorker.idClassKey);
    }

    public int hashCode() {
        return (((((((this.context.hashCode() * 31) + this.governmentIdFeed.hashCode()) * 31) + this.sdkFilesManager.hashCode()) * 31) + this.side.hashCode()) * 31) + this.idClassKey.hashCode();
    }

    public String toString() {
        return "GovernmentIdAnalyzeWorker(context=" + this.context + ", governmentIdFeed=" + this.governmentIdFeed + ", sdkFilesManager=" + this.sdkFilesManager + ", side=" + this.side + ", idClassKey=" + this.idClassKey + ")";
    }

    public GovernmentIdAnalyzeWorker(Context context, GovernmentIdFeed governmentIdFeed, SdkFilesManager sdkFilesManager, IdConfig.Side side, String idClassKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(governmentIdFeed, "governmentIdFeed");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(idClassKey, "idClassKey");
        this.context = context;
        this.governmentIdFeed = governmentIdFeed;
        this.sdkFilesManager = sdkFilesManager;
        this.side = side;
        this.idClassKey = idClassKey;
        this.autocaptureState = new AutocaptureState(null, 1, null);
    }

    @Override // com.squareup.workflow1.Worker
    public boolean doesSameWorkAs(Worker<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof GovernmentIdAnalyzeWorker) && ((GovernmentIdAnalyzeWorker) otherWorker).side == this.side;
    }

    @Override // com.squareup.workflow1.Worker
    public Flow<Result<? extends GovernmentId.GovernmentIdImage>> run() {
        final GovernmentIdFeed governmentIdFeed = this.governmentIdFeed;
        return new Flow<Result<? extends GovernmentId.GovernmentIdImage>>() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker$run$$inlined$mapNotNull$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker$run$$inlined$mapNotNull$1$2 */
            public static final class C435842<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ GovernmentIdAnalyzeWorker this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker$run$$inlined$mapNotNull$1$2", m3645f = "GovernmentIdAnalyzeWorker.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE}, m3647m = "emit")
                /* renamed from: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker$run$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C435842.this.emit(null, this);
                    }
                }

                public C435842(FlowCollector flowCollector, GovernmentIdAnalyzeWorker governmentIdAnalyzeWorker) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = governmentIdAnalyzeWorker;
                }

                /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    Result resultM28549boximpl;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Object value = ((Result) obj).getValue();
                        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(value);
                        if (thM28553exceptionOrNullimpl == null) {
                            GovernmentIdFeed5 governmentIdFeed5 = (GovernmentIdFeed5) value;
                            if (governmentIdFeed5 instanceof GovernmentIdFeed5.ParsedIdSide) {
                                GovernmentIdFeed5.ParsedIdSide parsedIdSide = (GovernmentIdFeed5.ParsedIdSide) governmentIdFeed5;
                                ImageIdMetadata metadata = parsedIdSide.getMetadata();
                                if (metadata == null) {
                                    resultM28549boximpl = Result.m28549boximpl(this.this$0.m27308createGovernmentIdIoAF18A(parsedIdSide));
                                } else {
                                    GovernmentIdAnalyzeWorker governmentIdAnalyzeWorker = this.this$0;
                                    governmentIdAnalyzeWorker.autocaptureState = AutocaptureState2.update(governmentIdAnalyzeWorker.autocaptureState, metadata);
                                    if (AutocaptureState2.isFocused(this.this$0.autocaptureState)) {
                                        resultM28549boximpl = Result.m28549boximpl(this.this$0.m27308createGovernmentIdIoAF18A(parsedIdSide));
                                    }
                                }
                            } else {
                                resultM28549boximpl = null;
                            }
                        } else {
                            resultM28549boximpl = Result.m28549boximpl(Result.m28550constructorimpl(ResultKt.createFailure(thM28553exceptionOrNullimpl)));
                        }
                        if (resultM28549boximpl != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(resultM28549boximpl, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Result<? extends GovernmentId.GovernmentIdImage>> flowCollector, Continuation continuation) {
                Object objCollect = governmentIdFeed.collect(new C435842(flowCollector, this), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createGovernmentId-IoAF18A, reason: not valid java name */
    public final Object m27308createGovernmentIdIoAF18A(GovernmentIdFeed5.ParsedIdSide parsedIdSide) {
        GovernmentId.Side side;
        try {
            String absolutePath = GovernmentId3.saveGovernmentId(parsedIdSide.getBitmap(), this.sdkFilesManager).getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            List listListOf = CollectionsKt.listOf(new Frame(absolutePath, null, 2, null));
            int i = WhenMappings.$EnumSwitchMapping$0[parsedIdSide.getSide().ordinal()];
            if (i == 1) {
                side = GovernmentId.Side.FRONT;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                side = GovernmentId.Side.BACK;
            }
            String str = this.idClassKey;
            RawExtraction rawExtractionM3221to = null;
            GovernmentId.CaptureMethod captureMethod = GovernmentId.CaptureMethod.AUTO;
            BarcodeInfo extractedBarcode = parsedIdSide.getExtractedBarcode();
            if (extractedBarcode != null) {
                rawExtractionM3221to = RawExtraction2.m3221to(extractedBarcode);
            }
            return Result.m28550constructorimpl(new GovernmentId.GovernmentIdImage(listListOf, side, str, captureMethod, rawExtractionM3221to, getIdDetails(parsedIdSide)));
        } catch (IOException e) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m28550constructorimpl(ResultKt.createFailure(e));
        }
    }

    private final GovernmentIdDetails getIdDetails(GovernmentIdFeed5.ParsedIdSide parsedIdSide) {
        GovernmentIdDetails govIdDetails;
        BarcodeInfo extractedBarcode = parsedIdSide.getExtractedBarcode();
        if (extractedBarcode != null && (govIdDetails = Conversions3.toGovIdDetails(extractedBarcode)) != null) {
            return govIdDetails;
        }
        ExtractedTexts extractedTexts = parsedIdSide.getExtractedTexts();
        if (extractedTexts != null) {
            return Conversions3.toGovIdDetails(extractedTexts);
        }
        return null;
    }
}
