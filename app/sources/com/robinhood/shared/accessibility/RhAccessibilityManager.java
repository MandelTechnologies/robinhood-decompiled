package com.robinhood.shared.accessibility;

import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

/* compiled from: RhAccessibilityManager.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/shared/accessibility/RhAccessibilityManager;", "", "streamKeyInputAccessibilityEnabled", "Lkotlinx/coroutines/flow/Flow;", "", "lib-a11y_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface RhAccessibilityManager {
    Flow<Boolean> streamKeyInputAccessibilityEnabled();
}
