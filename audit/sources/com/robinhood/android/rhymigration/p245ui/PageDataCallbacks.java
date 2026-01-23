package com.robinhood.android.rhymigration.p245ui;

import com.robinhood.android.rhymigration.model.UiRhyMigrationCardPage;
import com.robinhood.android.rhymigration.model.UiRhyMigrationContrastPage;
import com.robinhood.android.rhymigration.model.UiRhyMigrationFeaturePage;
import com.robinhood.android.rhymigration.model.UiRhyMigrationLoadingAnimation;
import com.robinhood.android.rhymigration.model.UiRhyMigrationReviewPage;
import com.robinhood.models.api.minerva.RhyMigrationVariables;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import kotlin.Metadata;

/* compiled from: PageDataCallbacks.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/PageDataCallbacks;", "", "contrastPage", "Lcom/robinhood/android/rhymigration/model/UiRhyMigrationContrastPage;", "getContrastPage", "()Lcom/robinhood/android/rhymigration/model/UiRhyMigrationContrastPage;", "reviewPage", "Lcom/robinhood/android/rhymigration/model/UiRhyMigrationReviewPage;", "getReviewPage", "()Lcom/robinhood/android/rhymigration/model/UiRhyMigrationReviewPage;", "cardPage", "Lcom/robinhood/android/rhymigration/model/UiRhyMigrationCardPage;", "getCardPage", "()Lcom/robinhood/android/rhymigration/model/UiRhyMigrationCardPage;", "animation", "Lcom/robinhood/android/rhymigration/model/UiRhyMigrationLoadingAnimation;", "getAnimation", "()Lcom/robinhood/android/rhymigration/model/UiRhyMigrationLoadingAnimation;", "variables", "Lcom/robinhood/models/api/minerva/RhyMigrationVariables;", "getVariables", "()Lcom/robinhood/models/api/minerva/RhyMigrationVariables;", "getFeaturePage", "Lcom/robinhood/android/rhymigration/model/UiRhyMigrationFeaturePage;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface PageDataCallbacks {
    UiRhyMigrationLoadingAnimation getAnimation();

    UiRhyMigrationCardPage getCardPage();

    UiRhyMigrationContrastPage getContrastPage();

    UiRhyMigrationFeaturePage getFeaturePage(int index);

    UiRhyMigrationReviewPage getReviewPage();

    RhyMigrationVariables getVariables();
}
