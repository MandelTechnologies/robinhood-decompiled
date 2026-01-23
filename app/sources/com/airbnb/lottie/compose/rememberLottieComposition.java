package com.airbnb.lottie.compose;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieImageAsset;
import com.airbnb.lottie.LottieListener;
import com.airbnb.lottie.LottieTask;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import com.plaid.internal.EnumC7081g;
import com.robinhood.utils.extensions.ResourceTypes;
import io.jsonwebtoken.Header;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: rememberLottieComposition.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u008d\u0001\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022H\b\u0002\u0010\u0011\u001aB\b\u0001\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0007H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001aF\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019\u001a9\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001a\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a \u0010\u001f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001e*\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0082@¢\u0006\u0004\b\u001f\u0010 \u001a*\u0010#\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u00172\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0082@¢\u0006\u0004\b#\u0010$\u001a)\u0010'\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010&\u001a\u00020%2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b'\u0010(\u001a\u0017\u0010)\u001a\u00020\"2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b)\u0010*\u001a2\u0010+\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u00172\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b+\u0010,\u001a1\u0010/\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010.\u001a\u00020-2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b/\u00100\u001a!\u00104\u001a\u0004\u0018\u0001012\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u0002H\u0002¢\u0006\u0004\b4\u00105\u001a\u0017\u00106\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b6\u00107\u001a\u0013\u00108\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b8\u00107¨\u0006;²\u0006\f\u0010:\u001a\u0002098\nX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "spec", "", "imageAssetsFolder", "fontAssetsFolder", "fontFileExtension", "cacheKey", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "failCount", "", "previousException", "Lkotlin/coroutines/Continuation;", "", "", "onRetry", "Lcom/airbnb/lottie/compose/LottieCompositionResult;", "rememberLottieComposition", "(Lcom/airbnb/lottie/compose/LottieCompositionSpec;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Lcom/airbnb/lottie/compose/LottieCompositionResult;", "Landroid/content/Context;", "context", "Lcom/airbnb/lottie/LottieComposition;", "lottieComposition", "(Landroid/content/Context;Lcom/airbnb/lottie/compose/LottieCompositionSpec;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isWarmingCache", "Lcom/airbnb/lottie/LottieTask;", "lottieTask", "(Landroid/content/Context;Lcom/airbnb/lottie/compose/LottieCompositionSpec;Ljava/lang/String;Z)Lcom/airbnb/lottie/LottieTask;", "T", "await", "(Lcom/airbnb/lottie/LottieTask;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "composition", "", "loadImagesFromAssets", "(Landroid/content/Context;Lcom/airbnb/lottie/LottieComposition;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/airbnb/lottie/LottieImageAsset;", "asset", "maybeLoadImageFromAsset", "(Landroid/content/Context;Lcom/airbnb/lottie/LottieImageAsset;Ljava/lang/String;)V", "maybeDecodeBase64Image", "(Lcom/airbnb/lottie/LottieImageAsset;)V", "loadFontsFromAssets", "(Landroid/content/Context;Lcom/airbnb/lottie/LottieComposition;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/airbnb/lottie/model/Font;", "font", "maybeLoadTypefaceFromAssets", "(Landroid/content/Context;Lcom/airbnb/lottie/model/Font;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/graphics/Typeface;", "typeface", ResourceTypes.STYLE, "typefaceForStyle", "(Landroid/graphics/Typeface;Ljava/lang/String;)Landroid/graphics/Typeface;", "ensureTrailingSlash", "(Ljava/lang/String;)Ljava/lang/String;", "ensureLeadingPeriod", "Lcom/airbnb/lottie/compose/LottieCompositionResultImpl;", "result", "lottie-compose_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.airbnb.lottie.compose.RememberLottieCompositionKt, reason: use source file name */
/* loaded from: classes16.dex */
public final class rememberLottieComposition {

    /* compiled from: rememberLottieComposition.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.airbnb.lottie.compose.RememberLottieCompositionKt", m3645f = "rememberLottieComposition.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, 128, EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE}, m3647m = "lottieComposition")
    /* renamed from: com.airbnb.lottie.compose.RememberLottieCompositionKt$lottieComposition$1 */
    static final class C47811 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C47811(Continuation<? super C47811> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return rememberLottieComposition.lottieComposition(null, null, null, null, null, null, this);
        }
    }

    @JvmOverloads
    public static final LottieCompositionResult rememberLottieComposition(LottieCompositionSpec spec, String str, String str2, String str3, String str4, Function3<? super Integer, ? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> function3, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        composer.startReplaceableGroup(-1248473602);
        String str5 = (i2 & 2) != 0 ? null : str;
        String str6 = (i2 & 4) != 0 ? "fonts/" : str2;
        String str7 = (i2 & 8) != 0 ? ".ttf" : str3;
        String str8 = (i2 & 16) != 0 ? "__LottieInternalDefaultCacheKey__" : str4;
        Function3<? super Integer, ? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> c47821 = (i2 & 32) != 0 ? new C47821(null) : function3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1248473602, i, -1, "com.airbnb.lottie.compose.rememberLottieComposition (rememberLottieComposition.kt:82)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composer.startReplaceableGroup(1388713922);
        int i3 = i & 14;
        int i4 = i3 ^ 6;
        boolean z = (i4 > 4 && composer.changed(spec)) || (i & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotState3.mutableStateOf$default(new LottieCompositionResult2(), null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        SnapshotState snapshotState = (SnapshotState) objRememberedValue;
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(1388714213);
        boolean z2 = ((i4 > 4 && composer.changed(spec)) || (i & 6) == 4) | ((((57344 & i) ^ 24576) > 16384 && composer.changed(str8)) || (i & 24576) == 16384);
        Object objRememberedValue2 = composer.rememberedValue();
        if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = lottieTask(context, spec, str8, true);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(spec, str8, new C47833(c47821, context, spec, str5, str6, str7, str8, snapshotState, null), composer, i3 | 512 | ((i >> 9) & 112));
        LottieCompositionResult2 lottieCompositionResult2RememberLottieComposition$lambda$1 = rememberLottieComposition$lambda$1(snapshotState);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lottieCompositionResult2RememberLottieComposition$lambda$1;
    }

    /* compiled from: rememberLottieComposition.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$1", m3645f = "rememberLottieComposition.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$1 */
    static final class C47821 extends ContinuationImpl7 implements Function3<Integer, Throwable, Continuation<? super Boolean>, Object> {
        int label;

        C47821(Continuation<? super C47821> continuation) {
            super(3, continuation);
        }

        public final Object invoke(int i, Throwable th, Continuation<? super Boolean> continuation) {
            return new C47821(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Throwable th, Continuation<? super Boolean> continuation) {
            return invoke(num.intValue(), th, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return boxing.boxBoolean(false);
        }
    }

    /* compiled from: rememberLottieComposition.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$3", m3645f = "rememberLottieComposition.kt", m3646l = {92, 94}, m3647m = "invokeSuspend")
    /* renamed from: com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$3 */
    static final class C47833 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $cacheKey;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $fontAssetsFolder;
        final /* synthetic */ String $fontFileExtension;
        final /* synthetic */ String $imageAssetsFolder;
        final /* synthetic */ Function3<Integer, Throwable, Continuation<? super Boolean>, Object> $onRetry;
        final /* synthetic */ SnapshotState<LottieCompositionResult2> $result$delegate;
        final /* synthetic */ LottieCompositionSpec $spec;
        int I$0;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C47833(Function3<? super Integer, ? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> function3, Context context, LottieCompositionSpec lottieCompositionSpec, String str, String str2, String str3, String str4, SnapshotState<LottieCompositionResult2> snapshotState, Continuation<? super C47833> continuation) {
            super(2, continuation);
            this.$onRetry = function3;
            this.$context = context;
            this.$spec = lottieCompositionSpec;
            this.$imageAssetsFolder = str;
            this.$fontAssetsFolder = str2;
            this.$fontFileExtension = str3;
            this.$cacheKey = str4;
            this.$result$delegate = snapshotState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C47833(this.$onRetry, this.$context, this.$spec, this.$imageAssetsFolder, this.$fontAssetsFolder, this.$fontFileExtension, this.$cacheKey, this.$result$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C47833) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
        
            if (((java.lang.Boolean) r14).booleanValue() == false) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
        
            if (r14 == r1) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00ba A[ADDED_TO_REGION] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0090 -> B:43:0x0093). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i;
            Throwable th;
            int i2;
            Throwable th2;
            Throwable th3;
            C47833 c47833;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                i = 0;
                th = null;
            } else if (i3 == 1) {
                i = this.I$0;
                th = (Throwable) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = this.I$0;
                th3 = (Throwable) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    c47833 = this;
                } catch (Throwable th4) {
                    th = th4;
                    i = i2 + 1;
                }
                try {
                } catch (Throwable th5) {
                    th2 = th5;
                    int i4 = i2;
                    th = th2;
                    i = i4 + 1;
                    if (!rememberLottieComposition.rememberLottieComposition$lambda$1(this.$result$delegate).isSuccess()) {
                    }
                    if (!rememberLottieComposition.rememberLottieComposition$lambda$1(this.$result$delegate).isComplete()) {
                        rememberLottieComposition.rememberLottieComposition$lambda$1(this.$result$delegate).completeExceptionally$lottie_compose_release(th);
                    }
                    return Unit.INSTANCE;
                }
                rememberLottieComposition.rememberLottieComposition$lambda$1(c47833.$result$delegate).complete$lottie_compose_release((LottieComposition) obj);
                int i5 = i2;
                th = th3;
                i = i5;
            }
            if (!rememberLottieComposition.rememberLottieComposition$lambda$1(this.$result$delegate).isSuccess()) {
                if (i != 0) {
                    Function3<Integer, Throwable, Continuation<? super Boolean>, Object> function3 = this.$onRetry;
                    Integer numBoxInt = boxing.boxInt(i);
                    Intrinsics.checkNotNull(th);
                    this.L$0 = th;
                    this.I$0 = i;
                    this.label = 1;
                    obj = function3.invoke(numBoxInt, th, this);
                    if (obj == coroutine_suspended) {
                    }
                } else {
                    Throwable th6 = th;
                    i2 = i;
                    th3 = th6;
                    try {
                    } catch (Throwable th7) {
                        th2 = th7;
                        int i42 = i2;
                        th = th2;
                        i = i42 + 1;
                        if (!rememberLottieComposition.rememberLottieComposition$lambda$1(this.$result$delegate).isSuccess()) {
                        }
                        if (!rememberLottieComposition.rememberLottieComposition$lambda$1(this.$result$delegate).isComplete()) {
                        }
                        return Unit.INSTANCE;
                    }
                    Context context = this.$context;
                    LottieCompositionSpec lottieCompositionSpec = this.$spec;
                    String strEnsureTrailingSlash = rememberLottieComposition.ensureTrailingSlash(this.$imageAssetsFolder);
                    String strEnsureTrailingSlash2 = rememberLottieComposition.ensureTrailingSlash(this.$fontAssetsFolder);
                    String strEnsureLeadingPeriod = rememberLottieComposition.ensureLeadingPeriod(this.$fontFileExtension);
                    String str = this.$cacheKey;
                    this.L$0 = th3;
                    this.I$0 = i2;
                    this.label = 2;
                    c47833 = this;
                    obj = rememberLottieComposition.lottieComposition(context, lottieCompositionSpec, strEnsureTrailingSlash, strEnsureTrailingSlash2, strEnsureLeadingPeriod, str, c47833);
                }
                return coroutine_suspended;
            }
            if (!rememberLottieComposition.rememberLottieComposition$lambda$1(this.$result$delegate).isComplete() && th != null) {
                rememberLottieComposition.rememberLottieComposition$lambda$1(this.$result$delegate).completeExceptionally$lottie_compose_release(th);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object lottieComposition(Context context, LottieCompositionSpec lottieCompositionSpec, String str, String str2, String str3, String str4, Continuation<? super LottieComposition> continuation) throws FileNotFoundException {
        C47811 c47811;
        String str5;
        Context context2;
        LottieComposition lottieComposition;
        String str6;
        if (continuation instanceof C47811) {
            c47811 = (C47811) continuation;
            int i = c47811.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c47811.label = i - Integer.MIN_VALUE;
            } else {
                c47811 = new C47811(continuation);
            }
        }
        Object objAwait = c47811.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c47811.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwait);
            LottieTask<LottieComposition> lottieTask = lottieTask(context, lottieCompositionSpec, str4, false);
            if (lottieTask == null) {
                throw new IllegalArgumentException(("Unable to create parsing task for " + lottieCompositionSpec + ".").toString());
            }
            c47811.L$0 = context;
            c47811.L$1 = str;
            c47811.L$2 = str2;
            c47811.L$3 = str3;
            c47811.label = 1;
            objAwait = await(lottieTask, c47811);
            if (objAwait != coroutine_suspended) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                LottieComposition lottieComposition2 = (LottieComposition) c47811.L$0;
                ResultKt.throwOnFailure(objAwait);
                return lottieComposition2;
            }
            lottieComposition = (LottieComposition) c47811.L$3;
            str6 = (String) c47811.L$2;
            str5 = (String) c47811.L$1;
            context2 = (Context) c47811.L$0;
            ResultKt.throwOnFailure(objAwait);
            c47811.L$0 = lottieComposition;
            c47811.L$1 = null;
            c47811.L$2 = null;
            c47811.L$3 = null;
            c47811.label = 3;
            return loadFontsFromAssets(context2, lottieComposition, str5, str6, c47811) != coroutine_suspended ? coroutine_suspended : lottieComposition;
        }
        str3 = (String) c47811.L$3;
        str2 = (String) c47811.L$2;
        str = (String) c47811.L$1;
        context = (Context) c47811.L$0;
        ResultKt.throwOnFailure(objAwait);
        LottieComposition lottieComposition3 = (LottieComposition) objAwait;
        c47811.L$0 = context;
        c47811.L$1 = str2;
        c47811.L$2 = str3;
        c47811.L$3 = lottieComposition3;
        c47811.label = 2;
        if (loadImagesFromAssets(context, lottieComposition3, str, c47811) != coroutine_suspended) {
            str5 = str2;
            context2 = context;
            lottieComposition = lottieComposition3;
            str6 = str3;
            c47811.L$0 = lottieComposition;
            c47811.L$1 = null;
            c47811.L$2 = null;
            c47811.L$3 = null;
            c47811.label = 3;
            if (loadFontsFromAssets(context2, lottieComposition, str5, str6, c47811) != coroutine_suspended) {
            }
        }
    }

    private static final LottieTask<LottieComposition> lottieTask(Context context, LottieCompositionSpec lottieCompositionSpec, String str, boolean z) throws FileNotFoundException {
        if (lottieCompositionSpec instanceof LottieCompositionSpec.RawRes) {
            if (Intrinsics.areEqual(str, "__LottieInternalDefaultCacheKey__")) {
                return LottieCompositionFactory.fromRawRes(context, ((LottieCompositionSpec.RawRes) lottieCompositionSpec).getResId());
            }
            return LottieCompositionFactory.fromRawRes(context, ((LottieCompositionSpec.RawRes) lottieCompositionSpec).getResId(), str);
        }
        if (lottieCompositionSpec instanceof LottieCompositionSpec.Url) {
            if (Intrinsics.areEqual(str, "__LottieInternalDefaultCacheKey__")) {
                return LottieCompositionFactory.fromUrl(context, ((LottieCompositionSpec.Url) lottieCompositionSpec).getUrl());
            }
            return LottieCompositionFactory.fromUrl(context, ((LottieCompositionSpec.Url) lottieCompositionSpec).getUrl(), str);
        }
        if (lottieCompositionSpec instanceof LottieCompositionSpec.File) {
            if (z) {
                return null;
            }
            LottieCompositionSpec.File file = (LottieCompositionSpec.File) lottieCompositionSpec;
            FileInputStream fileInputStream = new FileInputStream(file.getFileName());
            if (Intrinsics.areEqual(str, "__LottieInternalDefaultCacheKey__")) {
                str = file.getFileName();
            }
            if (StringsKt.endsWith$default(file.getFileName(), Header.COMPRESSION_ALGORITHM, false, 2, (Object) null)) {
                return LottieCompositionFactory.fromZipStream(new ZipInputStream(fileInputStream), str);
            }
            if (StringsKt.endsWith$default(file.getFileName(), "tgs", false, 2, (Object) null)) {
                return LottieCompositionFactory.fromJsonInputStream(new GZIPInputStream(fileInputStream), str);
            }
            return LottieCompositionFactory.fromJsonInputStream(fileInputStream, str);
        }
        if (lottieCompositionSpec instanceof LottieCompositionSpec.Asset) {
            if (Intrinsics.areEqual(str, "__LottieInternalDefaultCacheKey__")) {
                return LottieCompositionFactory.fromAsset(context, ((LottieCompositionSpec.Asset) lottieCompositionSpec).getAssetName());
            }
            return LottieCompositionFactory.fromAsset(context, ((LottieCompositionSpec.Asset) lottieCompositionSpec).getAssetName(), str);
        }
        if (lottieCompositionSpec instanceof LottieCompositionSpec.JsonString) {
            if (Intrinsics.areEqual(str, "__LottieInternalDefaultCacheKey__")) {
                str = String.valueOf(((LottieCompositionSpec.JsonString) lottieCompositionSpec).getJsonString().hashCode());
            }
            return LottieCompositionFactory.fromJsonString(((LottieCompositionSpec.JsonString) lottieCompositionSpec).getJsonString(), str);
        }
        if (!(lottieCompositionSpec instanceof LottieCompositionSpec.ContentProvider)) {
            throw new NoWhenBranchMatchedException();
        }
        LottieCompositionSpec.ContentProvider contentProvider = (LottieCompositionSpec.ContentProvider) lottieCompositionSpec;
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(contentProvider.getUri());
        if (Intrinsics.areEqual(str, "__LottieInternalDefaultCacheKey__")) {
            str = contentProvider.getUri().toString();
        }
        String string2 = contentProvider.getUri().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        if (StringsKt.endsWith$default(string2, Header.COMPRESSION_ALGORITHM, false, 2, (Object) null)) {
            return LottieCompositionFactory.fromZipStream(new ZipInputStream(inputStreamOpenInputStream), str);
        }
        String string3 = contentProvider.getUri().toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        if (StringsKt.endsWith$default(string3, "tgs", false, 2, (Object) null)) {
            return LottieCompositionFactory.fromJsonInputStream(new GZIPInputStream(inputStreamOpenInputStream), str);
        }
        return LottieCompositionFactory.fromJsonInputStream(inputStreamOpenInputStream, str);
    }

    private static final Object loadImagesFromAssets(Context context, LottieComposition lottieComposition, String str, Continuation<? super Unit> continuation) {
        if (!lottieComposition.hasImages()) {
            return Unit.INSTANCE;
        }
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C47802(lottieComposition, context, str, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* compiled from: rememberLottieComposition.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadImagesFromAssets$2", m3645f = "rememberLottieComposition.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.airbnb.lottie.compose.RememberLottieCompositionKt$loadImagesFromAssets$2 */
    static final class C47802 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LottieComposition $composition;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $imageAssetsFolder;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C47802(LottieComposition lottieComposition, Context context, String str, Continuation<? super C47802> continuation) {
            super(2, continuation);
            this.$composition = lottieComposition;
            this.$context = context;
            this.$imageAssetsFolder = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C47802(this.$composition, this.$context, this.$imageAssetsFolder, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C47802) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws IOException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            for (LottieImageAsset lottieImageAsset : this.$composition.getImages().values()) {
                Intrinsics.checkNotNull(lottieImageAsset);
                rememberLottieComposition.maybeDecodeBase64Image(lottieImageAsset);
                rememberLottieComposition.maybeLoadImageFromAsset(this.$context, lottieImageAsset, this.$imageAssetsFolder);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void maybeLoadImageFromAsset(Context context, LottieImageAsset lottieImageAsset, String str) throws IOException {
        if (lottieImageAsset.getBitmap() != null || str == null) {
            return;
        }
        String fileName = lottieImageAsset.getFileName();
        try {
            InputStream inputStreamOpen = context.getAssets().open(str + fileName);
            Intrinsics.checkNotNull(inputStreamOpen);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE;
                lottieImageAsset.setBitmap(Utils.resizeBitmapIfNeeded(BitmapFactory.decodeStream(inputStreamOpen, null, options), lottieImageAsset.getWidth(), lottieImageAsset.getHeight()));
            } catch (IllegalArgumentException e) {
                Logger.warning("Unable to decode image.", e);
            }
        } catch (IOException e2) {
            Logger.warning("Unable to open asset.", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void maybeDecodeBase64Image(LottieImageAsset lottieImageAsset) {
        if (lottieImageAsset.getBitmap() != null) {
            return;
        }
        String fileName = lottieImageAsset.getFileName();
        Intrinsics.checkNotNull(fileName);
        if (!StringsKt.startsWith$default(fileName, "data:", false, 2, (Object) null) || StringsKt.indexOf$default((CharSequence) fileName, "base64,", 0, false, 6, (Object) null) <= 0) {
            return;
        }
        try {
            String strSubstring = fileName.substring(StringsKt.indexOf$default((CharSequence) fileName, ',', 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            byte[] bArrDecode = Base64.decode(strSubstring, 0);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = true;
            options.inDensity = EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE;
            lottieImageAsset.setBitmap(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
        } catch (IllegalArgumentException e) {
            Logger.warning("data URL did not have correct base64 format.", e);
        }
    }

    /* compiled from: rememberLottieComposition.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadFontsFromAssets$2", m3645f = "rememberLottieComposition.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.airbnb.lottie.compose.RememberLottieCompositionKt$loadFontsFromAssets$2 */
    static final class C47792 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LottieComposition $composition;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $fontAssetsFolder;
        final /* synthetic */ String $fontFileExtension;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C47792(LottieComposition lottieComposition, Context context, String str, String str2, Continuation<? super C47792> continuation) {
            super(2, continuation);
            this.$composition = lottieComposition;
            this.$context = context;
            this.$fontAssetsFolder = str;
            this.$fontFileExtension = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C47792(this.$composition, this.$context, this.$fontAssetsFolder, this.$fontFileExtension, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C47792) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            for (Font font : this.$composition.getFonts().values()) {
                Context context = this.$context;
                Intrinsics.checkNotNull(font);
                rememberLottieComposition.maybeLoadTypefaceFromAssets(context, font, this.$fontAssetsFolder, this.$fontFileExtension);
            }
            return Unit.INSTANCE;
        }
    }

    private static final Object loadFontsFromAssets(Context context, LottieComposition lottieComposition, String str, String str2, Continuation<? super Unit> continuation) {
        Object objWithContext;
        return (!lottieComposition.getFonts().isEmpty() && (objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C47792(lottieComposition, context, str, str2, null), continuation)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void maybeLoadTypefaceFromAssets(Context context, Font font, String str, String str2) {
        String str3 = str + font.getFamily() + str2;
        try {
            Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), str3);
            try {
                Intrinsics.checkNotNull(typefaceCreateFromAsset);
                String style = font.getStyle();
                Intrinsics.checkNotNullExpressionValue(style, "getStyle(...)");
                font.setTypeface(typefaceForStyle(typefaceCreateFromAsset, style));
            } catch (Exception e) {
                Logger.error("Failed to create " + font.getFamily() + " typeface with style=" + font.getStyle() + "!", e);
            }
        } catch (Exception e2) {
            Logger.error("Failed to find typeface in assets with path " + str3 + ".", e2);
        }
    }

    private static final Typeface typefaceForStyle(Typeface typeface, String str) {
        int i = 0;
        boolean zContains$default = StringsKt.contains$default((CharSequence) str, (CharSequence) "Italic", false, 2, (Object) null);
        boolean zContains$default2 = StringsKt.contains$default((CharSequence) str, (CharSequence) "Bold", false, 2, (Object) null);
        if (zContains$default && zContains$default2) {
            i = 3;
        } else if (zContains$default) {
            i = 2;
        } else if (zContains$default2) {
            i = 1;
        }
        return typeface.getStyle() == i ? typeface : Typeface.create(typeface, i);
    }

    private static final <T> Object await(LottieTask<T> lottieTask, Continuation<? super T> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        lottieTask.addListener(new LottieListener() { // from class: com.airbnb.lottie.compose.RememberLottieCompositionKt$await$2$1
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(T t) {
                if (cancellableContinuationImpl.isCompleted()) {
                    return;
                }
                cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(t));
            }
        }).addFailureListener(new LottieListener() { // from class: com.airbnb.lottie.compose.RememberLottieCompositionKt$await$2$2
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(Throwable th) {
                if (cancellableContinuationImpl.isCompleted()) {
                    return;
                }
                CancellableContinuation<T> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.checkNotNull(th);
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(th)));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureTrailingSlash(String str) {
        if (str == null || StringsKt.isBlank(str)) {
            return null;
        }
        if (StringsKt.endsWith$default((CharSequence) str, '/', false, 2, (Object) null)) {
            return str;
        }
        return str + "/";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureLeadingPeriod(String str) {
        if (StringsKt.isBlank(str) || StringsKt.startsWith$default(str, ".", false, 2, (Object) null)) {
            return str;
        }
        return "." + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LottieCompositionResult2 rememberLottieComposition$lambda$1(SnapshotState<LottieCompositionResult2> snapshotState) {
        return snapshotState.getValue();
    }
}
