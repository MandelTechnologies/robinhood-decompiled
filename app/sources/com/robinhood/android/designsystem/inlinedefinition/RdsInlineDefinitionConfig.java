package com.robinhood.android.designsystem.inlinedefinition;

import com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RdsInlineDefinitionConfig.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/designsystem/inlinedefinition/RdsInlineDefinitionConfig;", "", "delimiter", "", "shouldDimBackground", "", "callbacks", "Lcom/robinhood/android/designsystem/inlinedefinition/RdsInlineDefinitionTextView$Callbacks;", "<init>", "(Ljava/lang/String;ZLcom/robinhood/android/designsystem/inlinedefinition/RdsInlineDefinitionTextView$Callbacks;)V", "getDelimiter", "()Ljava/lang/String;", "getShouldDimBackground", "()Z", "getCallbacks", "()Lcom/robinhood/android/designsystem/inlinedefinition/RdsInlineDefinitionTextView$Callbacks;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "lib-design-system-inline-definition_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RdsInlineDefinitionConfig {
    public static final int $stable = 8;
    private final RdsInlineDefinitionTextView.Callbacks callbacks;
    private final String delimiter;
    private final boolean shouldDimBackground;

    public RdsInlineDefinitionConfig() {
        this(null, false, null, 7, null);
    }

    public static /* synthetic */ RdsInlineDefinitionConfig copy$default(RdsInlineDefinitionConfig rdsInlineDefinitionConfig, String str, boolean z, RdsInlineDefinitionTextView.Callbacks callbacks, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rdsInlineDefinitionConfig.delimiter;
        }
        if ((i & 2) != 0) {
            z = rdsInlineDefinitionConfig.shouldDimBackground;
        }
        if ((i & 4) != 0) {
            callbacks = rdsInlineDefinitionConfig.callbacks;
        }
        return rdsInlineDefinitionConfig.copy(str, z, callbacks);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDelimiter() {
        return this.delimiter;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShouldDimBackground() {
        return this.shouldDimBackground;
    }

    /* renamed from: component3, reason: from getter */
    public final RdsInlineDefinitionTextView.Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final RdsInlineDefinitionConfig copy(String delimiter, boolean shouldDimBackground, RdsInlineDefinitionTextView.Callbacks callbacks) {
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        return new RdsInlineDefinitionConfig(delimiter, shouldDimBackground, callbacks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RdsInlineDefinitionConfig)) {
            return false;
        }
        RdsInlineDefinitionConfig rdsInlineDefinitionConfig = (RdsInlineDefinitionConfig) other;
        return Intrinsics.areEqual(this.delimiter, rdsInlineDefinitionConfig.delimiter) && this.shouldDimBackground == rdsInlineDefinitionConfig.shouldDimBackground && Intrinsics.areEqual(this.callbacks, rdsInlineDefinitionConfig.callbacks);
    }

    public int hashCode() {
        int iHashCode = ((this.delimiter.hashCode() * 31) + Boolean.hashCode(this.shouldDimBackground)) * 31;
        RdsInlineDefinitionTextView.Callbacks callbacks = this.callbacks;
        return iHashCode + (callbacks == null ? 0 : callbacks.hashCode());
    }

    public String toString() {
        return "RdsInlineDefinitionConfig(delimiter=" + this.delimiter + ", shouldDimBackground=" + this.shouldDimBackground + ", callbacks=" + this.callbacks + ")";
    }

    public RdsInlineDefinitionConfig(String delimiter, boolean z, RdsInlineDefinitionTextView.Callbacks callbacks) {
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        this.delimiter = delimiter;
        this.shouldDimBackground = z;
        this.callbacks = callbacks;
    }

    public /* synthetic */ RdsInlineDefinitionConfig(String str, boolean z, RdsInlineDefinitionTextView.Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "||" : str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : callbacks);
    }

    public final String getDelimiter() {
        return this.delimiter;
    }

    public final boolean getShouldDimBackground() {
        return this.shouldDimBackground;
    }

    public final RdsInlineDefinitionTextView.Callbacks getCallbacks() {
        return this.callbacks;
    }
}
