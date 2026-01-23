package com.robinhood.shared.education.order;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.model.KeyPath;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OrderTypeEducation.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0003:;<B\u0081\u0001\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u001a\u0010\t\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u000b\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR%\u0010\t\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b#\u0010!R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b$\u0010!j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9¨\u0006="}, m3636d2 = {"Lcom/robinhood/shared/education/order/OrderTypeEducation;", "", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "", "promptRes", "animationRes", "Lcom/robinhood/shared/education/order/OrderTypeEducation$AnimationRes;", "repeatMarker", "", "animationCopy", "", "Lkotlin/Pair;", "keyPaths", "Lcom/robinhood/shared/education/order/OrderTypeEducation$KeyPaths;", "dimensionRatio", "disclaimerRes", "disclaimerAlertTitleRes", "disclaimerAlertMessageRes", "<init>", "(Ljava/lang/String;IIILcom/robinhood/shared/education/order/OrderTypeEducation$AnimationRes;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/shared/education/order/OrderTypeEducation$KeyPaths;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getTitleRes", "()I", "getPromptRes", "getAnimationRes", "()Lcom/robinhood/shared/education/order/OrderTypeEducation$AnimationRes;", "getRepeatMarker", "()Ljava/lang/String;", "getAnimationCopy", "()Ljava/util/List;", "getKeyPaths", "()Lcom/robinhood/shared/education/order/OrderTypeEducation$KeyPaths;", "getDimensionRatio", "getDisclaimerRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDisclaimerAlertTitleRes", "getDisclaimerAlertMessageRes", "MARKET_BUY", "MARKET_SELL", "LIMIT_BUY", "LIMIT_SELL", "STOP_BUY", "STOP_SELL", "STOP_LIMIT_BUY", "STOP_LIMIT_SELL", "TRAILING_STOP_BUY", "TRAILING_STOP_SELL", "RECURRING_BUY", "LIMIT_BUY_CRYPTO", "LIMIT_SELL_CRYPTO", "STOP_BUY_CRYPTO", "STOP_SELL_CRYPTO", "STOP_LIMIT_BUY_CRYPTO", "STOP_LIMIT_SELL_CRYPTO", "LIMIT_LONG_PERPETUAL", "LIMIT_SHORT_PERPETUAL", "LIMIT_BUY_TOKEN", "LIMIT_SELL_TOKEN", "Gradient", "KeyPaths", "AnimationRes", "lib-order-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class OrderTypeEducation {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OrderTypeEducation[] $VALUES;
    public static final OrderTypeEducation LIMIT_BUY;
    public static final OrderTypeEducation LIMIT_BUY_CRYPTO;
    public static final OrderTypeEducation LIMIT_BUY_TOKEN;
    public static final OrderTypeEducation LIMIT_LONG_PERPETUAL;
    public static final OrderTypeEducation LIMIT_SELL;
    public static final OrderTypeEducation LIMIT_SELL_CRYPTO;
    public static final OrderTypeEducation LIMIT_SELL_TOKEN;
    public static final OrderTypeEducation LIMIT_SHORT_PERPETUAL;
    public static final OrderTypeEducation MARKET_BUY;
    public static final OrderTypeEducation MARKET_SELL;
    public static final OrderTypeEducation RECURRING_BUY;
    public static final OrderTypeEducation STOP_BUY;
    public static final OrderTypeEducation STOP_BUY_CRYPTO;
    public static final OrderTypeEducation STOP_LIMIT_BUY;
    public static final OrderTypeEducation STOP_LIMIT_BUY_CRYPTO;
    public static final OrderTypeEducation STOP_LIMIT_SELL;
    public static final OrderTypeEducation STOP_LIMIT_SELL_CRYPTO;
    public static final OrderTypeEducation STOP_SELL;
    public static final OrderTypeEducation STOP_SELL_CRYPTO;
    public static final OrderTypeEducation TRAILING_STOP_BUY;
    public static final OrderTypeEducation TRAILING_STOP_SELL;
    private final List<Tuples2<String, Integer>> animationCopy;
    private final AnimationRes animationRes;
    private final String dimensionRatio;
    private final Integer disclaimerAlertMessageRes;
    private final Integer disclaimerAlertTitleRes;
    private final Integer disclaimerRes;
    private final KeyPaths keyPaths;
    private final int promptRes;
    private final String repeatMarker;
    private final int titleRes;

    private static final /* synthetic */ OrderTypeEducation[] $values() {
        return new OrderTypeEducation[]{MARKET_BUY, MARKET_SELL, LIMIT_BUY, LIMIT_SELL, STOP_BUY, STOP_SELL, STOP_LIMIT_BUY, STOP_LIMIT_SELL, TRAILING_STOP_BUY, TRAILING_STOP_SELL, RECURRING_BUY, LIMIT_BUY_CRYPTO, LIMIT_SELL_CRYPTO, STOP_BUY_CRYPTO, STOP_SELL_CRYPTO, STOP_LIMIT_BUY_CRYPTO, STOP_LIMIT_SELL_CRYPTO, LIMIT_LONG_PERPETUAL, LIMIT_SHORT_PERPETUAL, LIMIT_BUY_TOKEN, LIMIT_SELL_TOKEN};
    }

    public static EnumEntries<OrderTypeEducation> getEntries() {
        return $ENTRIES;
    }

    private OrderTypeEducation(String str, int i, int i2, int i3, AnimationRes animationRes, String str2, List list, KeyPaths keyPaths, String str3, Integer num, Integer num2, Integer num3) {
        this.titleRes = i2;
        this.promptRes = i3;
        this.animationRes = animationRes;
        this.repeatMarker = str2;
        this.animationCopy = list;
        this.keyPaths = keyPaths;
        this.dimensionRatio = str3;
        this.disclaimerRes = num;
        this.disclaimerAlertTitleRes = num2;
        this.disclaimerAlertMessageRes = num3;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    public final int getPromptRes() {
        return this.promptRes;
    }

    public final AnimationRes getAnimationRes() {
        return this.animationRes;
    }

    public final String getRepeatMarker() {
        return this.repeatMarker;
    }

    public final List<Tuples2<String, Integer>> getAnimationCopy() {
        return this.animationCopy;
    }

    /* synthetic */ OrderTypeEducation(String str, int i, int i2, int i3, AnimationRes animationRes, String str2, List list, KeyPaths keyPaths, String str3, Integer num, Integer num2, Integer num3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, i3, animationRes, (i4 & 8) != 0 ? null : str2, list, (i4 & 32) != 0 ? new KeyPaths(null, null, null, null, null, 31, null) : keyPaths, (i4 & 64) != 0 ? "1:1" : str3, (i4 & 128) != 0 ? null : num, (i4 & 256) != 0 ? null : num2, (i4 & 512) != 0 ? null : num3);
    }

    public final KeyPaths getKeyPaths() {
        return this.keyPaths;
    }

    public final String getDimensionRatio() {
        return this.dimensionRatio;
    }

    public final Integer getDisclaimerRes() {
        return this.disclaimerRes;
    }

    public final Integer getDisclaimerAlertTitleRes() {
        return this.disclaimerAlertTitleRes;
    }

    public final Integer getDisclaimerAlertMessageRes() {
        return this.disclaimerAlertMessageRes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String str = "MARKET_BUY";
        int i = 0;
        String str2 = null;
        List list = null;
        String str3 = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        MARKET_BUY = new OrderTypeEducation(str, i, C38811R.string.order_type_market_title, C38811R.string.order_type_education_market_buy_prompt, new AnimationRes.SingleRes(C38811R.raw.lottie_market_buy), str2, list, new KeyPaths(CollectionsKt.listOf(new KeyPath("Market Order", "**")), CollectionsKt.listOf((Object[]) new KeyPath[]{new KeyPath("end dot Outlines", "**"), new KeyPath("line Outlines", "**"), new KeyPath("Stock Price", "**")}), null, null, null, 28, null), str3, num, num2, num3, 968, null);
        String str4 = "MARKET_SELL";
        int i2 = 1;
        String str5 = null;
        List list2 = null;
        String str6 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        MARKET_SELL = new OrderTypeEducation(str4, i2, C38811R.string.order_type_market_title, C38811R.string.order_type_education_market_sell_prompt, new AnimationRes.SingleRes(C38811R.raw.lottie_market_sell), str5, list2, new KeyPaths(CollectionsKt.listOf(new KeyPath("Market Order", "**")), CollectionsKt.listOf((Object[]) new KeyPath[]{new KeyPath("end dot Outlines", "**"), new KeyPath("line Outlines", "**"), new KeyPath("Stock Price", "**")}), null, null, 0 == true ? 1 : 0, 28, 0 == true ? 1 : 0), str6, num4, num5, num6, 968, null);
        String str7 = "LIMIT_BUY";
        int i3 = 2;
        String str8 = "Pulse (start)";
        List list3 = null;
        Integer num7 = null;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        LIMIT_BUY = new OrderTypeEducation(str7, i3, C38811R.string.order_type_limit_title, C38811R.string.order_type_education_limit_buy_prompt, new AnimationRes.SingleRes(C38811R.raw.lottie_limit_buy), str8, list3, new KeyPaths(CollectionsKt.listOf((Object[]) new KeyPath[]{new KeyPath("Limit Price", "**"), new KeyPath("dot black Outlines", "**"), new KeyPath("arrow Outlines", "**"), new KeyPath("dotted black Outlines", "**")}), CollectionsKt.listOf((Object[]) new KeyPath[]{new KeyPath("dotted green Outlines", "**"), new KeyPath("line Outlines", "**"), new KeyPath("Stock Price", "**")}), null, null, new Gradient(1.0f, CollectionsKt.listOf(new KeyPath("gradient Outlines", "**"))), 12, null), objArr, objArr2, num6, num7, 960, null);
        Object[] objArr3 = 0 == true ? 1 : 0;
        String str9 = "LIMIT_SELL";
        int i4 = 3;
        String str10 = "Pulse (start)";
        List list4 = null;
        Integer num8 = null;
        Integer num9 = null;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        LIMIT_SELL = new OrderTypeEducation(str9, i4, C38811R.string.order_type_limit_title, C38811R.string.order_type_education_limit_sell_prompt, new AnimationRes.SingleRes(C38811R.raw.lottie_limit_sell), str10, list4, new KeyPaths(CollectionsKt.listOf((Object[]) new KeyPath[]{new KeyPath("Limit Price", "**"), new KeyPath("black ellipse Outlines", "**"), new KeyPath("arrow Outlines", "**"), new KeyPath("dotted black Outlines", "**")}), CollectionsKt.listOf((Object[]) new KeyPath[]{new KeyPath("dotted green Outlines", "**"), new KeyPath("line Outlines", "**"), new KeyPath("Stock Price", "**")}), null, objArr3, new Gradient(1.0f, CollectionsKt.listOf(new KeyPath("gradient Outlines", "**"))), 12, null), objArr4, num8, num9, objArr5, 960, null);
        Object[] objArr6 = 0 == true ? 1 : 0;
        String str11 = "STOP_BUY";
        int i5 = 4;
        String str12 = null;
        Integer num10 = null;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        STOP_BUY = new OrderTypeEducation(str11, i5, C38811R.string.order_type_stop_title, C38811R.string.order_type_education_stop_buy_prompt_collaring_member, new AnimationRes.SingleRes(C38811R.raw.lottie_stop_buy), objArr8, CollectionsKt.listOf((Object[]) new Tuples2[]{Tuples4.m3642to("Market\rOrder", Integer.valueOf(C38811R.string.order_type_education_animation_label_market_order)), Tuples4.m3642to("Stop Price", Integer.valueOf(C38811R.string.order_type_education_animation_label_stop_price))}), new KeyPaths(CollectionsKt.listOf((Object[]) new KeyPath[]{new KeyPath("Market Order", "**"), new KeyPath("Stop Price", "**"), new KeyPath("dotted black Outlines", "**"), new KeyPath("arrow Outlines", "**")}), CollectionsKt.listOf((Object[]) new KeyPath[]{new KeyPath("dotted green Outlines", "**"), new KeyPath("green dot Outlines", "**"), new KeyPath("line Outlines", "**"), new KeyPath("Stock Price", "**")}), objArr6, null, new Gradient(1.0f, CollectionsKt.listOf(new KeyPath("gradient Outlines", "**"))), 12, null), str12, num10, objArr7, objArr9, 968, null);
        Object[] objArr10 = 0 == true ? 1 : 0;
        String str13 = "STOP_SELL";
        int i6 = 5;
        String str14 = null;
        String str15 = null;
        Integer num11 = null;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        STOP_SELL = new OrderTypeEducation(str13, i6, C38811R.string.order_type_stop_title, C38811R.string.order_type_education_stop_sell_prompt_collaring_member, new AnimationRes.SingleRes(C38811R.raw.lottie_stop_sell), str14, CollectionsKt.listOf((Object[]) new Tuples2[]{Tuples4.m3642to("Market\rOrder", Integer.valueOf(C38811R.string.order_type_education_animation_label_market_order)), Tuples4.m3642to("Stop Price", Integer.valueOf(C38811R.string.order_type_education_animation_label_stop_price))}), new KeyPaths(CollectionsKt.listOf((Object[]) new KeyPath[]{new KeyPath("Market Order", "**"), new KeyPath("Stop Price", "**"), new KeyPath("dotted black Outlines", "**"), new KeyPath("arrow Outlines", "**")}), CollectionsKt.listOf((Object[]) new KeyPath[]{new KeyPath("dotted green Outlines", "**"), new KeyPath("green dot Outlines", "**"), new KeyPath("green ellipse Outlines", "**"), new KeyPath("line Outlines", "**"), new KeyPath("Stock Price", "**")}), objArr10, null, new Gradient(1.0f, CollectionsKt.listOf(new KeyPath("gradient Outlines", "**"))), 12, null), str15, num11, objArr11, objArr12, 968, null);
        String str16 = "STOP_LIMIT_BUY";
        int i7 = 6;
        String str17 = null;
        List list5 = null;
        Integer num12 = null;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        Object[] objArr15 = 0 == true ? 1 : 0;
        STOP_LIMIT_BUY = new OrderTypeEducation(str16, i7, C38811R.string.order_type_stop_limit_title, C38811R.string.order_type_education_stop_limit_buy_prompt, new AnimationRes.SingleRes(C38811R.raw.lottie_stop_limit_buy), str17, list5, new KeyPaths(CollectionsKt.listOf((Object[]) new KeyPath[]{new KeyPath("GREEN_DOT", "Group 1", "Stroke 1"), new KeyPath("Btm_BlackDot 2", "**"), new KeyPath("R_Dotted_Line 2", "**"), new KeyPath("Black_Left_Dot 2", "**"), new KeyPath("BlackThinLine 2", "**"), new KeyPath("Black_Left_Dot", "**"), new KeyPath("BlackThinLine", "**"), new KeyPath("Limitprice_TEXT", "**"), new KeyPath("Stopprice_Text", "**")}), CollectionsKt.listOf((Object[]) new KeyPath[]{new KeyPath("GREEN_DOT", "Group 1", "Fill 1"), new KeyPath("GREEN_Thick_Line 2", "**"), new KeyPath("GreenLine", "**"), new KeyPath("Green_SPACE 2", "**"), new KeyPath("Stock price Outlines", "**")}), null, null, null, 28, null), objArr14, objArr15, num12, objArr13, 968, null);
        String str18 = "STOP_LIMIT_SELL";
        int i8 = 7;
        String str19 = null;
        List list6 = null;
        Integer num13 = null;
        Object[] objArr16 = 0 == true ? 1 : 0;
        Object[] objArr17 = 0 == true ? 1 : 0;
        Object[] objArr18 = 0 == true ? 1 : 0;
        STOP_LIMIT_SELL = new OrderTypeEducation(str18, i8, C38811R.string.order_type_stop_limit_title, C38811R.string.order_type_education_stop_limit_sell_prompt, new AnimationRes.SingleRes(C38811R.raw.lottie_stop_limit_sell), str19, list6, new KeyPaths(CollectionsKt.listOf((Object[]) new KeyPath[]{new KeyPath("GREEN_DOT", "Group 1", "Stroke 1"), new KeyPath("Btm_BlackDot 2", "**"), new KeyPath("R_Dotted_Line 2", "**"), new KeyPath("Black_Left_Dot 2", "**"), new KeyPath("BlackThinLine 2", "**"), new KeyPath("Black_Left_Dot", "**"), new KeyPath("BlackThinLine", "**"), new KeyPath("Limitprice_TEXT", "**"), new KeyPath("Stopprice_Text", "**")}), CollectionsKt.listOf((Object[]) new KeyPath[]{new KeyPath("GREEN_DOT", "Group 1", "Fill 1"), new KeyPath("GREEN_Thick_Line 2", "**"), new KeyPath("GreenLine", "**"), new KeyPath("Green_SPACE 2", "**"), new KeyPath("Stock price Outlines", "**")}), null, null, null, 28, null), objArr17, objArr18, num13, objArr16, 968, null);
        String str20 = "TRAILING_STOP_BUY";
        int i9 = 8;
        String str21 = null;
        Integer num14 = null;
        Object[] objArr19 = 0 == true ? 1 : 0;
        Object[] objArr20 = 0 == true ? 1 : 0;
        Object[] objArr21 = 0 == true ? 1 : 0;
        TRAILING_STOP_BUY = new OrderTypeEducation(str20, i9, C38811R.string.order_type_trailing_stop_title, C38811R.string.order_type_education_trailing_stop_buy_prompt_collaring_member, new AnimationRes.SingleRes(C38811R.raw.lottie_trailing_stop_buy), objArr19, CollectionsKt.listOf((Object[]) new Tuples2[]{Tuples4.m3642to("Stock Price", Integer.valueOf(C38811R.string.order_type_education_animation_label_stock_price)), Tuples4.m3642to("Market\rOrder", Integer.valueOf(C38811R.string.order_type_education_animation_label_market_order)), Tuples4.m3642to("Trailing \rStop Price", Integer.valueOf(C38811R.string.order_type_education_animation_label_trailing_stop_price))}), new KeyPaths(CollectionsKt.listOf((Object[]) new KeyPath[]{new KeyPath("Market Order", "**"), new KeyPath("Trailing Stop Price", "**"), new KeyPath("black1 Outlines", "**"), new KeyPath("black2 Outlines", "**"), new KeyPath("black3 Outlines", "**"), new KeyPath("black4 Outlines", "**"), new KeyPath("dotted black Outlines", "**"), new KeyPath("arrow Outlines", "**")}), CollectionsKt.listOf((Object[]) new KeyPath[]{new KeyPath("dotted green Outlines", "**"), new KeyPath("end dot Outlines", "**"), new KeyPath("green_0", "**"), new KeyPath("green1 Outlines", "**"), new KeyPath("green2 Outlines", "**"), new KeyPath("green3 Outlines", "**"), new KeyPath("green4 Outlines", "**"), new KeyPath("line 1 Outlines", "**"), new KeyPath("line 2 Outlines", "**"), new KeyPath("Stock Price", "**")}), null, null, null, 28, null), str21, num14, objArr20, objArr21, 968, null);
        String str22 = "TRAILING_STOP_SELL";
        int i10 = 9;
        String str23 = null;
        String str24 = null;
        Integer num15 = null;
        Object[] objArr22 = 0 == true ? 1 : 0;
        Object[] objArr23 = 0 == true ? 1 : 0;
        TRAILING_STOP_SELL = new OrderTypeEducation(str22, i10, C38811R.string.order_type_trailing_stop_title, C38811R.string.order_type_education_trailing_stop_sell_prompt_collaring_member, new AnimationRes.SingleRes(C38811R.raw.lottie_trailing_stop_sell), str23, CollectionsKt.listOf((Object[]) new Tuples2[]{Tuples4.m3642to("Stock Price", Integer.valueOf(C38811R.string.order_type_education_animation_label_stock_price)), Tuples4.m3642to("Market\rOrder", Integer.valueOf(C38811R.string.order_type_education_animation_label_market_order)), Tuples4.m3642to("Trailing \rStop Price", Integer.valueOf(C38811R.string.order_type_education_animation_label_trailing_stop_price))}), new KeyPaths(CollectionsKt.listOf((Object[]) new KeyPath[]{new KeyPath("Market Order", "**"), new KeyPath("Trailing Stop Price", "**"), new KeyPath("black1 Outlines", "**"), new KeyPath("black2 Outlines", "**"), new KeyPath("black3 Outlines", "**"), new KeyPath("black4 Outlines", "**"), new KeyPath("dotted black Outlines", "**"), new KeyPath("arrow Outlines", "**")}), CollectionsKt.listOf((Object[]) new KeyPath[]{new KeyPath("dotted green Outlines", "**"), new KeyPath("end dot Outlines", "**"), new KeyPath("green_0", "**"), new KeyPath("green1 Outlines", "**"), new KeyPath("green2 Outlines", "**"), new KeyPath("green3 Outlines", "**"), new KeyPath("green4 Outlines", "**"), new KeyPath("line 1 Outlines", "**"), new KeyPath("line 2 Outlines", "**"), new KeyPath("Stock Price", "**")}), null, null, null, 28, null), str24, num15, objArr22, objArr23, 968, null);
        RECURRING_BUY = new OrderTypeEducation("RECURRING_BUY", 10, C38811R.string.order_type_education_recurring_buy_title, C38811R.string.order_type_education_recurring_buy_prompt, new AnimationRes.SingleRes(C38811R.raw.lottie_recurring_buy), "Pulse(start)", CollectionsKt.emptyList(), new KeyPaths(CollectionsKt.listOf((Object[]) new KeyPath[]{new KeyPath("Cash Invested in S&P 500 Outlines", "**"), new KeyPath("Cash Outlines", "**"), new KeyPath("$[???] counter", "**"), new KeyPath("Black Line Outlines", "**"), new KeyPath("Black Dot Outlines", "**"), new KeyPath("Black Dotted Outlines", "**"), new KeyPath("Black Dotted Base Outlines", "**"), new KeyPath("$10/month Outlines", "**"), new KeyPath("End Date Outlines", "**"), new KeyPath("Start Date Outlines", "**")}), CollectionsKt.listOf((Object[]) new KeyPath[]{new KeyPath("[$6014.56 Counter]", "**"), new KeyPath("Green Line Outlines", "**"), new KeyPath("Green Dotted Outlines", "**"), new KeyPath("Green Dot Outlines", "**")}), null, null, new Gradient(0.3f, CollectionsKt.listOf(new KeyPath("Gradient/Recurring_Updated Outlines", "**"))), 12, null), "331:260", Integer.valueOf(C38811R.string.order_type_education_recurring_disclaimer_text), Integer.valueOf(C38811R.string.order_type_education_recurring_disclaimer_alert_title), Integer.valueOf(C38811R.string.order_type_education_recurring_disclaimer_alert_description));
        DefaultConstructorMarker defaultConstructorMarker = null;
        String str25 = "LIMIT_BUY_CRYPTO";
        int i11 = 11;
        String str26 = "Pulse (start)";
        String str27 = null;
        Integer num16 = null;
        Object[] objArr24 = 0 == true ? 1 : 0;
        Object[] objArr25 = 0 == true ? 1 : 0;
        LIMIT_BUY_CRYPTO = new OrderTypeEducation(str25, i11, C38811R.string.order_type_limit_title, C38811R.string.gated_crypto_order_type_education_limit_buy_prompt_crypto, new AnimationRes.SingleRes(C38811R.raw.lottie_limit_buy), str26, CollectionsKt.listOf((Object[]) new Tuples2[]{Tuples4.m3642to("Limit Price", Integer.valueOf(C38811R.string.gated_crypto_order_type_education_animation_label_limit_price)), Tuples4.m3642to("Stock Price", Integer.valueOf(C38811R.string.gated_crypto_order_type_education_animation_label_crypto_price))}), new KeyPaths(CollectionsKt.listOf((Object[]) new KeyPath[]{new KeyPath("Limit Price", "**"), new KeyPath("dot black Outlines", "**"), new KeyPath("arrow Outlines", "**"), new KeyPath("dotted black Outlines", "**"), new KeyPath("dotted green Outlines", "**"), new KeyPath("line Outlines", "**"), new KeyPath("Stock Price", "**")}), null, null, new Gradient(1.0f, CollectionsKt.listOf(new KeyPath("gradient Outlines", "**"))), null, 22, defaultConstructorMarker), str27, objArr24, objArr25, num16, 960, null);
        String str28 = "LIMIT_SELL_CRYPTO";
        int i12 = 12;
        String str29 = "Pulse (start)";
        Integer num17 = null;
        Object[] objArr26 = 0 == true ? 1 : 0;
        Object[] objArr27 = 0 == true ? 1 : 0;
        Object[] objArr28 = 0 == true ? 1 : 0;
        LIMIT_SELL_CRYPTO = new OrderTypeEducation(str28, i12, C38811R.string.order_type_limit_title, C38811R.string.gated_crypto_order_type_education_limit_sell_prompt_crypto, new AnimationRes.SingleRes(C38811R.raw.lottie_limit_sell), str29, CollectionsKt.listOf((Object[]) new Tuples2[]{Tuples4.m3642to("Limit Price", Integer.valueOf(C38811R.string.gated_crypto_order_type_education_animation_label_limit_price)), Tuples4.m3642to("Stock Price", Integer.valueOf(C38811R.string.gated_crypto_order_type_education_animation_label_crypto_price))}), new KeyPaths(CollectionsKt.listOf((Object[]) new KeyPath[]{new KeyPath("Limit Price", "**"), new KeyPath("black ellipse Outlines", "**"), new KeyPath("arrow Outlines", "**"), new KeyPath("dotted black Outlines", "**"), new KeyPath("dotted green Outlines", "**"), new KeyPath("line Outlines", "**"), new KeyPath("Stock Price", "**")}), null, null, new Gradient(1.0f, CollectionsKt.listOf(new KeyPath("gradient Outlines", "**"))), null, 22, null), objArr26, objArr27, objArr28, num17, 960, defaultConstructorMarker);
        String str30 = "STOP_BUY_CRYPTO";
        int i13 = 13;
        String str31 = null;
        Integer num18 = null;
        Object[] objArr29 = 0 == true ? 1 : 0;
        Object[] objArr30 = 0 == true ? 1 : 0;
        STOP_BUY_CRYPTO = new OrderTypeEducation(str30, i13, C38811R.string.order_type_stop_title, C38811R.string.order_type_education_stop_buy_prompt_collaring_member, new AnimationRes.SingleRes(C38811R.raw.lottie_crypto_stop_loss_buy), str31, CollectionsKt.listOf((Object[]) new Tuples2[]{Tuples4.m3642to("Stop Price", Integer.valueOf(C38811R.string.gated_crypto_order_type_education_animation_label_stop_price)), Tuples4.m3642to("Crypto Price", Integer.valueOf(C38811R.string.gated_crypto_order_type_education_animation_label_crypto_price)), Tuples4.m3642to("Market\rOrder", Integer.valueOf(C38811R.string.gated_crypto_order_type_education_animation_label_market_order))}), new KeyPaths(CollectionsKt.listOf((Object[]) new KeyPath[]{new KeyPath("Market Order", "**"), new KeyPath("Stop Price", "**"), new KeyPath("Crypto Price", "**"), new KeyPath("dotted black Outlines", "**"), new KeyPath("arrow Outlines", "**"), new KeyPath("dotted green Outlines", "**"), new KeyPath("green dot Outlines", "**"), new KeyPath("line Outlines", "**")}), CollectionsKt.emptyList(), null, null, new Gradient(1.0f, CollectionsKt.listOf((Object[]) new KeyPath[]{new KeyPath("gradient Outlines", "**"), new KeyPath("Gradient Fill 1", "**")})), 12, null), objArr29, objArr30, num17, num18, 968, null);
        String str32 = "STOP_SELL_CRYPTO";
        int i14 = 14;
        String str33 = null;
        Integer num19 = null;
        Object[] objArr31 = 0 == true ? 1 : 0;
        STOP_SELL_CRYPTO = new OrderTypeEducation(str32, i14, C38811R.string.order_type_stop_title, C38811R.string.order_type_education_stop_sell_prompt_collaring_member, new AnimationRes.SingleRes(C38811R.raw.lottie_crypto_stop_loss_sell), str33, CollectionsKt.listOf((Object[]) new Tuples2[]{Tuples4.m3642to("Stop Price", Integer.valueOf(C38811R.string.gated_crypto_order_type_education_animation_label_stop_price)), Tuples4.m3642to("Crypto Price", Integer.valueOf(C38811R.string.gated_crypto_order_type_education_animation_label_crypto_price)), Tuples4.m3642to("Market\rOrder", Integer.valueOf(C38811R.string.gated_crypto_order_type_education_animation_label_market_order))}), new KeyPaths(CollectionsKt.listOf((Object[]) new KeyPath[]{new KeyPath("Market Order", "**"), new KeyPath("Stop Price", "**"), new KeyPath("Crypto Price", "**"), new KeyPath("dotted black Outlines", "**"), new KeyPath("arrow Outlines", "**"), new KeyPath("dotted green Outlines", "**"), new KeyPath("green dot Outlines", "**"), new KeyPath("green ellipse Outlines", "**"), new KeyPath("line Outlines", "**")}), CollectionsKt.emptyList(), null, null, new Gradient(1.0f, CollectionsKt.listOf((Object[]) new KeyPath[]{new KeyPath("gradient Outlines", "**"), new KeyPath("Gradient Fill 1", "**")})), 12, null), objArr31, num17, num18, num19, 968, null);
        String str34 = "STOP_LIMIT_BUY_CRYPTO";
        int i15 = 15;
        String str35 = null;
        Integer num20 = null;
        Object[] objArr32 = 0 == true ? 1 : 0;
        Object[] objArr33 = 0 == true ? 1 : 0;
        Object[] objArr34 = 0 == true ? 1 : 0;
        STOP_LIMIT_BUY_CRYPTO = new OrderTypeEducation(str34, i15, C38811R.string.order_type_stop_limit_title, C38811R.string.order_type_education_stop_limit_buy_prompt_crypto, new AnimationRes.SingleRes(C38811R.raw.lottie_crypto_stop_limit_buy), objArr32, CollectionsKt.listOf((Object[]) new Tuples2[]{Tuples4.m3642to("Stop Price", Integer.valueOf(C38811R.string.gated_crypto_order_type_education_animation_label_stop_price)), Tuples4.m3642to("Limit Price", Integer.valueOf(C38811R.string.gated_crypto_order_type_education_animation_label_limit_price)), Tuples4.m3642to("Crypto Price", Integer.valueOf(C38811R.string.gated_crypto_order_type_education_animation_label_crypto_price))}), new KeyPaths(CollectionsKt.listOf((Object[]) new KeyPath[]{new KeyPath("Limit Price", "**"), new KeyPath("Stop Price", "**"), new KeyPath("Crypto Price", "**"), new KeyPath("Dotted 2 Outlines", "**"), new KeyPath("Dotted 1 Outlines", "**"), new KeyPath("Green dotted Outlines", "**"), new KeyPath("2 Outlines", "**"), new KeyPath("1 Outlines", "**"), new KeyPath("Arrow 1 Outlines", "**"), new KeyPath("Gradient Outlines 2", "**"), new KeyPath("Filled ellipse Outlines", "**")}), CollectionsKt.emptyList(), null, null, null, 28, null), str35, num20, objArr33, objArr34, 968, null);
        String str36 = "STOP_LIMIT_SELL_CRYPTO";
        int i16 = 16;
        String str37 = null;
        String str38 = null;
        Integer num21 = null;
        Object[] objArr35 = 0 == true ? 1 : 0;
        Object[] objArr36 = 0 == true ? 1 : 0;
        STOP_LIMIT_SELL_CRYPTO = new OrderTypeEducation(str36, i16, C38811R.string.order_type_stop_limit_title, C38811R.string.order_type_education_stop_limit_sell_prompt_crypto, new AnimationRes.SingleRes(C38811R.raw.lottie_crypto_stop_limit_sell), str37, CollectionsKt.listOf((Object[]) new Tuples2[]{Tuples4.m3642to("Stop Price", Integer.valueOf(C38811R.string.gated_crypto_order_type_education_animation_label_stop_price)), Tuples4.m3642to("Limit Price", Integer.valueOf(C38811R.string.gated_crypto_order_type_education_animation_label_limit_price)), Tuples4.m3642to("Crypto Price", Integer.valueOf(C38811R.string.gated_crypto_order_type_education_animation_label_crypto_price))}), new KeyPaths(CollectionsKt.listOf((Object[]) new KeyPath[]{new KeyPath("Limit Price", "**"), new KeyPath("Stop Price", "**"), new KeyPath("Crypto Price", "**"), new KeyPath("Dotted 2 Outlines", "**"), new KeyPath("Dotted 1 Outlines", "**"), new KeyPath("Green dotted Outlines", "**"), new KeyPath("2 Outlines", "**"), new KeyPath("1 Outlines", "**"), new KeyPath("Arrow 1 Outlines", "**"), new KeyPath("Gradient Outlines 2", "**"), new KeyPath("Filled ellipse Outlines", "**")}), CollectionsKt.emptyList(), null, null, null, 28, null), str38, num21, objArr35, objArr36, 968, null);
        String str39 = "LIMIT_LONG_PERPETUAL";
        int i17 = 17;
        String str40 = "Pulse (start)";
        String str41 = null;
        Integer num22 = null;
        Object[] objArr37 = 0 == true ? 1 : 0;
        Object[] objArr38 = 0 == true ? 1 : 0;
        LIMIT_LONG_PERPETUAL = new OrderTypeEducation(str39, i17, C38811R.string.order_type_limit_title, C38811R.string.gated_crypto_order_type_education_limit_long_prompt_perpetual, new AnimationRes.SingleRes(C38811R.raw.lottie_limit_buy), str40, CollectionsKt.listOf((Object[]) new Tuples2[]{Tuples4.m3642to("Limit Price", Integer.valueOf(C38811R.string.gated_crypto_order_type_education_animation_label_limit_price)), Tuples4.m3642to("Stock Price", Integer.valueOf(C38811R.string.gated_crypto_order_type_education_animation_label_crypto_price))}), new KeyPaths(CollectionsKt.listOf((Object[]) new KeyPath[]{new KeyPath("Limit Price", "**"), new KeyPath("dot black Outlines", "**"), new KeyPath("arrow Outlines", "**"), new KeyPath("dotted black Outlines", "**"), new KeyPath("dotted green Outlines", "**"), new KeyPath("line Outlines", "**"), new KeyPath("Stock Price", "**")}), null, null, new Gradient(1.0f, CollectionsKt.listOf(new KeyPath("gradient Outlines", "**"))), null, 22, null), str41, objArr37, objArr38, num22, 960, null);
        String str42 = "LIMIT_SHORT_PERPETUAL";
        int i18 = 18;
        String str43 = "Pulse (start)";
        String str44 = null;
        Integer num23 = null;
        Object[] objArr39 = 0 == true ? 1 : 0;
        Object[] objArr40 = 0 == true ? 1 : 0;
        LIMIT_SHORT_PERPETUAL = new OrderTypeEducation(str42, i18, C38811R.string.order_type_limit_title, C38811R.string.gated_crypto_order_type_education_limit_short_prompt_perpetual, new AnimationRes.SingleRes(C38811R.raw.lottie_limit_sell), str43, CollectionsKt.listOf((Object[]) new Tuples2[]{Tuples4.m3642to("Limit Price", Integer.valueOf(C38811R.string.gated_crypto_order_type_education_animation_label_limit_price)), Tuples4.m3642to("Stock Price", Integer.valueOf(C38811R.string.gated_crypto_order_type_education_animation_label_crypto_price))}), new KeyPaths(CollectionsKt.listOf((Object[]) new KeyPath[]{new KeyPath("Limit Price", "**"), new KeyPath("black ellipse Outlines", "**"), new KeyPath("arrow Outlines", "**"), new KeyPath("dotted black Outlines", "**"), new KeyPath("dotted green Outlines", "**"), new KeyPath("line Outlines", "**"), new KeyPath("Stock Price", "**")}), null, null, new Gradient(1.0f, CollectionsKt.listOf(new KeyPath("gradient Outlines", "**"))), null, 22, null), str44, objArr39, objArr40, num23, 960, null);
        String str45 = "LIMIT_BUY_TOKEN";
        int i19 = 19;
        String str46 = "Pulse (start)";
        String str47 = null;
        Integer num24 = null;
        Object[] objArr41 = 0 == true ? 1 : 0;
        Object[] objArr42 = 0 == true ? 1 : 0;
        LIMIT_BUY_TOKEN = new OrderTypeEducation(str45, i19, C38811R.string.order_type_limit_title, C38811R.string.tokenized_order_type_education_limit_buy_prompt, new AnimationRes.SingleRes(C38811R.raw.lottie_limit_buy), str46, CollectionsKt.listOf((Object[]) new Tuples2[]{Tuples4.m3642to("Limit Price", Integer.valueOf(C38811R.string.gated_crypto_order_type_education_animation_label_limit_price)), Tuples4.m3642to("Stock Price", Integer.valueOf(C38811R.string.tokenized_order_type_education_animation_label_token_price))}), new KeyPaths(CollectionsKt.listOf((Object[]) new KeyPath[]{new KeyPath("Limit Price", "**"), new KeyPath("dot black Outlines", "**"), new KeyPath("arrow Outlines", "**"), new KeyPath("dotted black Outlines", "**"), new KeyPath("dotted green Outlines", "**"), new KeyPath("line Outlines", "**"), new KeyPath("Stock Price", "**")}), null, null, new Gradient(1.0f, CollectionsKt.listOf(new KeyPath("gradient Outlines", "**"))), null, 22, null), str47, objArr41, objArr42, num24, 960, null);
        String str48 = "LIMIT_SELL_TOKEN";
        int i20 = 20;
        String str49 = "Pulse (start)";
        String str50 = null;
        Integer num25 = null;
        Object[] objArr43 = 0 == true ? 1 : 0;
        Object[] objArr44 = 0 == true ? 1 : 0;
        LIMIT_SELL_TOKEN = new OrderTypeEducation(str48, i20, C38811R.string.order_type_limit_title, C38811R.string.tokenized_order_type_education_limit_sell_prompt, new AnimationRes.SingleRes(C38811R.raw.lottie_limit_sell), str49, CollectionsKt.listOf((Object[]) new Tuples2[]{Tuples4.m3642to("Limit Price", Integer.valueOf(C38811R.string.gated_crypto_order_type_education_animation_label_limit_price)), Tuples4.m3642to("Stock Price", Integer.valueOf(C38811R.string.tokenized_order_type_education_animation_label_token_price))}), new KeyPaths(CollectionsKt.listOf((Object[]) new KeyPath[]{new KeyPath("Limit Price", "**"), new KeyPath("black ellipse Outlines", "**"), new KeyPath("arrow Outlines", "**"), new KeyPath("dotted black Outlines", "**"), new KeyPath("dotted green Outlines", "**"), new KeyPath("line Outlines", "**"), new KeyPath("Stock Price", "**")}), null, null, new Gradient(1.0f, CollectionsKt.listOf(new KeyPath("gradient Outlines", "**"))), null, 22, null), str50, objArr43, objArr44, num25, 960, null);
        OrderTypeEducation[] orderTypeEducationArr$values = $values();
        $VALUES = orderTypeEducationArr$values;
        $ENTRIES = EnumEntries2.enumEntries(orderTypeEducationArr$values);
    }

    /* compiled from: OrderTypeEducation.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/education/order/OrderTypeEducation$Gradient;", "", "alpha", "", "paths", "", "Lcom/airbnb/lottie/model/KeyPath;", "<init>", "(FLjava/util/List;)V", "getAlpha", "()F", "getPaths", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-order-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Gradient {
        public static final int $stable = 8;
        private final float alpha;
        private final List<KeyPath> paths;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Gradient copy$default(Gradient gradient, float f, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                f = gradient.alpha;
            }
            if ((i & 2) != 0) {
                list = gradient.paths;
            }
            return gradient.copy(f, list);
        }

        /* renamed from: component1, reason: from getter */
        public final float getAlpha() {
            return this.alpha;
        }

        public final List<KeyPath> component2() {
            return this.paths;
        }

        public final Gradient copy(float alpha, List<? extends KeyPath> paths) {
            Intrinsics.checkNotNullParameter(paths, "paths");
            return new Gradient(alpha, paths);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Gradient)) {
                return false;
            }
            Gradient gradient = (Gradient) other;
            return Float.compare(this.alpha, gradient.alpha) == 0 && Intrinsics.areEqual(this.paths, gradient.paths);
        }

        public int hashCode() {
            return (Float.hashCode(this.alpha) * 31) + this.paths.hashCode();
        }

        public String toString() {
            return "Gradient(alpha=" + this.alpha + ", paths=" + this.paths + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Gradient(float f, List<? extends KeyPath> paths) {
            Intrinsics.checkNotNullParameter(paths, "paths");
            this.alpha = f;
            this.paths = paths;
        }

        public final float getAlpha() {
            return this.alpha;
        }

        public final List<KeyPath> getPaths() {
            return this.paths;
        }
    }

    /* compiled from: OrderTypeEducation.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003JQ\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006 "}, m3636d2 = {"Lcom/robinhood/shared/education/order/OrderTypeEducation$KeyPaths;", "", "foregroundColor", "", "Lcom/airbnb/lottie/model/KeyPath;", "primaryColor", "primaryColorLight", "foregroundGradient", "Lcom/robinhood/shared/education/order/OrderTypeEducation$Gradient;", "primaryGradient", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/robinhood/shared/education/order/OrderTypeEducation$Gradient;Lcom/robinhood/shared/education/order/OrderTypeEducation$Gradient;)V", "getForegroundColor", "()Ljava/util/List;", "getPrimaryColor", "getPrimaryColorLight", "getForegroundGradient", "()Lcom/robinhood/shared/education/order/OrderTypeEducation$Gradient;", "getPrimaryGradient", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-order-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class KeyPaths {
        public static final int $stable = 8;
        private final List<KeyPath> foregroundColor;
        private final Gradient foregroundGradient;
        private final List<KeyPath> primaryColor;
        private final List<KeyPath> primaryColorLight;
        private final Gradient primaryGradient;

        public KeyPaths() {
            this(null, null, null, null, null, 31, null);
        }

        public static /* synthetic */ KeyPaths copy$default(KeyPaths keyPaths, List list, List list2, List list3, Gradient gradient, Gradient gradient2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = keyPaths.foregroundColor;
            }
            if ((i & 2) != 0) {
                list2 = keyPaths.primaryColor;
            }
            if ((i & 4) != 0) {
                list3 = keyPaths.primaryColorLight;
            }
            if ((i & 8) != 0) {
                gradient = keyPaths.foregroundGradient;
            }
            if ((i & 16) != 0) {
                gradient2 = keyPaths.primaryGradient;
            }
            Gradient gradient3 = gradient2;
            List list4 = list3;
            return keyPaths.copy(list, list2, list4, gradient, gradient3);
        }

        public final List<KeyPath> component1() {
            return this.foregroundColor;
        }

        public final List<KeyPath> component2() {
            return this.primaryColor;
        }

        public final List<KeyPath> component3() {
            return this.primaryColorLight;
        }

        /* renamed from: component4, reason: from getter */
        public final Gradient getForegroundGradient() {
            return this.foregroundGradient;
        }

        /* renamed from: component5, reason: from getter */
        public final Gradient getPrimaryGradient() {
            return this.primaryGradient;
        }

        public final KeyPaths copy(List<? extends KeyPath> foregroundColor, List<? extends KeyPath> primaryColor, List<? extends KeyPath> primaryColorLight, Gradient foregroundGradient, Gradient primaryGradient) {
            Intrinsics.checkNotNullParameter(foregroundColor, "foregroundColor");
            Intrinsics.checkNotNullParameter(primaryColor, "primaryColor");
            Intrinsics.checkNotNullParameter(primaryColorLight, "primaryColorLight");
            return new KeyPaths(foregroundColor, primaryColor, primaryColorLight, foregroundGradient, primaryGradient);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof KeyPaths)) {
                return false;
            }
            KeyPaths keyPaths = (KeyPaths) other;
            return Intrinsics.areEqual(this.foregroundColor, keyPaths.foregroundColor) && Intrinsics.areEqual(this.primaryColor, keyPaths.primaryColor) && Intrinsics.areEqual(this.primaryColorLight, keyPaths.primaryColorLight) && Intrinsics.areEqual(this.foregroundGradient, keyPaths.foregroundGradient) && Intrinsics.areEqual(this.primaryGradient, keyPaths.primaryGradient);
        }

        public int hashCode() {
            int iHashCode = ((((this.foregroundColor.hashCode() * 31) + this.primaryColor.hashCode()) * 31) + this.primaryColorLight.hashCode()) * 31;
            Gradient gradient = this.foregroundGradient;
            int iHashCode2 = (iHashCode + (gradient == null ? 0 : gradient.hashCode())) * 31;
            Gradient gradient2 = this.primaryGradient;
            return iHashCode2 + (gradient2 != null ? gradient2.hashCode() : 0);
        }

        public String toString() {
            return "KeyPaths(foregroundColor=" + this.foregroundColor + ", primaryColor=" + this.primaryColor + ", primaryColorLight=" + this.primaryColorLight + ", foregroundGradient=" + this.foregroundGradient + ", primaryGradient=" + this.primaryGradient + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public KeyPaths(List<? extends KeyPath> foregroundColor, List<? extends KeyPath> primaryColor, List<? extends KeyPath> primaryColorLight, Gradient gradient, Gradient gradient2) {
            Intrinsics.checkNotNullParameter(foregroundColor, "foregroundColor");
            Intrinsics.checkNotNullParameter(primaryColor, "primaryColor");
            Intrinsics.checkNotNullParameter(primaryColorLight, "primaryColorLight");
            this.foregroundColor = foregroundColor;
            this.primaryColor = primaryColor;
            this.primaryColorLight = primaryColorLight;
            this.foregroundGradient = gradient;
            this.primaryGradient = gradient2;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ KeyPaths(java.util.List r2, java.util.List r3, java.util.List r4, com.robinhood.shared.education.order.OrderTypeEducation.Gradient r5, com.robinhood.shared.education.order.OrderTypeEducation.Gradient r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
            /*
                r1 = this;
                r8 = r7 & 1
                if (r8 == 0) goto L8
                java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            L8:
                r8 = r7 & 2
                if (r8 == 0) goto L10
                java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
            L10:
                r8 = r7 & 4
                if (r8 == 0) goto L18
                java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            L18:
                r8 = r7 & 8
                r0 = 0
                if (r8 == 0) goto L1e
                r5 = r0
            L1e:
                r7 = r7 & 16
                if (r7 == 0) goto L29
                r8 = r0
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L2f
            L29:
                r8 = r6
                r7 = r5
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L2f:
                r3.<init>(r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.education.order.OrderTypeEducation.KeyPaths.<init>(java.util.List, java.util.List, java.util.List, com.robinhood.shared.education.order.OrderTypeEducation$Gradient, com.robinhood.shared.education.order.OrderTypeEducation$Gradient, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final List<KeyPath> getForegroundColor() {
            return this.foregroundColor;
        }

        public final List<KeyPath> getPrimaryColor() {
            return this.primaryColor;
        }

        public final List<KeyPath> getPrimaryColorLight() {
            return this.primaryColorLight;
        }

        public final Gradient getForegroundGradient() {
            return this.foregroundGradient;
        }

        public final Gradient getPrimaryGradient() {
            return this.primaryGradient;
        }
    }

    /* compiled from: OrderTypeEducation.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\f\rB\u0013\b\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/education/order/OrderTypeEducation$AnimationRes;", "", "primaryRes", "", "<init>", "(I)V", "getPrimaryRes", "()I", "lottieCompositionSpec", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "getLottieCompositionSpec", "(Landroidx/compose/runtime/Composer;I)Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "SingleRes", "DayNightRes", "Lcom/robinhood/shared/education/order/OrderTypeEducation$AnimationRes$DayNightRes;", "Lcom/robinhood/shared/education/order/OrderTypeEducation$AnimationRes$SingleRes;", "lib-order-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class AnimationRes {
        public static final int $stable = 0;
        private final int primaryRes;

        public /* synthetic */ AnimationRes(int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(i);
        }

        private AnimationRes(int i) {
            this.primaryRes = i;
        }

        public final int getPrimaryRes() {
            return this.primaryRes;
        }

        @JvmName
        public LottieCompositionSpec getLottieCompositionSpec(Composer composer, int i) {
            composer.startReplaceGroup(-137869919);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-137869919, i, -1, "com.robinhood.shared.education.order.OrderTypeEducation.AnimationRes.<get-lottieCompositionSpec> (OrderTypeEducation.kt:617)");
            }
            int iM9171constructorimpl = LottieCompositionSpec.RawRes.m9171constructorimpl(this.primaryRes);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return LottieCompositionSpec.RawRes.m9170boximpl(iM9171constructorimpl);
        }

        /* compiled from: OrderTypeEducation.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/education/order/OrderTypeEducation$AnimationRes$SingleRes;", "Lcom/robinhood/shared/education/order/OrderTypeEducation$AnimationRes;", "res", "", "<init>", "(I)V", "getRes", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "lib-order-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SingleRes extends AnimationRes {
            public static final int $stable = 0;
            private final int res;

            public static /* synthetic */ SingleRes copy$default(SingleRes singleRes, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = singleRes.res;
                }
                return singleRes.copy(i);
            }

            /* renamed from: component1, reason: from getter */
            public final int getRes() {
                return this.res;
            }

            public final SingleRes copy(int res) {
                return new SingleRes(res);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SingleRes) && this.res == ((SingleRes) other).res;
            }

            public int hashCode() {
                return Integer.hashCode(this.res);
            }

            public String toString() {
                return "SingleRes(res=" + this.res + ")";
            }

            public final int getRes() {
                return this.res;
            }

            public SingleRes(int i) {
                super(i, null);
                this.res = i;
            }
        }

        /* compiled from: OrderTypeEducation.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/education/order/OrderTypeEducation$AnimationRes$DayNightRes;", "Lcom/robinhood/shared/education/order/OrderTypeEducation$AnimationRes;", "dayRes", "", "nightRes", "<init>", "(II)V", "getDayRes", "()I", "getNightRes", "lottieCompositionSpec", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "getLottieCompositionSpec", "(Landroidx/compose/runtime/Composer;I)Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "lib-order-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class DayNightRes extends AnimationRes {
            public static final int $stable = 0;
            private final int dayRes;
            private final int nightRes;

            public static /* synthetic */ DayNightRes copy$default(DayNightRes dayNightRes, int i, int i2, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    i = dayNightRes.dayRes;
                }
                if ((i3 & 2) != 0) {
                    i2 = dayNightRes.nightRes;
                }
                return dayNightRes.copy(i, i2);
            }

            /* renamed from: component1, reason: from getter */
            public final int getDayRes() {
                return this.dayRes;
            }

            /* renamed from: component2, reason: from getter */
            public final int getNightRes() {
                return this.nightRes;
            }

            public final DayNightRes copy(int dayRes, int nightRes) {
                return new DayNightRes(dayRes, nightRes);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DayNightRes)) {
                    return false;
                }
                DayNightRes dayNightRes = (DayNightRes) other;
                return this.dayRes == dayNightRes.dayRes && this.nightRes == dayNightRes.nightRes;
            }

            public int hashCode() {
                return (Integer.hashCode(this.dayRes) * 31) + Integer.hashCode(this.nightRes);
            }

            public String toString() {
                return "DayNightRes(dayRes=" + this.dayRes + ", nightRes=" + this.nightRes + ")";
            }

            public final int getDayRes() {
                return this.dayRes;
            }

            public final int getNightRes() {
                return this.nightRes;
            }

            public DayNightRes(int i, int i2) {
                super(i, null);
                this.dayRes = i;
                this.nightRes = i2;
            }

            @Override // com.robinhood.shared.education.order.OrderTypeEducation.AnimationRes
            @JvmName
            public LottieCompositionSpec getLottieCompositionSpec(Composer composer, int i) {
                composer.startReplaceGroup(1019203201);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1019203201, i, -1, "com.robinhood.shared.education.order.OrderTypeEducation.AnimationRes.DayNightRes.<get-lottieCompositionSpec> (OrderTypeEducation.kt:630)");
                }
                int iM9171constructorimpl = LottieCompositionSpec.RawRes.m9171constructorimpl(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getIsDay() ? this.dayRes : this.nightRes);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return LottieCompositionSpec.RawRes.m9170boximpl(iM9171constructorimpl);
            }
        }
    }

    public static OrderTypeEducation valueOf(String str) {
        return (OrderTypeEducation) Enum.valueOf(OrderTypeEducation.class, str);
    }

    public static OrderTypeEducation[] values() {
        return (OrderTypeEducation[]) $VALUES.clone();
    }
}
