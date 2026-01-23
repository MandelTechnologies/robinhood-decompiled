package com.truelayer.payments.p419ui.utils;

import android.content.res.Resources;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiText.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\t\u001a\u00020\nH\u0016\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/truelayer/payments/ui/utils/UiText;", "", "()V", "asString", "", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "equals", "", "other", "hashCode", "", "DynamicString", "StringResource", "Lcom/truelayer/payments/ui/utils/UiText$DynamicString;", "Lcom/truelayer/payments/ui/utils/UiText$StringResource;", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class UiText {
    public static final int $stable = 0;

    public /* synthetic */ UiText(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: UiText.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m3636d2 = {"Lcom/truelayer/payments/ui/utils/UiText$DynamicString;", "Lcom/truelayer/payments/ui/utils/UiText;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class DynamicString extends UiText {
        public static final int $stable = 0;
        private final String value;

        public static /* synthetic */ DynamicString copy$default(DynamicString dynamicString, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dynamicString.value;
            }
            return dynamicString.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final DynamicString copy(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new DynamicString(value);
        }

        @Override // com.truelayer.payments.p419ui.utils.UiText
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DynamicString) && Intrinsics.areEqual(this.value, ((DynamicString) other).value);
        }

        @Override // com.truelayer.payments.p419ui.utils.UiText
        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "DynamicString(value=" + this.value + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DynamicString(String value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public final String getValue() {
            return this.value;
        }
    }

    private UiText() {
    }

    /* compiled from: UiText.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006¢\u0006\u0002\u0010\u0007R\u001b\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/truelayer/payments/ui/utils/UiText$StringResource;", "Lcom/truelayer/payments/ui/utils/UiText;", "resId", "", "args", "", "", "(I[Ljava/lang/Object;)V", "getArgs", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "getResId", "()I", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class StringResource extends UiText {
        public static final int $stable = 8;
        private final Object[] args;
        private final int resId;

        public final int getResId() {
            return this.resId;
        }

        public final Object[] getArgs() {
            return this.args;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StringResource(int i, Object... args) {
            super(null);
            Intrinsics.checkNotNullParameter(args, "args");
            this.resId = i;
            this.args = args;
        }
    }

    public final String asString(Composer composer, int i) throws Resources.NotFoundException {
        String strStringResource;
        composer.startReplaceableGroup(208496162);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(208496162, i, -1, "com.truelayer.payments.ui.utils.UiText.asString (UiText.kt:15)");
        }
        if (this instanceof DynamicString) {
            strStringResource = ((DynamicString) this).getValue();
        } else {
            if (!(this instanceof StringResource)) {
                throw new NoWhenBranchMatchedException();
            }
            StringResource stringResource = (StringResource) this;
            int resId = stringResource.getResId();
            Object[] args = stringResource.getArgs();
            strStringResource = StringResources_androidKt.stringResource(resId, Arrays.copyOf(args, args.length), composer, 64);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return strStringResource;
    }

    public boolean equals(Object other) {
        if (this instanceof DynamicString) {
            return super.equals(other);
        }
        if ((this instanceof StringResource) && (other instanceof StringResource)) {
            StringResource stringResource = (StringResource) this;
            StringResource stringResource2 = (StringResource) other;
            return stringResource.getResId() == stringResource2.getResId() && Arrays.equals(stringResource.getArgs(), stringResource2.getArgs());
        }
        return super.equals(other);
    }

    public int hashCode() {
        if (this instanceof DynamicString) {
            return ((DynamicString) this).getValue().hashCode();
        }
        if (!(this instanceof StringResource)) {
            throw new NoWhenBranchMatchedException();
        }
        StringResource stringResource = (StringResource) this;
        return Integer.hashCode(stringResource.getResId()) + ArraysKt.contentDeepHashCode(stringResource.getArgs());
    }
}
