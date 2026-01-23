package com.robinhood.android.optionsexercise.targets;

import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.app.keys.data.ExerciseOptionInstrumentId;
import com.robinhood.utils.extensions.StringsKt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EarlyAssignmentDeeplinkTargets.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"getIntent", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-options-exercise_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionsexercise.targets.EarlyAssignmentDeeplinkTargetsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class EarlyAssignmentDeeplinkTargets2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent[] getIntent(DeeplinkTarget2 deeplinkTarget2) {
        UUID uuid;
        String queryParameter = deeplinkTarget2.getUri().getQueryParameter("option_id");
        if (queryParameter != null) {
            try {
                uuid = StringsKt.toUuid(queryParameter);
            } catch (IllegalArgumentException unused) {
                uuid = null;
            }
            if (uuid != null) {
                return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkTarget2.getNavigator(), deeplinkTarget2.getContext(), new LegacyIntentKey.OptionExercise(deeplinkTarget2.getUri().getQueryParameter("account_number"), new ExerciseOptionInstrumentId.AssignedOptionId(uuid)), null, false, 12, null)};
            }
        }
        throw new IllegalStateException("option id required");
    }
}
