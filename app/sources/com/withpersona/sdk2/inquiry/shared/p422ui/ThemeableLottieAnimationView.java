package com.withpersona.sdk2.inquiry.shared.p422ui;

import android.content.Context;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieOnCompositionLoadedListener;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;
import com.withpersona.sdk2.inquiry.shared.p422ui.ThemeableLottieAnimationView;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p481io.Closeable;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Interruptible;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import okio.Okio;

/* compiled from: ThemeableLottieAnimationView.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;", "Lcom/airbnb/lottie/LottieAnimationView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "srcColor", "destColor", "", "addColorReplacement", "(II)V", "", "url", "Lkotlinx/coroutines/Job;", "loadFromUrl", "(Ljava/lang/String;)Lkotlinx/coroutines/Job;", "onDetachedFromWindow", "()V", "", "srcColorToDestColor", "Ljava/util/Map;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class ThemeableLottieAnimationView extends LottieAnimationView {
    private final CoroutineScope scope;
    private final Map<Integer, Integer> srcColorToDestColor;

    public ThemeableLottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.srcColorToDestColor = new LinkedHashMap();
        this.scope = CoroutineScope2.CoroutineScope(Dispatchers.getDefault());
        addLottieOnCompositionLoadedListener(new LottieOnCompositionLoadedListener() { // from class: com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView$$ExternalSyntheticLambda0
            @Override // com.airbnb.lottie.LottieOnCompositionLoadedListener
            public final void onCompositionLoaded(LottieComposition lottieComposition) {
                ThemeableLottieAnimationView._init_$lambda$0(this.f$0, lottieComposition);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(final ThemeableLottieAnimationView themeableLottieAnimationView, LottieComposition lottieComposition) {
        themeableLottieAnimationView.addValueCallback(new KeyPath("**"), (KeyPath) LottieProperty.COLOR, (LottieValueCallback<KeyPath>) new LottieValueCallback<Integer>() { // from class: com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView$1$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.airbnb.lottie.value.LottieValueCallback
            public Integer getValue(LottieFrameInfo<Integer> frameInfo) {
                Integer num = (Integer) this.this$0.srcColorToDestColor.get(frameInfo != null ? frameInfo.getStartValue() : null);
                if (num != null) {
                    return num;
                }
                if (frameInfo != null) {
                    return frameInfo.getEndValue();
                }
                return null;
            }
        });
        themeableLottieAnimationView.addValueCallback(new KeyPath("**"), (KeyPath) LottieProperty.STROKE_COLOR, (LottieValueCallback<KeyPath>) new LottieValueCallback<Integer>() { // from class: com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView$1$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.airbnb.lottie.value.LottieValueCallback
            public Integer getValue(LottieFrameInfo<Integer> frameInfo) {
                Integer num = (Integer) this.this$0.srcColorToDestColor.get(frameInfo != null ? frameInfo.getStartValue() : null);
                if (num != null) {
                    return num;
                }
                if (frameInfo != null) {
                    return frameInfo.getEndValue();
                }
                return null;
            }
        });
    }

    public final void addColorReplacement(int srcColor, int destColor) {
        this.srcColorToDestColor.put(Integer.valueOf(srcColor), Integer.valueOf(destColor));
    }

    /* compiled from: ThemeableLottieAnimationView.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView$loadFromUrl$1", m3645f = "ThemeableLottieAnimationView.kt", m3646l = {66, 79}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView$loadFromUrl$1 */
    static final class C437601 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $url;
        int label;
        final /* synthetic */ ThemeableLottieAnimationView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C437601(String str, ThemeableLottieAnimationView themeableLottieAnimationView, Continuation<? super C437601> continuation) {
            super(2, continuation);
            this.$url = str;
            this.this$0 = themeableLottieAnimationView;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C437601(this.$url, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C437601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r1, r3, r6) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                final String str = this.$url;
                Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView$loadFromUrl$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ThemeableLottieAnimationView.C437601.invokeSuspend$lambda$1(str);
                    }
                };
                this.label = 1;
                obj = Interruptible.runInterruptible(io2, function0, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            String str2 = (String) obj;
            if (str2 != null) {
                MainCoroutineDispatcher main = Dispatchers.getMain();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, str2, null);
                this.label = 2;
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeSuspend$lambda$1(String str) throws IOException {
            try {
                InputStream inputStreamOpenStream = new URL(str).openStream();
                try {
                    Intrinsics.checkNotNull(inputStreamOpenStream);
                    String utf8 = Okio.buffer(Okio.source(inputStreamOpenStream)).readUtf8();
                    Closeable.closeFinally(inputStreamOpenStream, null);
                    return utf8;
                } finally {
                }
            } catch (Exception unused) {
                return null;
            }
        }

        /* compiled from: ThemeableLottieAnimationView.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView$loadFromUrl$1$1", m3645f = "ThemeableLottieAnimationView.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView$loadFromUrl$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $json;
            int label;
            final /* synthetic */ ThemeableLottieAnimationView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ThemeableLottieAnimationView themeableLottieAnimationView, String str, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = themeableLottieAnimationView;
                this.$json = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$json, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.setAnimationFromJson(this.$json, null);
                return Unit.INSTANCE;
            }
        }
    }

    public final Job loadFromUrl(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C437601(url, this, null), 3, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoroutineScope2.cancel$default(this.scope, null, 1, null);
    }
}
