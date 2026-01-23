package com.withpersona.sdk2.inquiry.governmentid.capture_tips;

import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CaptureTipsViewModel.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/capture_tips/CaptureTipsViewModel;", "", "", "helpButtonText", "title", "prompt", "tips", "buttonText", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;", "side", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHelpButtonText", "getTitle", "getPrompt", "getTips", "getButtonText", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;", "getSide", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class CaptureTipsViewModel {
    private final String buttonText;
    private final String helpButtonText;
    private final String prompt;
    private final IdConfig.Side side;
    private final String tips;
    private final String title;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CaptureTipsViewModel)) {
            return false;
        }
        CaptureTipsViewModel captureTipsViewModel = (CaptureTipsViewModel) other;
        return Intrinsics.areEqual(this.helpButtonText, captureTipsViewModel.helpButtonText) && Intrinsics.areEqual(this.title, captureTipsViewModel.title) && Intrinsics.areEqual(this.prompt, captureTipsViewModel.prompt) && Intrinsics.areEqual(this.tips, captureTipsViewModel.tips) && Intrinsics.areEqual(this.buttonText, captureTipsViewModel.buttonText) && this.side == captureTipsViewModel.side;
    }

    public int hashCode() {
        return (((((((((this.helpButtonText.hashCode() * 31) + this.title.hashCode()) * 31) + this.prompt.hashCode()) * 31) + this.tips.hashCode()) * 31) + this.buttonText.hashCode()) * 31) + this.side.hashCode();
    }

    public String toString() {
        return "CaptureTipsViewModel(helpButtonText=" + this.helpButtonText + ", title=" + this.title + ", prompt=" + this.prompt + ", tips=" + this.tips + ", buttonText=" + this.buttonText + ", side=" + this.side + ")";
    }

    public CaptureTipsViewModel(String helpButtonText, String title, String prompt, String tips, String buttonText, IdConfig.Side side) {
        Intrinsics.checkNotNullParameter(helpButtonText, "helpButtonText");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        Intrinsics.checkNotNullParameter(tips, "tips");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(side, "side");
        this.helpButtonText = helpButtonText;
        this.title = title;
        this.prompt = prompt;
        this.tips = tips;
        this.buttonText = buttonText;
        this.side = side;
    }

    public final String getHelpButtonText() {
        return this.helpButtonText;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getPrompt() {
        return this.prompt;
    }

    public final String getTips() {
        return this.tips;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final IdConfig.Side getSide() {
        return this.side;
    }
}
