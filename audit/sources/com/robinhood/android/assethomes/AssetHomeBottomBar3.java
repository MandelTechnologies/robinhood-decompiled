package com.robinhood.android.assethomes;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: AssetHomeBottomBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.assethomes.AssetHomeBottomBarKt$AssetHomeBottomBar$1$1, reason: use source file name */
/* loaded from: classes7.dex */
final class AssetHomeBottomBar3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Ref.ObjectRef<Job> $actionJob;
    final /* synthetic */ Context $context;
    final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
    final /* synthetic */ FragmentManager $fragmentManager;
    final /* synthetic */ Navigator $navigator;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ AssetHomeViewState $viewState;

    AssetHomeBottomBar3(UserInteractionEventDescriptor userInteractionEventDescriptor, AssetHomeViewState assetHomeViewState, Ref.ObjectRef<Job> objectRef, CoroutineScope coroutineScope, Navigator navigator, Context context, FragmentManager fragmentManager) {
        this.$eventDescriptor = userInteractionEventDescriptor;
        this.$viewState = assetHomeViewState;
        this.$actionJob = objectRef;
        this.$scope = coroutineScope;
        this.$navigator = navigator;
        this.$context = context;
        this.$fragmentManager = fragmentManager;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        Modifier modifierEducationTourId$default;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(442368054, i, -1, "com.robinhood.android.assethomes.AssetHomeBottomBar.<anonymous>.<anonymous> (AssetHomeBottomBar.kt:63)");
        }
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default(this.$eventDescriptor, null, null, null, null, new Component(Component.ComponentType.BUTTON, AssetHomeBottomBar2.ASSET_HOME_BUTTON_BAR_IDENTIFIER, null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null), BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null);
        String bottomBarEducationTourId = this.$viewState.getBottomBarEducationTourId();
        if (bottomBarEducationTourId != null && (modifierEducationTourId$default = com.robinhood.android.educationtour.compose.ModifiersKt.educationTourId$default(modifierFillMaxWidth$default, bottomBarEducationTourId, null, null, false, true, 14, null)) != null) {
            modifierFillMaxWidth$default = modifierEducationTourId$default;
        }
        final Ref.ObjectRef<Job> objectRef = this.$actionJob;
        final CoroutineScope coroutineScope = this.$scope;
        final AssetHomeViewState assetHomeViewState = this.$viewState;
        final Navigator navigator = this.$navigator;
        final Context context = this.$context;
        final FragmentManager fragmentManager = this.$fragmentManager;
        Function0 function0 = new Function0() { // from class: com.robinhood.android.assethomes.AssetHomeBottomBarKt$AssetHomeBottomBar$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetHomeBottomBar3.invoke$lambda$1(objectRef, coroutineScope, assetHomeViewState, navigator, context, fragmentManager);
            }
        };
        Integer bottomBarText = this.$viewState.getBottomBar().getBottomBarText();
        composer.startReplaceGroup(-85977104);
        String strStringResource = bottomBarText != null ? StringResources_androidKt.stringResource(bottomBarText.intValue(), composer, 0) : null;
        composer.endReplaceGroup();
        BentoButtonBar2.BentoButtonBar(modifierFillMaxWidth$default, null, null, false, null, null, null, null, false, null, false, function0, strStringResource, false, null, false, composer, 0, 0, 59390);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r8v3, types: [T, kotlinx.coroutines.Job] */
    public static final Unit invoke$lambda$1(Ref.ObjectRef objectRef, CoroutineScope coroutineScope, AssetHomeViewState assetHomeViewState, Navigator navigator, Context context, FragmentManager fragmentManager) {
        if (objectRef.element == 0) {
            objectRef.element = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AssetHomeBottomBar4(assetHomeViewState, navigator, context, fragmentManager, objectRef, null), 3, null);
        }
        return Unit.INSTANCE;
    }
}
