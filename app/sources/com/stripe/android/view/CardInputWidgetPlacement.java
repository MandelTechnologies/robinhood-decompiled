package com.stripe.android.view;

import com.stripe.android.view.CardInputWidget;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* compiled from: CardInputWidgetPlacement.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b1\b\u0080\b\u0018\u0000 ^2\u00020\u0001:\u0001^B§\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001d\u0010\u001bJ\u0017\u0010 \u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001f\u0010\u001bJ/\u0010(\u001a\u00020%2\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0002H\u0000¢\u0006\u0004\b&\u0010'J1\u0010-\u001a\u0004\u0018\u00010*2\u0006\u0010)\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u0018H\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00104\u001a\u00020\u00182\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105R\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u00106\u001a\u0004\b7\u00102\"\u0004\b8\u00109R\"\u0010\u0004\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u00106\u001a\u0004\b:\u00102\"\u0004\b;\u00109R\"\u0010\u0005\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u00106\u001a\u0004\b<\u00102\"\u0004\b=\u00109R\"\u0010\u0006\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u00106\u001a\u0004\b>\u00102\"\u0004\b?\u00109R\"\u0010\u0007\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u00106\u001a\u0004\b@\u00102\"\u0004\bA\u00109R\"\u0010\b\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u00106\u001a\u0004\bB\u00102\"\u0004\bC\u00109R\"\u0010\t\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u00106\u001a\u0004\bD\u00102\"\u0004\bE\u00109R\"\u0010\n\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u00106\u001a\u0004\bF\u00102\"\u0004\bG\u00109R\"\u0010\u000b\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u00106\u001a\u0004\bH\u00102\"\u0004\bI\u00109R\"\u0010\f\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u00106\u001a\u0004\bJ\u00102\"\u0004\bK\u00109R\"\u0010\r\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u00106\u001a\u0004\bL\u00102\"\u0004\bM\u00109R\"\u0010\u000e\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u00106\u001a\u0004\bN\u00102\"\u0004\bO\u00109R\"\u0010\u000f\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u00106\u001a\u0004\bP\u00102\"\u0004\bQ\u00109R\"\u0010\u0010\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u00106\u001a\u0004\bR\u00102\"\u0004\bS\u00109R\"\u0010\u0011\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u00106\u001a\u0004\bT\u00102\"\u0004\bU\u00109R\"\u0010\u0012\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u00106\u001a\u0004\bV\u00102\"\u0004\bW\u00109R\u0014\u0010Y\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u00102R\u0014\u0010[\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u00102R\u0014\u0010]\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\\\u00102¨\u0006_"}, m3636d2 = {"Lcom/stripe/android/view/CardInputWidgetPlacement;", "", "", "totalLengthInPixels", "cardWidth", "hiddenCardWidth", "peekCardWidth", "cardDateSeparation", "dateWidth", "dateCvcSeparation", "cvcWidth", "cvcPostalCodeSeparation", "postalCodeWidth", "cardTouchBufferLimit", "dateStartPosition", "dateEndTouchBufferLimit", "cvcStartPosition", "cvcEndTouchBufferLimit", "postalCodeStartPosition", "<init>", "(IIIIIIIIIIIIIIII)V", "value", "toMinimalValueIfNegative", "(I)I", "", "isFullCard", "getDateStartMargin$payments_core_release", "(Z)I", "getDateStartMargin", "getCvcStartMargin$payments_core_release", "getCvcStartMargin", "getPostalCodeStartMargin$payments_core_release", "getPostalCodeStartMargin", "isShowingFullCard", "postalCodeEnabled", "frameStart", "frameWidth", "", "updateSpacing$payments_core_release", "(ZZII)V", "updateSpacing", "touchX", "Lcom/stripe/android/view/CardInputWidget$Field;", "getFocusField$payments_core_release", "(IIZZ)Lcom/stripe/android/view/CardInputWidget$Field;", "getFocusField", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getTotalLengthInPixels$payments_core_release", "setTotalLengthInPixels$payments_core_release", "(I)V", "getCardWidth$payments_core_release", "setCardWidth$payments_core_release", "getHiddenCardWidth$payments_core_release", "setHiddenCardWidth$payments_core_release", "getPeekCardWidth$payments_core_release", "setPeekCardWidth$payments_core_release", "getCardDateSeparation$payments_core_release", "setCardDateSeparation$payments_core_release", "getDateWidth$payments_core_release", "setDateWidth$payments_core_release", "getDateCvcSeparation$payments_core_release", "setDateCvcSeparation$payments_core_release", "getCvcWidth$payments_core_release", "setCvcWidth$payments_core_release", "getCvcPostalCodeSeparation$payments_core_release", "setCvcPostalCodeSeparation$payments_core_release", "getPostalCodeWidth$payments_core_release", "setPostalCodeWidth$payments_core_release", "getCardTouchBufferLimit$payments_core_release", "setCardTouchBufferLimit$payments_core_release", "getDateStartPosition$payments_core_release", "setDateStartPosition$payments_core_release", "getDateEndTouchBufferLimit$payments_core_release", "setDateEndTouchBufferLimit$payments_core_release", "getCvcStartPosition$payments_core_release", "setCvcStartPosition$payments_core_release", "getCvcEndTouchBufferLimit$payments_core_release", "setCvcEndTouchBufferLimit$payments_core_release", "getPostalCodeStartPosition$payments_core_release", "setPostalCodeStartPosition$payments_core_release", "getCardPeekDateStartMargin", "cardPeekDateStartMargin", "getCardPeekCvcStartMargin", "cardPeekCvcStartMargin", "getCardPeekPostalCodeStartMargin", "cardPeekPostalCodeStartMargin", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class CardInputWidgetPlacement {
    private int cardDateSeparation;
    private int cardTouchBufferLimit;
    private int cardWidth;
    private int cvcEndTouchBufferLimit;
    private int cvcPostalCodeSeparation;
    private int cvcStartPosition;
    private int cvcWidth;
    private int dateCvcSeparation;
    private int dateEndTouchBufferLimit;
    private int dateStartPosition;
    private int dateWidth;
    private int hiddenCardWidth;
    private int peekCardWidth;
    private int postalCodeStartPosition;
    private int postalCodeWidth;
    private int totalLengthInPixels;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public CardInputWidgetPlacement() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
    }

    private final int toMinimalValueIfNegative(int value) {
        if (value >= 0) {
            return value;
        }
        return 10;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardInputWidgetPlacement)) {
            return false;
        }
        CardInputWidgetPlacement cardInputWidgetPlacement = (CardInputWidgetPlacement) other;
        return this.totalLengthInPixels == cardInputWidgetPlacement.totalLengthInPixels && this.cardWidth == cardInputWidgetPlacement.cardWidth && this.hiddenCardWidth == cardInputWidgetPlacement.hiddenCardWidth && this.peekCardWidth == cardInputWidgetPlacement.peekCardWidth && this.cardDateSeparation == cardInputWidgetPlacement.cardDateSeparation && this.dateWidth == cardInputWidgetPlacement.dateWidth && this.dateCvcSeparation == cardInputWidgetPlacement.dateCvcSeparation && this.cvcWidth == cardInputWidgetPlacement.cvcWidth && this.cvcPostalCodeSeparation == cardInputWidgetPlacement.cvcPostalCodeSeparation && this.postalCodeWidth == cardInputWidgetPlacement.postalCodeWidth && this.cardTouchBufferLimit == cardInputWidgetPlacement.cardTouchBufferLimit && this.dateStartPosition == cardInputWidgetPlacement.dateStartPosition && this.dateEndTouchBufferLimit == cardInputWidgetPlacement.dateEndTouchBufferLimit && this.cvcStartPosition == cardInputWidgetPlacement.cvcStartPosition && this.cvcEndTouchBufferLimit == cardInputWidgetPlacement.cvcEndTouchBufferLimit && this.postalCodeStartPosition == cardInputWidgetPlacement.postalCodeStartPosition;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((Integer.hashCode(this.totalLengthInPixels) * 31) + Integer.hashCode(this.cardWidth)) * 31) + Integer.hashCode(this.hiddenCardWidth)) * 31) + Integer.hashCode(this.peekCardWidth)) * 31) + Integer.hashCode(this.cardDateSeparation)) * 31) + Integer.hashCode(this.dateWidth)) * 31) + Integer.hashCode(this.dateCvcSeparation)) * 31) + Integer.hashCode(this.cvcWidth)) * 31) + Integer.hashCode(this.cvcPostalCodeSeparation)) * 31) + Integer.hashCode(this.postalCodeWidth)) * 31) + Integer.hashCode(this.cardTouchBufferLimit)) * 31) + Integer.hashCode(this.dateStartPosition)) * 31) + Integer.hashCode(this.dateEndTouchBufferLimit)) * 31) + Integer.hashCode(this.cvcStartPosition)) * 31) + Integer.hashCode(this.cvcEndTouchBufferLimit)) * 31) + Integer.hashCode(this.postalCodeStartPosition);
    }

    public CardInputWidgetPlacement(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.totalLengthInPixels = i;
        this.cardWidth = i2;
        this.hiddenCardWidth = i3;
        this.peekCardWidth = i4;
        this.cardDateSeparation = i5;
        this.dateWidth = i6;
        this.dateCvcSeparation = i7;
        this.cvcWidth = i8;
        this.cvcPostalCodeSeparation = i9;
        this.postalCodeWidth = i10;
        this.cardTouchBufferLimit = i11;
        this.dateStartPosition = i12;
        this.dateEndTouchBufferLimit = i13;
        this.cvcStartPosition = i14;
        this.cvcEndTouchBufferLimit = i15;
        this.postalCodeStartPosition = i16;
    }

    public /* synthetic */ CardInputWidgetPlacement(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this((i17 & 1) != 0 ? 0 : i, (i17 & 2) != 0 ? 0 : i2, (i17 & 4) != 0 ? 0 : i3, (i17 & 8) != 0 ? 0 : i4, (i17 & 16) != 0 ? 0 : i5, (i17 & 32) != 0 ? 0 : i6, (i17 & 64) != 0 ? 0 : i7, (i17 & 128) != 0 ? 0 : i8, (i17 & 256) != 0 ? 0 : i9, (i17 & 512) != 0 ? 0 : i10, (i17 & 1024) != 0 ? 0 : i11, (i17 & 2048) != 0 ? 0 : i12, (i17 & 4096) != 0 ? 0 : i13, (i17 & 8192) != 0 ? 0 : i14, (i17 & 16384) != 0 ? 0 : i15, (i17 & 32768) != 0 ? 0 : i16);
    }

    public final void setTotalLengthInPixels$payments_core_release(int i) {
        this.totalLengthInPixels = i;
    }

    /* renamed from: getCardWidth$payments_core_release, reason: from getter */
    public final int getCardWidth() {
        return this.cardWidth;
    }

    public final void setCardWidth$payments_core_release(int i) {
        this.cardWidth = i;
    }

    /* renamed from: getHiddenCardWidth$payments_core_release, reason: from getter */
    public final int getHiddenCardWidth() {
        return this.hiddenCardWidth;
    }

    public final void setHiddenCardWidth$payments_core_release(int i) {
        this.hiddenCardWidth = i;
    }

    public final void setPeekCardWidth$payments_core_release(int i) {
        this.peekCardWidth = i;
    }

    /* renamed from: getDateWidth$payments_core_release, reason: from getter */
    public final int getDateWidth() {
        return this.dateWidth;
    }

    public final void setDateWidth$payments_core_release(int i) {
        this.dateWidth = i;
    }

    /* renamed from: getCvcWidth$payments_core_release, reason: from getter */
    public final int getCvcWidth() {
        return this.cvcWidth;
    }

    public final void setCvcWidth$payments_core_release(int i) {
        this.cvcWidth = i;
    }

    /* renamed from: getPostalCodeWidth$payments_core_release, reason: from getter */
    public final int getPostalCodeWidth() {
        return this.postalCodeWidth;
    }

    public final void setPostalCodeWidth$payments_core_release(int i) {
        this.postalCodeWidth = i;
    }

    private final /* synthetic */ int getCardPeekDateStartMargin() {
        return this.peekCardWidth + this.cardDateSeparation;
    }

    private final /* synthetic */ int getCardPeekCvcStartMargin() {
        return getCardPeekDateStartMargin() + this.dateWidth + this.dateCvcSeparation;
    }

    private final /* synthetic */ int getCardPeekPostalCodeStartMargin() {
        return getCardPeekCvcStartMargin() + this.cvcWidth + this.cvcPostalCodeSeparation;
    }

    public final /* synthetic */ int getDateStartMargin$payments_core_release(boolean isFullCard) {
        if (isFullCard) {
            return this.cardWidth + this.cardDateSeparation;
        }
        return getCardPeekDateStartMargin();
    }

    public final /* synthetic */ int getCvcStartMargin$payments_core_release(boolean isFullCard) {
        if (isFullCard) {
            return this.totalLengthInPixels;
        }
        return getCardPeekCvcStartMargin();
    }

    public final /* synthetic */ int getPostalCodeStartMargin$payments_core_release(boolean isFullCard) {
        if (isFullCard) {
            return this.totalLengthInPixels;
        }
        return getCardPeekPostalCodeStartMargin();
    }

    public final /* synthetic */ void updateSpacing$payments_core_release(boolean isShowingFullCard, boolean postalCodeEnabled, int frameStart, int frameWidth) {
        if (isShowingFullCard) {
            int minimalValueIfNegative = toMinimalValueIfNegative((frameWidth - this.cardWidth) - this.dateWidth);
            this.cardDateSeparation = minimalValueIfNegative;
            int i = this.cardWidth;
            this.cardTouchBufferLimit = frameStart + i + (minimalValueIfNegative / 2);
            this.dateStartPosition = frameStart + i + minimalValueIfNegative;
            return;
        }
        if (postalCodeEnabled) {
            int i2 = frameWidth * 3;
            int minimalValueIfNegative2 = toMinimalValueIfNegative(((i2 / 10) - this.peekCardWidth) - (this.dateWidth / 4));
            this.cardDateSeparation = minimalValueIfNegative2;
            int minimalValueIfNegative3 = toMinimalValueIfNegative(((((i2 / 5) - this.peekCardWidth) - minimalValueIfNegative2) - this.dateWidth) - this.cvcWidth);
            this.dateCvcSeparation = minimalValueIfNegative3;
            int minimalValueIfNegative4 = toMinimalValueIfNegative((((((frameWidth - this.peekCardWidth) - this.cardDateSeparation) - this.dateWidth) - this.cvcWidth) - minimalValueIfNegative3) - this.postalCodeWidth);
            this.cvcPostalCodeSeparation = minimalValueIfNegative4;
            int i3 = frameStart + this.peekCardWidth + this.cardDateSeparation;
            this.cardTouchBufferLimit = i3 / 3;
            this.dateStartPosition = i3;
            int i4 = i3 + this.dateWidth + this.dateCvcSeparation;
            this.dateEndTouchBufferLimit = i4 / 3;
            this.cvcStartPosition = i4;
            int i5 = i4 + this.cvcWidth + minimalValueIfNegative4;
            this.cvcEndTouchBufferLimit = i5 / 3;
            this.postalCodeStartPosition = i5;
            return;
        }
        int minimalValueIfNegative5 = toMinimalValueIfNegative(((frameWidth / 2) - this.peekCardWidth) - (this.dateWidth / 2));
        this.cardDateSeparation = minimalValueIfNegative5;
        int minimalValueIfNegative6 = toMinimalValueIfNegative((((frameWidth - this.peekCardWidth) - minimalValueIfNegative5) - this.dateWidth) - this.cvcWidth);
        this.dateCvcSeparation = minimalValueIfNegative6;
        int i6 = this.peekCardWidth;
        int i7 = this.cardDateSeparation;
        this.cardTouchBufferLimit = frameStart + i6 + (i7 / 2);
        int i8 = frameStart + i6 + i7;
        this.dateStartPosition = i8;
        int i9 = this.dateWidth;
        this.dateEndTouchBufferLimit = i8 + i9 + (minimalValueIfNegative6 / 2);
        this.cvcStartPosition = i8 + i9 + minimalValueIfNegative6;
    }

    public final CardInputWidget.Field getFocusField$payments_core_release(int touchX, int frameStart, boolean isShowingFullCard, boolean postalCodeEnabled) {
        if (isShowingFullCard) {
            if (touchX < frameStart + this.cardWidth) {
                return null;
            }
            if (touchX < this.cardTouchBufferLimit) {
                return CardInputWidget.Field.Number;
            }
            if (touchX < this.dateStartPosition) {
                return CardInputWidget.Field.Expiry;
            }
            return null;
        }
        if (postalCodeEnabled) {
            if (touchX < frameStart + this.peekCardWidth) {
                return null;
            }
            if (touchX < this.cardTouchBufferLimit) {
                return CardInputWidget.Field.Number;
            }
            int i = this.dateStartPosition;
            if (touchX < i) {
                return CardInputWidget.Field.Expiry;
            }
            if (touchX < i + this.dateWidth) {
                return null;
            }
            if (touchX < this.dateEndTouchBufferLimit) {
                return CardInputWidget.Field.Expiry;
            }
            int i2 = this.cvcStartPosition;
            if (touchX < i2) {
                return CardInputWidget.Field.Cvc;
            }
            if (touchX < i2 + this.cvcWidth) {
                return null;
            }
            if (touchX < this.cvcEndTouchBufferLimit) {
                return CardInputWidget.Field.Cvc;
            }
            if (touchX < this.postalCodeStartPosition) {
                return CardInputWidget.Field.PostalCode;
            }
            return null;
        }
        if (touchX < frameStart + this.peekCardWidth) {
            return null;
        }
        if (touchX < this.cardTouchBufferLimit) {
            return CardInputWidget.Field.Number;
        }
        int i3 = this.dateStartPosition;
        if (touchX < i3) {
            return CardInputWidget.Field.Expiry;
        }
        if (touchX < i3 + this.dateWidth) {
            return null;
        }
        if (touchX < this.dateEndTouchBufferLimit) {
            return CardInputWidget.Field.Expiry;
        }
        if (touchX < this.cvcStartPosition) {
            return CardInputWidget.Field.Cvc;
        }
        return null;
    }

    public String toString() {
        String str = "\n            Touch Buffer Data:\n            CardTouchBufferLimit = " + this.cardTouchBufferLimit + "\n            DateStartPosition = " + this.dateStartPosition + "\n            DateEndTouchBufferLimit = " + this.dateEndTouchBufferLimit + "\n            CvcStartPosition = " + this.cvcStartPosition + "\n            CvcEndTouchBufferLimit = " + this.cvcEndTouchBufferLimit + "\n            PostalCodeStartPosition = " + this.postalCodeStartPosition + "\n            ";
        return ("\n            TotalLengthInPixels = " + this.totalLengthInPixels + "\n            CardWidth = " + this.cardWidth + "\n            HiddenCardWidth = " + this.hiddenCardWidth + "\n            PeekCardWidth = " + this.peekCardWidth + "\n            CardDateSeparation = " + this.cardDateSeparation + "\n            DateWidth = " + this.dateWidth + "\n            DateCvcSeparation = " + this.dateCvcSeparation + "\n            CvcWidth = " + this.cvcWidth + "\n            CvcPostalCodeSeparation = " + this.cvcPostalCodeSeparation + "\n            PostalCodeWidth: " + this.postalCodeWidth + "\n            ") + str;
    }

    /* compiled from: CardInputWidgetPlacement.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/view/CardInputWidgetPlacement$Companion;", "", "()V", "MIN_SEPARATION_IN_PX", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
