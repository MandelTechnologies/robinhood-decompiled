package androidx.compose.p011ui.autofill;

import androidx.collection.ScatterMap6;
import androidx.compose.p011ui.semantics.SemanticsActions;
import androidx.compose.p011ui.semantics.SemanticsConfiguration;
import androidx.compose.p011ui.semantics.SemanticsProperties;
import androidx.compose.p011ui.semantics.SemanticsPropertyKey;
import kotlin.Metadata;

/* compiled from: AndroidAutofillManager.android.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, m3636d2 = {"Landroidx/compose/ui/semantics/SemanticsConfiguration;", "", "isAutofillable", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Z", "isRelatedToAutoCommit", "isRelatedToAutofill", "ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class AndroidAutofillManager_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isAutofillable(SemanticsConfiguration semanticsConfiguration) {
        return semanticsConfiguration.getProps$ui_release().contains(SemanticsActions.INSTANCE.getOnAutofillText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isRelatedToAutoCommit(SemanticsConfiguration semanticsConfiguration) {
        return semanticsConfiguration.getProps$ui_release().contains(SemanticsProperties.INSTANCE.getContentType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isRelatedToAutofill(SemanticsConfiguration semanticsConfiguration) {
        if (semanticsConfiguration.getProps$ui_release().contains(SemanticsActions.INSTANCE.getOnAutofillText())) {
            return true;
        }
        ScatterMap6<SemanticsPropertyKey<?>, Object> props$ui_release = semanticsConfiguration.getProps$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return props$ui_release.contains(semanticsProperties.getContentType()) || semanticsConfiguration.getProps$ui_release().contains(semanticsProperties.getContentDataType());
    }
}
