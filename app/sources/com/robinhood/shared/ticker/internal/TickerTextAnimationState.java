package com.robinhood.shared.ticker.internal;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.shared.ticker.TextType;
import com.robinhood.shared.ticker.config.TickerLocaleConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.Channel3;
import kotlinx.coroutines.channels.Channel4;

/* compiled from: TickerTextAnimationState.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u0003J\u000e\u00106\u001a\u000204H\u0086@¢\u0006\u0002\u00107J\u000e\u00108\u001a\u000204H\u0082@¢\u0006\u0002\u00107J\u0010\u00109\u001a\u0004\u0018\u00010:2\u0006\u0010;\u001a\u00020\u001dJ\u0015\u0010<\u001a\u0002042\u0006\u0010=\u001a\u00020\u000eH\u0001¢\u0006\u0002\b>J\u0015\u0010?\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u0003H\u0001¢\u0006\u0002\b@J\u0013\u0010A\u001a\b\u0012\u0004\u0012\u00020(0'H\u0001¢\u0006\u0002\bBR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR/\u0010 \u001a\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u00038F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\u0015\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R&\u0010,\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u00038\u0000@BX\u0081\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010.\u001a\u0004\b/\u0010\"R*\u00100\u001a\u0004\u0018\u00010\u00032\b\u0010&\u001a\u0004\u0018\u00010\u00038\u0000@BX\u0081\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010.\u001a\u0004\b2\u0010\"¨\u0006C"}, m3636d2 = {"Lcom/robinhood/shared/ticker/internal/TickerTextAnimationState;", "", "initialText", "", "textType", "Lcom/robinhood/shared/ticker/TextType;", "localeConfig", "Lcom/robinhood/shared/ticker/config/TickerLocaleConfig;", "<init>", "(Ljava/lang/String;Lcom/robinhood/shared/ticker/TextType;Lcom/robinhood/shared/ticker/config/TickerLocaleConfig;)V", "textChannel", "Lkotlinx/coroutines/channels/Channel;", "animationPortionOfLastRequestedText", "<set-?>", "Lcom/robinhood/shared/ticker/internal/AnimatedTextState;", "animatedTextState", "getAnimatedTextState", "()Lcom/robinhood/shared/ticker/internal/AnimatedTextState;", "setAnimatedTextState", "(Lcom/robinhood/shared/ticker/internal/AnimatedTextState;)V", "animatedTextState$delegate", "Landroidx/compose/runtime/MutableState;", "animationProgress", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "getAnimationProgress", "()Landroidx/compose/animation/core/Animatable;", "columnsToRender", "", "getColumnsToRender", "()I", "currentTrailingSymbol", "getCurrentTrailingSymbol", "()Ljava/lang/String;", "setCurrentTrailingSymbol", "(Ljava/lang/String;)V", "currentTrailingSymbol$delegate", "value", "", "Lcom/robinhood/shared/ticker/internal/SeparatorRenderInfo;", "separatorRenderInfo", "getSeparatorRenderInfo", "()Ljava/util/List;", "currentTextWithoutSeparators", "getCurrentTextWithoutSeparators$lib_ticker_compose_externalDebug$annotations", "()V", "getCurrentTextWithoutSeparators$lib_ticker_compose_externalDebug", "previousTextWithoutSeparators", "getPreviousTextWithoutSeparators$lib_ticker_compose_externalDebug$annotations", "getPreviousTextWithoutSeparators$lib_ticker_compose_externalDebug", "updateText", "", "text", "processAnimations", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateWithInterruptionSupport", "getColumnSnapshot", "Lcom/robinhood/shared/ticker/internal/TickerColumnSnapshot;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "updateAnimatedTextState", "newState", "updateAnimatedTextState$lib_ticker_compose_externalDebug", "extractAnimatedPortion", "extractAnimatedPortion$lib_ticker_compose_externalDebug", "computeSeparatorRenderInfo", "computeSeparatorRenderInfo$lib_ticker_compose_externalDebug", "lib-ticker-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class TickerTextAnimationState {
    public static final int $stable = 0;

    /* renamed from: animatedTextState$delegate, reason: from kotlin metadata */
    private final SnapshotState animatedTextState;
    private volatile String animationPortionOfLastRequestedText;
    private final Animatable<Float, AnimationVectors2> animationProgress;
    private String currentTextWithoutSeparators;

    /* renamed from: currentTrailingSymbol$delegate, reason: from kotlin metadata */
    private final SnapshotState currentTrailingSymbol;
    private final TickerLocaleConfig localeConfig;
    private String previousTextWithoutSeparators;
    private List<SeparatorRenderInfo> separatorRenderInfo;
    private final Channel<String> textChannel;
    private final TextType textType;

    /* compiled from: TickerTextAnimationState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.ticker.internal.TickerTextAnimationState", m3645f = "TickerTextAnimationState.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE, EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE, EnumC7081g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE, EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE}, m3647m = "animateWithInterruptionSupport")
    /* renamed from: com.robinhood.shared.ticker.internal.TickerTextAnimationState$animateWithInterruptionSupport$1 */
    static final class C400931 extends ContinuationImpl {
        float F$0;
        float F$1;
        int label;
        /* synthetic */ Object result;

        C400931(Continuation<? super C400931> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TickerTextAnimationState.this.animateWithInterruptionSupport(this);
        }
    }

    /* compiled from: TickerTextAnimationState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.ticker.internal.TickerTextAnimationState", m3645f = "TickerTextAnimationState.kt", m3646l = {136, 147, 156}, m3647m = "processAnimations")
    /* renamed from: com.robinhood.shared.ticker.internal.TickerTextAnimationState$processAnimations$1 */
    static final class C400941 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C400941(Continuation<? super C400941> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TickerTextAnimationState.this.processAnimations(this);
        }
    }

    /* renamed from: getCurrentTextWithoutSeparators$lib_ticker_compose_externalDebug$annotations */
    public static /* synthetic */ void m2845xad3f3fde() {
    }

    /* renamed from: getPreviousTextWithoutSeparators$lib_ticker_compose_externalDebug$annotations */
    public static /* synthetic */ void m2846x9736cc88() {
    }

    public TickerTextAnimationState(String initialText, TextType textType, TickerLocaleConfig localeConfig) throws IOException {
        String current;
        Intrinsics.checkNotNullParameter(initialText, "initialText");
        Intrinsics.checkNotNullParameter(textType, "textType");
        Intrinsics.checkNotNullParameter(localeConfig, "localeConfig");
        this.textType = textType;
        this.localeConfig = localeConfig;
        this.textChannel = Channel4.Channel$default(-1, null, null, 6, null);
        this.animationPortionOfLastRequestedText = initialText;
        this.animatedTextState = SnapshotState3.mutableStateOf$default(new AnimatedTextState(null, extractAnimatedPortion$lib_ticker_compose_externalDebug(initialText)), null, 2, null);
        this.animationProgress = Animatable2.Animatable$default(0.0f, 0.0f, 2, null);
        this.currentTrailingSymbol = SnapshotState3.mutableStateOf$default(TickerTextUtils.extractTrailingSymbol(initialText, textType, localeConfig), null, 2, null);
        this.separatorRenderInfo = computeSeparatorRenderInfo$lib_ticker_compose_externalDebug();
        if (textType.getAnimateSeparatorsSeparately()) {
            current = TickerTextUtils.stripGroupingSeparators(getAnimatedTextState().getCurrent(), localeConfig);
        } else {
            current = getAnimatedTextState().getCurrent();
        }
        this.currentTextWithoutSeparators = current;
    }

    public /* synthetic */ TickerTextAnimationState(String str, TextType textType, TickerLocaleConfig tickerLocaleConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? TextType.DEFAULT : textType, tickerLocaleConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final AnimatedTextState getAnimatedTextState() {
        return (AnimatedTextState) this.animatedTextState.getValue();
    }

    private final void setAnimatedTextState(AnimatedTextState animatedTextState) {
        this.animatedTextState.setValue(animatedTextState);
    }

    public final Animatable<Float, AnimationVectors2> getAnimationProgress() {
        return this.animationProgress;
    }

    public final int getColumnsToRender() {
        int length = this.currentTextWithoutSeparators.length();
        String str = this.previousTextWithoutSeparators;
        return Math.max(length, str != null ? str.length() : 0);
    }

    private final void setCurrentTrailingSymbol(String str) {
        this.currentTrailingSymbol.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getCurrentTrailingSymbol() {
        return (String) this.currentTrailingSymbol.getValue();
    }

    public final List<SeparatorRenderInfo> getSeparatorRenderInfo() {
        return this.separatorRenderInfo;
    }

    /* renamed from: getCurrentTextWithoutSeparators$lib_ticker_compose_externalDebug, reason: from getter */
    public final String getCurrentTextWithoutSeparators() {
        return this.currentTextWithoutSeparators;
    }

    /* renamed from: getPreviousTextWithoutSeparators$lib_ticker_compose_externalDebug, reason: from getter */
    public final String getPreviousTextWithoutSeparators() {
        return this.previousTextWithoutSeparators;
    }

    public final void updateText(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.animationPortionOfLastRequestedText = extractAnimatedPortion$lib_ticker_compose_externalDebug(text);
        this.textChannel.mo8337trySendJP2dKIU(text);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072 A[PHI: r2 r12
      0x0072: PHI (r2v5 kotlinx.coroutines.channels.ChannelIterator<java.lang.String>) = 
      (r2v7 kotlinx.coroutines.channels.ChannelIterator<java.lang.String>)
      (r2v11 kotlinx.coroutines.channels.ChannelIterator<java.lang.String>)
     binds: [B:20:0x006f, B:17:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0072: PHI (r12v5 java.lang.Object) = (r12v12 java.lang.Object), (r12v1 java.lang.Object) binds: [B:20:0x006f, B:17:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x009b -> B:19:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00cd -> B:34:0x00ce). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processAnimations(Continuation<? super Unit> continuation) throws IOException {
        C400941 c400941;
        Channel3<String> it;
        String strExtractAnimatedPortion$lib_ticker_compose_externalDebug;
        Channel3<String> channel3;
        String str;
        if (continuation instanceof C400941) {
            c400941 = (C400941) continuation;
            int i = c400941.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c400941.label = i - Integer.MIN_VALUE;
            } else {
                c400941 = new C400941(continuation);
            }
        }
        Object objHasNext = c400941.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c400941.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objHasNext);
            it = this.textChannel.iterator();
            c400941.L$0 = it;
            c400941.L$1 = null;
            c400941.label = 1;
            objHasNext = it.hasNext(c400941);
            if (objHasNext != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                str = (String) c400941.L$2;
                String str2 = (String) c400941.L$1;
                Channel3<String> channel32 = (Channel3) c400941.L$0;
                ResultKt.throwOnFailure(objHasNext);
                strExtractAnimatedPortion$lib_ticker_compose_externalDebug = str2;
                channel3 = channel32;
                updateAnimatedTextState$lib_ticker_compose_externalDebug(new AnimatedTextState(str, strExtractAnimatedPortion$lib_ticker_compose_externalDebug));
                c400941.L$0 = channel3;
                c400941.L$1 = strExtractAnimatedPortion$lib_ticker_compose_externalDebug;
                c400941.L$2 = null;
                c400941.label = 3;
                if (animateWithInterruptionSupport(c400941) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str3 = (String) c400941.L$1;
            channel3 = (Channel3) c400941.L$0;
            ResultKt.throwOnFailure(objHasNext);
            updateAnimatedTextState$lib_ticker_compose_externalDebug(new AnimatedTextState(null, str3));
            it = channel3;
            c400941.L$0 = it;
            c400941.L$1 = null;
            c400941.label = 1;
            objHasNext = it.hasNext(c400941);
            if (objHasNext != coroutine_suspended) {
                if (!((Boolean) objHasNext).booleanValue()) {
                    String next = it.next();
                    setCurrentTrailingSymbol(TickerTextUtils.extractTrailingSymbol(next, this.textType, this.localeConfig));
                    strExtractAnimatedPortion$lib_ticker_compose_externalDebug = extractAnimatedPortion$lib_ticker_compose_externalDebug(next);
                    String current = getAnimatedTextState().getCurrent();
                    if (Intrinsics.areEqual(strExtractAnimatedPortion$lib_ticker_compose_externalDebug, current)) {
                        c400941.L$0 = it;
                        c400941.L$1 = null;
                        c400941.label = 1;
                        objHasNext = it.hasNext(c400941);
                        if (objHasNext != coroutine_suspended) {
                        }
                    } else {
                        Animatable<Float, AnimationVectors2> animatable = this.animationProgress;
                        Float fBoxFloat = boxing.boxFloat(0.0f);
                        c400941.L$0 = it;
                        c400941.L$1 = strExtractAnimatedPortion$lib_ticker_compose_externalDebug;
                        c400941.L$2 = current;
                        c400941.label = 2;
                        if (animatable.snapTo(fBoxFloat, c400941) != coroutine_suspended) {
                            channel3 = it;
                            str = current;
                            updateAnimatedTextState$lib_ticker_compose_externalDebug(new AnimatedTextState(str, strExtractAnimatedPortion$lib_ticker_compose_externalDebug));
                            c400941.L$0 = channel3;
                            c400941.L$1 = strExtractAnimatedPortion$lib_ticker_compose_externalDebug;
                            c400941.L$2 = null;
                            c400941.label = 3;
                            if (animateWithInterruptionSupport(c400941) != coroutine_suspended) {
                                str3 = strExtractAnimatedPortion$lib_ticker_compose_externalDebug;
                                updateAnimatedTextState$lib_ticker_compose_externalDebug(new AnimatedTextState(null, str3));
                                it = channel3;
                                c400941.L$0 = it;
                                c400941.L$1 = null;
                                c400941.label = 1;
                                objHasNext = it.hasNext(c400941);
                                if (objHasNext != coroutine_suspended) {
                                }
                            }
                        }
                    }
                } else {
                    return Unit.INSTANCE;
                }
            }
            return coroutine_suspended;
        }
        it = (Channel3) c400941.L$0;
        ResultKt.throwOnFailure(objHasNext);
        if (!((Boolean) objHasNext).booleanValue()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f9, code lost:
    
        if (r1.snapTo(r2, r15) == r3) goto L40;
     */
    /* JADX WARN: Path cross not found for [B:21:0x0061, B:35:0x00e0], limit reached: 40 */
    /* JADX WARN: Path cross not found for [B:35:0x00e0, B:21:0x0061], limit reached: 40 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ed A[PHI: r15
      0x00ed: PHI (r15v1 com.robinhood.shared.ticker.internal.TickerTextAnimationState$animateWithInterruptionSupport$1) = 
      (r15v3 com.robinhood.shared.ticker.internal.TickerTextAnimationState$animateWithInterruptionSupport$1)
      (r15v4 com.robinhood.shared.ticker.internal.TickerTextAnimationState$animateWithInterruptionSupport$1)
     binds: [B:29:0x00b5, B:22:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00de -> B:21:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00ea -> B:21:0x0061). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object animateWithInterruptionSupport(Continuation<? super Unit> continuation) {
        C400931 c400931;
        float f;
        C400931 c4009312;
        float fCoerceIn;
        if (continuation instanceof C400931) {
            c400931 = (C400931) continuation;
            int i = c400931.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c400931.label = i - Integer.MIN_VALUE;
            } else {
                c400931 = new C400931(continuation);
            }
        }
        Object obj = c400931.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c400931.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            f = 1.0f / 15;
            c4009312 = c400931;
        } else if (i2 == 1) {
            ResultKt.throwOnFailure(obj);
            c4009312 = c400931;
            Animatable<Float, AnimationVectors2> animatable = this.animationProgress;
            Float fBoxFloat = boxing.boxFloat(1.0f);
            c4009312.label = 4;
        } else if (i2 == 2) {
            fCoerceIn = c400931.F$1;
            float f2 = c400931.F$0;
            ResultKt.throwOnFailure(obj);
            c4009312 = c400931;
            f = f2;
            if (fCoerceIn < 1.0f) {
                c4009312.F$0 = f;
                c4009312.label = 3;
                if (DelayKt.delay(16L, c4009312) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
        } else {
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            float f3 = c400931.F$0;
            ResultKt.throwOnFailure(obj);
            c4009312 = c400931;
            f = f3;
        }
        if (this.animationProgress.getValue().floatValue() >= 1.0f) {
            if (this.animationPortionOfLastRequestedText.length() != getAnimatedTextState().getCurrent().length()) {
                float fFloatValue = 1.0f - this.animationProgress.getValue().floatValue();
                Animatable<Float, AnimationVectors2> animatable2 = this.animationProgress;
                Float fBoxFloat2 = boxing.boxFloat(1.0f);
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default((int) (75 * fFloatValue), 0, null, 6, null);
                c4009312.label = 1;
                if (Animatable.animateTo$default(animatable2, fBoxFloat2, tweenSpecTween$default, null, null, c4009312, 12, null) != coroutine_suspended) {
                    c400931 = c4009312;
                    c4009312 = c400931;
                    Animatable<Float, AnimationVectors2> animatable3 = this.animationProgress;
                    Float fBoxFloat3 = boxing.boxFloat(1.0f);
                    c4009312.label = 4;
                }
            } else {
                fCoerceIn = RangesKt.coerceIn(this.animationProgress.getValue().floatValue() + f, 0.0f, 1.0f);
                Animatable<Float, AnimationVectors2> animatable4 = this.animationProgress;
                Float fBoxFloat4 = boxing.boxFloat(fCoerceIn);
                c4009312.F$0 = f;
                c4009312.F$1 = fCoerceIn;
                c4009312.label = 2;
                if (animatable4.snapTo(fBoxFloat4, c4009312) != coroutine_suspended) {
                    if (fCoerceIn < 1.0f) {
                    }
                    if (this.animationProgress.getValue().floatValue() >= 1.0f) {
                        Animatable<Float, AnimationVectors2> animatable32 = this.animationProgress;
                        Float fBoxFloat32 = boxing.boxFloat(1.0f);
                        c4009312.label = 4;
                    }
                }
            }
        }
        return coroutine_suspended;
    }

    public final TickerColumnSnapshot getColumnSnapshot(int index) {
        String str = this.currentTextWithoutSeparators;
        String str2 = this.previousTextWithoutSeparators;
        Character orNull = StringsKt.getOrNull(str, index);
        Character orNull2 = str2 != null ? StringsKt.getOrNull(str2, index) : null;
        if (orNull == null && orNull2 != null) {
            return new TickerColumnSnapshot(null, orNull2.charValue(), ScrollDirection.f6278UP, true, false);
        }
        if (orNull != null && orNull2 == null && str2 != null) {
            return new TickerColumnSnapshot(null, orNull.charValue(), ScrollDirection.f6278UP, false, true);
        }
        if (orNull != null && orNull2 != null && !Intrinsics.areEqual(orNull, orNull2)) {
            return new TickerColumnSnapshot(orNull2, orNull.charValue(), Intrinsics.compare((int) orNull.charValue(), (int) orNull2.charValue()) > 0 ? ScrollDirection.DOWN : ScrollDirection.f6278UP, false, false);
        }
        if (orNull != null) {
            return new TickerColumnSnapshot(null, orNull.charValue(), ScrollDirection.f6278UP, false, false);
        }
        return null;
    }

    public final void updateAnimatedTextState$lib_ticker_compose_externalDebug(AnimatedTextState newState) throws IOException {
        String current;
        String strStripGroupingSeparators;
        Intrinsics.checkNotNullParameter(newState, "newState");
        setAnimatedTextState(newState);
        if (this.textType.getAnimateSeparatorsSeparately()) {
            current = TickerTextUtils.stripGroupingSeparators(newState.getCurrent(), this.localeConfig);
        } else {
            current = newState.getCurrent();
        }
        this.currentTextWithoutSeparators = current;
        if (newState.getPrevious() == null) {
            strStripGroupingSeparators = null;
        } else {
            strStripGroupingSeparators = this.textType.getAnimateSeparatorsSeparately() ? TickerTextUtils.stripGroupingSeparators(newState.getPrevious(), this.localeConfig) : newState.getPrevious();
        }
        this.previousTextWithoutSeparators = strStripGroupingSeparators;
        this.separatorRenderInfo = computeSeparatorRenderInfo$lib_ticker_compose_externalDebug();
    }

    public final String extractAnimatedPortion$lib_ticker_compose_externalDebug(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        String strExtractTrailingSymbol = TickerTextUtils.extractTrailingSymbol(text, this.textType, this.localeConfig);
        return strExtractTrailingSymbol != null ? StringsKt.dropLast(text, strExtractTrailingSymbol.length()) : text;
    }

    public final List<SeparatorRenderInfo> computeSeparatorRenderInfo$lib_ticker_compose_externalDebug() {
        Set setEmptySet;
        if (!this.textType.getAnimateSeparatorsSeparately()) {
            return CollectionsKt.emptyList();
        }
        AnimatedTextState animatedTextState = getAnimatedTextState();
        Set set = CollectionsKt.toSet(TickerTextUtils.extractGroupingSeparatorPositions(animatedTextState.getCurrent(), this.localeConfig));
        String previous = animatedTextState.getPrevious();
        if (previous == null || (setEmptySet = CollectionsKt.toSet(TickerTextUtils.extractGroupingSeparatorPositions(previous, this.localeConfig))) == null) {
            setEmptySet = SetsKt.emptySet();
        }
        List listSorted = CollectionsKt.sorted(SetsKt.plus(set, (Iterable) setEmptySet));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSorted, 10));
        Iterator it = listSorted.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            boolean zContains = set.contains(Integer.valueOf(iIntValue));
            boolean zContains2 = setEmptySet.contains(Integer.valueOf(iIntValue));
            boolean z = false;
            boolean z2 = zContains && !zContains2;
            if (!zContains && zContains2) {
                z = true;
            }
            arrayList.add(new SeparatorRenderInfo(iIntValue, z2, z, this.localeConfig.getGroupingSeparator()));
        }
        return arrayList;
    }
}
