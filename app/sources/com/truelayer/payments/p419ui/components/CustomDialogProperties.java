package com.truelayer.payments.p419ui.components;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.truelayer.payments.p419ui.theme.Spacing;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CustomDialog.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/truelayer/payments/ui/components/CustomDialogProperties;", "", "makeContentScrollable", "", "dialogPadding", "Landroidx/compose/ui/Modifier;", "cardPadding", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;)V", "getCardPadding", "()Landroidx/compose/ui/Modifier;", "getDialogPadding", "getMakeContentScrollable", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final /* data */ class CustomDialogProperties {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Modifier cardPadding;
    private final Modifier dialogPadding;
    private final boolean makeContentScrollable;

    public CustomDialogProperties() {
        this(false, null, null, 7, null);
    }

    public static /* synthetic */ CustomDialogProperties copy$default(CustomDialogProperties customDialogProperties, boolean z, Modifier modifier, Modifier modifier2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = customDialogProperties.makeContentScrollable;
        }
        if ((i & 2) != 0) {
            modifier = customDialogProperties.dialogPadding;
        }
        if ((i & 4) != 0) {
            modifier2 = customDialogProperties.cardPadding;
        }
        return customDialogProperties.copy(z, modifier, modifier2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getMakeContentScrollable() {
        return this.makeContentScrollable;
    }

    /* renamed from: component2, reason: from getter */
    public final Modifier getDialogPadding() {
        return this.dialogPadding;
    }

    /* renamed from: component3, reason: from getter */
    public final Modifier getCardPadding() {
        return this.cardPadding;
    }

    public final CustomDialogProperties copy(boolean makeContentScrollable, Modifier dialogPadding, Modifier cardPadding) {
        Intrinsics.checkNotNullParameter(dialogPadding, "dialogPadding");
        Intrinsics.checkNotNullParameter(cardPadding, "cardPadding");
        return new CustomDialogProperties(makeContentScrollable, dialogPadding, cardPadding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomDialogProperties)) {
            return false;
        }
        CustomDialogProperties customDialogProperties = (CustomDialogProperties) other;
        return this.makeContentScrollable == customDialogProperties.makeContentScrollable && Intrinsics.areEqual(this.dialogPadding, customDialogProperties.dialogPadding) && Intrinsics.areEqual(this.cardPadding, customDialogProperties.cardPadding);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.makeContentScrollable) * 31) + this.dialogPadding.hashCode()) * 31) + this.cardPadding.hashCode();
    }

    public String toString() {
        return "CustomDialogProperties(makeContentScrollable=" + this.makeContentScrollable + ", dialogPadding=" + this.dialogPadding + ", cardPadding=" + this.cardPadding + ")";
    }

    public CustomDialogProperties(boolean z, Modifier dialogPadding, Modifier cardPadding) {
        Intrinsics.checkNotNullParameter(dialogPadding, "dialogPadding");
        Intrinsics.checkNotNullParameter(cardPadding, "cardPadding");
        this.makeContentScrollable = z;
        this.dialogPadding = dialogPadding;
        this.cardPadding = cardPadding;
    }

    public final boolean getMakeContentScrollable() {
        return this.makeContentScrollable;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CustomDialogProperties(boolean z, Modifier modifier, Modifier modifier2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        z = (i & 1) != 0 ? true : z;
        modifier = (i & 2) != 0 ? PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, Spacing.INSTANCE.m27177getREGULARD9Ej5fM(), 0.0f, 2, null) : modifier;
        if ((i & 4) != 0) {
            Modifier.Companion companion = Modifier.INSTANCE;
            Spacing spacing = Spacing.INSTANCE;
            modifier2 = PaddingKt.m5143paddingVpY3zN4(companion, spacing.m27177getREGULARD9Ej5fM(), C2002Dp.m7995constructorimpl(spacing.m27174getLARGED9Ej5fM() + spacing.m27175getMEDIUMD9Ej5fM()));
        }
        this(z, modifier, modifier2);
    }

    public final Modifier getDialogPadding() {
        return this.dialogPadding;
    }

    public final Modifier getCardPadding() {
        return this.cardPadding;
    }

    /* compiled from: CustomDialog.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/truelayer/payments/ui/components/CustomDialogProperties$Companion;", "", "()V", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "Lcom/truelayer/payments/ui/components/CustomDialogProperties;", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: default, reason: not valid java name */
        public final CustomDialogProperties m27038default() {
            return new CustomDialogProperties(false, null, null, 7, null);
        }
    }
}
