package com.robinhood.android.supportchat;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: BottomControlsPreviewProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/supportchat/BottomControlsPreviewProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/android/supportchat/BottomControlsPreviewProvider$Args;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "Args", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class BottomControlsPreviewProvider implements PreviewParameterProvider<Args> {
    public static final int $stable = 0;

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<Args> getValues() {
        return SequencesKt.sequenceOf(new Args(true, "input_1", true, 3000), new Args(false, "input_1", true, 3000), new Args(true, "input_1", false, 3000), new Args(false, "input_1", false, 3000));
    }

    /* compiled from: BottomControlsPreviewProvider.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\bHÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/supportchat/BottomControlsPreviewProvider$Args;", "", "isDay", "", "input", "", "enabled", "characterLimit", "", "<init>", "(ZLjava/lang/String;ZI)V", "()Z", "getInput", "()Ljava/lang/String;", "getEnabled", "getCharacterLimit", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args {
        public static final int $stable = 0;
        private final int characterLimit;
        private final boolean enabled;
        private final String input;
        private final boolean isDay;

        public static /* synthetic */ Args copy$default(Args args, boolean z, String str, boolean z2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = args.isDay;
            }
            if ((i2 & 2) != 0) {
                str = args.input;
            }
            if ((i2 & 4) != 0) {
                z2 = args.enabled;
            }
            if ((i2 & 8) != 0) {
                i = args.characterLimit;
            }
            return args.copy(z, str, z2, i);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsDay() {
            return this.isDay;
        }

        /* renamed from: component2, reason: from getter */
        public final String getInput() {
            return this.input;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        /* renamed from: component4, reason: from getter */
        public final int getCharacterLimit() {
            return this.characterLimit;
        }

        public final Args copy(boolean isDay, String input, boolean enabled, int characterLimit) {
            Intrinsics.checkNotNullParameter(input, "input");
            return new Args(isDay, input, enabled, characterLimit);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return this.isDay == args.isDay && Intrinsics.areEqual(this.input, args.input) && this.enabled == args.enabled && this.characterLimit == args.characterLimit;
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.isDay) * 31) + this.input.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + Integer.hashCode(this.characterLimit);
        }

        public String toString() {
            return "Args(isDay=" + this.isDay + ", input=" + this.input + ", enabled=" + this.enabled + ", characterLimit=" + this.characterLimit + ")";
        }

        public Args(boolean z, String input, boolean z2, int i) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.isDay = z;
            this.input = input;
            this.enabled = z2;
            this.characterLimit = i;
        }

        public final boolean isDay() {
            return this.isDay;
        }

        public final String getInput() {
            return this.input;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final int getCharacterLimit() {
            return this.characterLimit;
        }
    }
}
