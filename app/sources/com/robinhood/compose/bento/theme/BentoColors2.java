package com.robinhood.compose.bento.theme;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: BentoColors.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000\u001a\b\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\b\u0010\u0003\u001a\u00020\u0001H\u0000\u001a\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u0006\u0010\u0005\u001a\u00020\u0001\u001a\b\u0010\u0006\u001a\u00020\u0001H\u0000\"\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"dayColors", "Lcom/robinhood/compose/bento/theme/BentoColors;", "nightColors", "cryptoColors", "creditCardGoldColors", "creditCardDayColors", "creditCardSilverColors", "LocalBentoColors", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalBentoColors", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.theme.BentoColorsKt, reason: use source file name */
/* loaded from: classes20.dex */
public final class BentoColors2 {
    private static final CompositionLocal6<BentoColors> LocalBentoColors = CompositionLocal3.staticCompositionLocalOf(new Function0() { // from class: com.robinhood.compose.bento.theme.BentoColorsKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BentoColors2.LocalBentoColors$lambda$0();
        }
    });

    public static final BentoColors dayColors() {
        BentoColor bentoColor = BentoColor.INSTANCE;
        return new BentoColors(bentoColor.m21236getDayPrime0d7_KjU(), bentoColor.m21236getDayPrime0d7_KjU(), bentoColor.m21221getDayJoule0d7_KjU(), bentoColor.m21206getDayFg0d7_KjU(), bentoColor.m21207getDayFg20d7_KjU(), bentoColor.m21208getDayFg30d7_KjU(), bentoColor.m21168getDayBg30d7_KjU(), bentoColor.m21167getDayBg20d7_KjU(), bentoColor.m21166getDayBg0d7_KjU(), bentoColor.m21220getDayJet0d7_KjU(), bentoColor.m21235getDayNova0d7_KjU(), bentoColor.m21223getDayJouleLight0d7_KjU(), bentoColor.m21221getDayJoule0d7_KjU(), bentoColor.m21222getDayJouleDark0d7_KjU(), bentoColor.m21245getDaySolLight0d7_KjU(), bentoColor.m21243getDaySol0d7_KjU(), bentoColor.m21244getDaySolDark0d7_KjU(), bentoColor.m21226getDayLumenLight0d7_KjU(), bentoColor.m21224getDayLumen0d7_KjU(), bentoColor.m21225getDayLumenDark0d7_KjU(), bentoColor.m21255getDayXrayLight0d7_KjU(), bentoColor.m21253getDayXray0d7_KjU(), bentoColor.m21254getDayXrayDark0d7_KjU(), bentoColor.m21238getDayPrimeLight0d7_KjU(), bentoColor.m21236getDayPrime0d7_KjU(), bentoColor.m21237getDayPrimeDark0d7_KjU(), bentoColor.m21171getDayBiomeLight0d7_KjU(), bentoColor.m21169getDayBiome0d7_KjU(), bentoColor.m21170getDayBiomeDark0d7_KjU(), bentoColor.m21201getDayDotLight0d7_KjU(), bentoColor.m21199getDayDot0d7_KjU(), bentoColor.m21200getDayDotDark0d7_KjU(), bentoColor.m21214getDayHydroLight0d7_KjU(), bentoColor.m21212getDayHydro0d7_KjU(), bentoColor.m21213getDayHydroDark0d7_KjU(), bentoColor.m21198getDayCosmonautLight0d7_KjU(), bentoColor.m21196getDayCosmonaut0d7_KjU(), bentoColor.m21197getDayCosmonautDark0d7_KjU(), bentoColor.m21249getDayUvLight0d7_KjU(), bentoColor.m21247getDayUv0d7_KjU(), bentoColor.m21248getDayUvDark0d7_KjU(), bentoColor.m21218getDayIrisLight0d7_KjU(), bentoColor.m21216getDayIris0d7_KjU(), bentoColor.m21217getDayIrisDark0d7_KjU(), bentoColor.m21230getDayMilleniumLight0d7_KjU(), bentoColor.m21228getDayMillenium0d7_KjU(), bentoColor.m21229getDayMilleniumDark0d7_KjU(), bentoColor.m21241getDayResinLight0d7_KjU(), bentoColor.m21239getDayResin0d7_KjU(), bentoColor.m21240getDayResinDark0d7_KjU(), bentoColor.m21204getDayDroidLight0d7_KjU(), bentoColor.m21202getDayDroid0d7_KjU(), bentoColor.m21203getDayDroidDark0d7_KjU(), bentoColor.m21195getDayCloneLight0d7_KjU(), bentoColor.m21193getDayClone0d7_KjU(), bentoColor.m21194getDayCloneDark0d7_KjU(), bentoColor.m21231getDayMineral0d7_KjU(), bentoColor.m21165getDayAndros0d7_KjU(), bentoColor.m21215getDayIon0d7_KjU(), bentoColor.m21219getDayJade0d7_KjU(), bentoColor.m21246getDayStratos0d7_KjU(), bentoColor.m21205getDayExos0d7_KjU(), bentoColor.m21242getDayRuby0d7_KjU(), bentoColor.m21210getDayGaia0d7_KjU(), bentoColor.m21234getDayNeon0d7_KjU(), bentoColor.m21172getDayBloom0d7_KjU(), bentoColor.m21209getDayFlare0d7_KjU(), bentoColor.m21232getDayMoon0d7_KjU(), bentoColor.m21233getDayMorph0d7_KjU(), bentoColor.m21135getAstro0d7_KjU(), bentoColor.m21257getNeptune0d7_KjU(), bentoColor.m21355getSynth0d7_KjU(), bentoColor.m21173getDayC10d7_KjU(), bentoColor.m21184getDayC20d7_KjU(), bentoColor.m21186getDayC30d7_KjU(), bentoColor.m21187getDayC40d7_KjU(), bentoColor.m21188getDayC50d7_KjU(), bentoColor.m21189getDayC60d7_KjU(), bentoColor.m21190getDayC70d7_KjU(), bentoColor.m21191getDayC80d7_KjU(), bentoColor.m21192getDayC90d7_KjU(), bentoColor.m21174getDayC100d7_KjU(), bentoColor.m21175getDayC110d7_KjU(), bentoColor.m21176getDayC120d7_KjU(), bentoColor.m21177getDayC130d7_KjU(), bentoColor.m21178getDayC140d7_KjU(), bentoColor.m21179getDayC150d7_KjU(), bentoColor.m21180getDayC160d7_KjU(), bentoColor.m21181getDayC170d7_KjU(), bentoColor.m21182getDayC180d7_KjU(), bentoColor.m21183getDayC190d7_KjU(), bentoColor.m21185getDayC200d7_KjU(), bentoColor.m21143getCCGoldFG0d7_KjU(), bentoColor.m21144getCCGoldFG20d7_KjU(), bentoColor.m21145getCCGoldFG30d7_KjU(), bentoColor.m21139getCCGoldBG0d7_KjU(), bentoColor.m21140getCCGoldBG20d7_KjU(), bentoColor.m21141getCCGoldBG30d7_KjU(), bentoColor.m21138getCCGoldAccent0d7_KjU(), bentoColor.m21146getCCSilverAccent0d7_KjU(), bentoColor.m21150getCCSilverFG0d7_KjU(), bentoColor.m21151getCCSilverFG20d7_KjU(), bentoColor.m21152getCCSilverFG30d7_KjU(), bentoColor.m21147getCCSilverBG0d7_KjU(), bentoColor.m21148getCCSilverBG20d7_KjU(), bentoColor.m21149getCCSilverBG30d7_KjU(), true, null, null, null, null, null, null, bentoColor.m21247getDayUv0d7_KjU(), bentoColor.m21250getDayWidgetBG0d7_KjU(), bentoColor.m21251getDayWidgetBG20d7_KjU(), bentoColor.m21252getDayWidgetSurfaceBG0d7_KjU(), bentoColor.m21227getDayMenuBG0d7_KjU(), null);
    }

    public static final BentoColors nightColors() {
        BentoColor bentoColor = BentoColor.INSTANCE;
        long jM21335getNightPrime0d7_KjU = bentoColor.m21335getNightPrime0d7_KjU();
        long jM21335getNightPrime0d7_KjU2 = bentoColor.m21335getNightPrime0d7_KjU();
        long jM21320getNightJoule0d7_KjU = bentoColor.m21320getNightJoule0d7_KjU();
        long jM21305getNightFg0d7_KjU = bentoColor.m21305getNightFg0d7_KjU();
        long jM21306getNightFg20d7_KjU = bentoColor.m21306getNightFg20d7_KjU();
        long jM21307getNightFg30d7_KjU = bentoColor.m21307getNightFg30d7_KjU();
        long jM21261getNightBg30d7_KjU = bentoColor.m21261getNightBg30d7_KjU();
        long jM21260getNightBg20d7_KjU = bentoColor.m21260getNightBg20d7_KjU();
        long jM21259getNightBg0d7_KjU = bentoColor.m21259getNightBg0d7_KjU();
        long jM21319getNightJet0d7_KjU = bentoColor.m21319getNightJet0d7_KjU();
        long jM21334getNightNova0d7_KjU = bentoColor.m21334getNightNova0d7_KjU();
        long jM21322getNightJouleLight0d7_KjU = bentoColor.m21322getNightJouleLight0d7_KjU();
        long jM21320getNightJoule0d7_KjU2 = bentoColor.m21320getNightJoule0d7_KjU();
        long jM21321getNightJouleDark0d7_KjU = bentoColor.m21321getNightJouleDark0d7_KjU();
        long jM21344getNightSolLight0d7_KjU = bentoColor.m21344getNightSolLight0d7_KjU();
        long jM21342getNightSol0d7_KjU = bentoColor.m21342getNightSol0d7_KjU();
        long jM21343getNightSolDark0d7_KjU = bentoColor.m21343getNightSolDark0d7_KjU();
        long jM21325getNightLumenLight0d7_KjU = bentoColor.m21325getNightLumenLight0d7_KjU();
        long jM21323getNightLumen0d7_KjU = bentoColor.m21323getNightLumen0d7_KjU();
        long jM21324getNightLumenDark0d7_KjU = bentoColor.m21324getNightLumenDark0d7_KjU();
        long jM21354getNightXrayLight0d7_KjU = bentoColor.m21354getNightXrayLight0d7_KjU();
        long jM21352getNightXray0d7_KjU = bentoColor.m21352getNightXray0d7_KjU();
        long jM21353getNightXrayDark0d7_KjU = bentoColor.m21353getNightXrayDark0d7_KjU();
        long jM21337getNightPrimeLight0d7_KjU = bentoColor.m21337getNightPrimeLight0d7_KjU();
        long jM21335getNightPrime0d7_KjU3 = bentoColor.m21335getNightPrime0d7_KjU();
        long jM21336getNightPrimeDark0d7_KjU = bentoColor.m21336getNightPrimeDark0d7_KjU();
        long jM21264getNightBiomeLight0d7_KjU = bentoColor.m21264getNightBiomeLight0d7_KjU();
        long jM21262getNightBiome0d7_KjU = bentoColor.m21262getNightBiome0d7_KjU();
        long jM21263getNightBiomeDark0d7_KjU = bentoColor.m21263getNightBiomeDark0d7_KjU();
        long jM21294getNightDotLight0d7_KjU = bentoColor.m21294getNightDotLight0d7_KjU();
        long jM21292getNightDot0d7_KjU = bentoColor.m21292getNightDot0d7_KjU();
        long jM21293getNightDotDark0d7_KjU = bentoColor.m21293getNightDotDark0d7_KjU();
        long jM21313getNightHydroLight0d7_KjU = bentoColor.m21313getNightHydroLight0d7_KjU();
        long jM21311getNightHydro0d7_KjU = bentoColor.m21311getNightHydro0d7_KjU();
        long jM21312getNightHydroDark0d7_KjU = bentoColor.m21312getNightHydroDark0d7_KjU();
        long jM21291getNightCosmonautLight0d7_KjU = bentoColor.m21291getNightCosmonautLight0d7_KjU();
        long jM21289getNightCosmonaut0d7_KjU = bentoColor.m21289getNightCosmonaut0d7_KjU();
        long jM21290getNightCosmonautDark0d7_KjU = bentoColor.m21290getNightCosmonautDark0d7_KjU();
        long jM21348getNightUvLight0d7_KjU = bentoColor.m21348getNightUvLight0d7_KjU();
        long jM21346getNightUv0d7_KjU = bentoColor.m21346getNightUv0d7_KjU();
        long jM21347getNightUvDark0d7_KjU = bentoColor.m21347getNightUvDark0d7_KjU();
        long jM21317getNightIrisLight0d7_KjU = bentoColor.m21317getNightIrisLight0d7_KjU();
        long jM21315getNightIris0d7_KjU = bentoColor.m21315getNightIris0d7_KjU();
        long jM21316getNightIrisDark0d7_KjU = bentoColor.m21316getNightIrisDark0d7_KjU();
        long jM21329getNightMilleniumLight0d7_KjU = bentoColor.m21329getNightMilleniumLight0d7_KjU();
        long jM21327getNightMillenium0d7_KjU = bentoColor.m21327getNightMillenium0d7_KjU();
        long jM21328getNightMilleniumDark0d7_KjU = bentoColor.m21328getNightMilleniumDark0d7_KjU();
        long jM21340getNightResinLight0d7_KjU = bentoColor.m21340getNightResinLight0d7_KjU();
        long jM21338getNightResin0d7_KjU = bentoColor.m21338getNightResin0d7_KjU();
        long jM21339getNightResinDark0d7_KjU = bentoColor.m21339getNightResinDark0d7_KjU();
        long jM21297getNightDroidLight0d7_KjU = bentoColor.m21297getNightDroidLight0d7_KjU();
        long jM21295getNightDroid0d7_KjU = bentoColor.m21295getNightDroid0d7_KjU();
        long jM21296getNightDroidDark0d7_KjU = bentoColor.m21296getNightDroidDark0d7_KjU();
        long jM21288getNightCloneLight0d7_KjU = bentoColor.m21288getNightCloneLight0d7_KjU();
        long jM21286getNightClone0d7_KjU = bentoColor.m21286getNightClone0d7_KjU();
        long jM21287getNightCloneDark0d7_KjU = bentoColor.m21287getNightCloneDark0d7_KjU();
        long jM21330getNightMineral0d7_KjU = bentoColor.m21330getNightMineral0d7_KjU();
        long jM21258getNightAndros0d7_KjU = bentoColor.m21258getNightAndros0d7_KjU();
        long jM21314getNightIon0d7_KjU = bentoColor.m21314getNightIon0d7_KjU();
        long jM21318getNightJade0d7_KjU = bentoColor.m21318getNightJade0d7_KjU();
        long jM21345getNightStratos0d7_KjU = bentoColor.m21345getNightStratos0d7_KjU();
        long jM21304getNightExos0d7_KjU = bentoColor.m21304getNightExos0d7_KjU();
        long jM21341getNightRuby0d7_KjU = bentoColor.m21341getNightRuby0d7_KjU();
        long jM21309getNightGaia0d7_KjU = bentoColor.m21309getNightGaia0d7_KjU();
        long jM21333getNightNeon0d7_KjU = bentoColor.m21333getNightNeon0d7_KjU();
        long jM21265getNightBloom0d7_KjU = bentoColor.m21265getNightBloom0d7_KjU();
        long jM21308getNightFlare0d7_KjU = bentoColor.m21308getNightFlare0d7_KjU();
        long jM21331getNightMoon0d7_KjU = bentoColor.m21331getNightMoon0d7_KjU();
        long jM21332getNightMorph0d7_KjU = bentoColor.m21332getNightMorph0d7_KjU();
        long jM21135getAstro0d7_KjU = bentoColor.m21135getAstro0d7_KjU();
        long jM21257getNeptune0d7_KjU = bentoColor.m21257getNeptune0d7_KjU();
        long jM21355getSynth0d7_KjU = bentoColor.m21355getSynth0d7_KjU();
        long jM21266getNightC10d7_KjU = bentoColor.m21266getNightC10d7_KjU();
        long jM21277getNightC20d7_KjU = bentoColor.m21277getNightC20d7_KjU();
        long jM21279getNightC30d7_KjU = bentoColor.m21279getNightC30d7_KjU();
        long jM21280getNightC40d7_KjU = bentoColor.m21280getNightC40d7_KjU();
        long jM21281getNightC50d7_KjU = bentoColor.m21281getNightC50d7_KjU();
        long jM21282getNightC60d7_KjU = bentoColor.m21282getNightC60d7_KjU();
        long jM21283getNightC70d7_KjU = bentoColor.m21283getNightC70d7_KjU();
        long jM21284getNightC80d7_KjU = bentoColor.m21284getNightC80d7_KjU();
        long jM21285getNightC90d7_KjU = bentoColor.m21285getNightC90d7_KjU();
        long jM21267getNightC100d7_KjU = bentoColor.m21267getNightC100d7_KjU();
        long jM21268getNightC110d7_KjU = bentoColor.m21268getNightC110d7_KjU();
        long jM21269getNightC120d7_KjU = bentoColor.m21269getNightC120d7_KjU();
        long jM21270getNightC130d7_KjU = bentoColor.m21270getNightC130d7_KjU();
        long jM21271getNightC140d7_KjU = bentoColor.m21271getNightC140d7_KjU();
        long jM21272getNightC150d7_KjU = bentoColor.m21272getNightC150d7_KjU();
        long jM21273getNightC160d7_KjU = bentoColor.m21273getNightC160d7_KjU();
        long jM21274getNightC170d7_KjU = bentoColor.m21274getNightC170d7_KjU();
        long jM21275getNightC180d7_KjU = bentoColor.m21275getNightC180d7_KjU();
        long jM21276getNightC190d7_KjU = bentoColor.m21276getNightC190d7_KjU();
        long jM21278getNightC200d7_KjU = bentoColor.m21278getNightC200d7_KjU();
        long jM21143getCCGoldFG0d7_KjU = bentoColor.m21143getCCGoldFG0d7_KjU();
        long jM21144getCCGoldFG20d7_KjU = bentoColor.m21144getCCGoldFG20d7_KjU();
        long jM21145getCCGoldFG30d7_KjU = bentoColor.m21145getCCGoldFG30d7_KjU();
        long jM21139getCCGoldBG0d7_KjU = bentoColor.m21139getCCGoldBG0d7_KjU();
        long jM21140getCCGoldBG20d7_KjU = bentoColor.m21140getCCGoldBG20d7_KjU();
        long jM21141getCCGoldBG30d7_KjU = bentoColor.m21141getCCGoldBG30d7_KjU();
        long jM21138getCCGoldAccent0d7_KjU = bentoColor.m21138getCCGoldAccent0d7_KjU();
        long jM21146getCCSilverAccent0d7_KjU = bentoColor.m21146getCCSilverAccent0d7_KjU();
        long jM21150getCCSilverFG0d7_KjU = bentoColor.m21150getCCSilverFG0d7_KjU();
        long jM21151getCCSilverFG20d7_KjU = bentoColor.m21151getCCSilverFG20d7_KjU();
        long jM21152getCCSilverFG30d7_KjU = bentoColor.m21152getCCSilverFG30d7_KjU();
        long jM21147getCCSilverBG0d7_KjU = bentoColor.m21147getCCSilverBG0d7_KjU();
        long jM21148getCCSilverBG20d7_KjU = bentoColor.m21148getCCSilverBG20d7_KjU();
        long jM21149getCCSilverBG30d7_KjU = bentoColor.m21149getCCSilverBG30d7_KjU();
        long jM21301getNightElevatedFg0d7_KjU = bentoColor.m21301getNightElevatedFg0d7_KjU();
        long jM21302getNightElevatedFg20d7_KjU = bentoColor.m21302getNightElevatedFg20d7_KjU();
        long jM21303getNightElevatedFg30d7_KjU = bentoColor.m21303getNightElevatedFg30d7_KjU();
        long jM21300getNightElevatedBg30d7_KjU = bentoColor.m21300getNightElevatedBg30d7_KjU();
        long jM21299getNightElevatedBg20d7_KjU = bentoColor.m21299getNightElevatedBg20d7_KjU();
        long jM21298getNightElevatedBg0d7_KjU = bentoColor.m21298getNightElevatedBg0d7_KjU();
        long jM21346getNightUv0d7_KjU2 = bentoColor.m21346getNightUv0d7_KjU();
        long jM21349getNightWidgetBG0d7_KjU = bentoColor.m21349getNightWidgetBG0d7_KjU();
        long jM21350getNightWidgetBG20d7_KjU = bentoColor.m21350getNightWidgetBG20d7_KjU();
        long jM21326getNightMenuBG0d7_KjU = bentoColor.m21326getNightMenuBG0d7_KjU();
        return new BentoColors(jM21335getNightPrime0d7_KjU, jM21335getNightPrime0d7_KjU2, jM21320getNightJoule0d7_KjU, jM21305getNightFg0d7_KjU, jM21306getNightFg20d7_KjU, jM21307getNightFg30d7_KjU, jM21261getNightBg30d7_KjU, jM21260getNightBg20d7_KjU, jM21259getNightBg0d7_KjU, jM21319getNightJet0d7_KjU, jM21334getNightNova0d7_KjU, jM21322getNightJouleLight0d7_KjU, jM21320getNightJoule0d7_KjU2, jM21321getNightJouleDark0d7_KjU, jM21344getNightSolLight0d7_KjU, jM21342getNightSol0d7_KjU, jM21343getNightSolDark0d7_KjU, jM21325getNightLumenLight0d7_KjU, jM21323getNightLumen0d7_KjU, jM21324getNightLumenDark0d7_KjU, jM21354getNightXrayLight0d7_KjU, jM21352getNightXray0d7_KjU, jM21353getNightXrayDark0d7_KjU, jM21337getNightPrimeLight0d7_KjU, jM21335getNightPrime0d7_KjU3, jM21336getNightPrimeDark0d7_KjU, jM21264getNightBiomeLight0d7_KjU, jM21262getNightBiome0d7_KjU, jM21263getNightBiomeDark0d7_KjU, jM21294getNightDotLight0d7_KjU, jM21292getNightDot0d7_KjU, jM21293getNightDotDark0d7_KjU, jM21313getNightHydroLight0d7_KjU, jM21311getNightHydro0d7_KjU, jM21312getNightHydroDark0d7_KjU, jM21291getNightCosmonautLight0d7_KjU, jM21289getNightCosmonaut0d7_KjU, jM21290getNightCosmonautDark0d7_KjU, jM21348getNightUvLight0d7_KjU, jM21346getNightUv0d7_KjU, jM21347getNightUvDark0d7_KjU, jM21317getNightIrisLight0d7_KjU, jM21315getNightIris0d7_KjU, jM21316getNightIrisDark0d7_KjU, jM21329getNightMilleniumLight0d7_KjU, jM21327getNightMillenium0d7_KjU, jM21328getNightMilleniumDark0d7_KjU, jM21340getNightResinLight0d7_KjU, jM21338getNightResin0d7_KjU, jM21339getNightResinDark0d7_KjU, jM21297getNightDroidLight0d7_KjU, jM21295getNightDroid0d7_KjU, jM21296getNightDroidDark0d7_KjU, jM21288getNightCloneLight0d7_KjU, jM21286getNightClone0d7_KjU, jM21287getNightCloneDark0d7_KjU, jM21330getNightMineral0d7_KjU, jM21258getNightAndros0d7_KjU, jM21314getNightIon0d7_KjU, jM21318getNightJade0d7_KjU, jM21345getNightStratos0d7_KjU, jM21304getNightExos0d7_KjU, jM21341getNightRuby0d7_KjU, jM21309getNightGaia0d7_KjU, jM21333getNightNeon0d7_KjU, jM21265getNightBloom0d7_KjU, jM21308getNightFlare0d7_KjU, jM21331getNightMoon0d7_KjU, jM21332getNightMorph0d7_KjU, jM21135getAstro0d7_KjU, jM21257getNeptune0d7_KjU, jM21355getSynth0d7_KjU, jM21266getNightC10d7_KjU, jM21277getNightC20d7_KjU, jM21279getNightC30d7_KjU, jM21280getNightC40d7_KjU, jM21281getNightC50d7_KjU, jM21282getNightC60d7_KjU, jM21283getNightC70d7_KjU, jM21284getNightC80d7_KjU, jM21285getNightC90d7_KjU, jM21267getNightC100d7_KjU, jM21268getNightC110d7_KjU, jM21269getNightC120d7_KjU, jM21270getNightC130d7_KjU, jM21271getNightC140d7_KjU, jM21272getNightC150d7_KjU, jM21273getNightC160d7_KjU, jM21274getNightC170d7_KjU, jM21275getNightC180d7_KjU, jM21276getNightC190d7_KjU, jM21278getNightC200d7_KjU, jM21143getCCGoldFG0d7_KjU, jM21144getCCGoldFG20d7_KjU, jM21145getCCGoldFG30d7_KjU, jM21139getCCGoldBG0d7_KjU, jM21140getCCGoldBG20d7_KjU, jM21141getCCGoldBG30d7_KjU, jM21138getCCGoldAccent0d7_KjU, jM21146getCCSilverAccent0d7_KjU, jM21150getCCSilverFG0d7_KjU, jM21151getCCSilverFG20d7_KjU, jM21152getCCSilverFG30d7_KjU, jM21147getCCSilverBG0d7_KjU, jM21148getCCSilverBG20d7_KjU, jM21149getCCSilverBG30d7_KjU, false, Color.m6701boximpl(jM21301getNightElevatedFg0d7_KjU), Color.m6701boximpl(jM21302getNightElevatedFg20d7_KjU), Color.m6701boximpl(jM21303getNightElevatedFg30d7_KjU), Color.m6701boximpl(jM21300getNightElevatedBg30d7_KjU), Color.m6701boximpl(jM21299getNightElevatedBg20d7_KjU), Color.m6701boximpl(jM21298getNightElevatedBg0d7_KjU), jM21346getNightUv0d7_KjU2, jM21349getNightWidgetBG0d7_KjU, jM21350getNightWidgetBG20d7_KjU, bentoColor.m21351getNightWidgetSurfaceBG0d7_KjU(), jM21326getNightMenuBG0d7_KjU, null);
    }

    public static final BentoColors cryptoColors() {
        BentoColors bentoColorsNightColors = nightColors();
        BentoColor bentoColor = BentoColor.INSTANCE;
        return BentoColors.m21357copy0oIltwM$default(bentoColorsNightColors, bentoColor.m21334getNightNova0d7_KjU(), bentoColor.m21352getNightXray0d7_KjU(), bentoColor.m21346getNightUv0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, false, null, null, null, null, null, null, bentoColor.m21315getNightIris0d7_KjU(), 0L, 0L, -8, -1, -1, 917503, null);
    }

    public static final BentoColors creditCardGoldColors() {
        BentoColors bentoColorsNightColors = nightColors();
        BentoColor bentoColor = BentoColor.INSTANCE;
        long jM21138getCCGoldAccent0d7_KjU = bentoColor.m21138getCCGoldAccent0d7_KjU();
        long jM21143getCCGoldFG0d7_KjU = bentoColor.m21143getCCGoldFG0d7_KjU();
        long jM21144getCCGoldFG20d7_KjU = bentoColor.m21144getCCGoldFG20d7_KjU();
        long jM21145getCCGoldFG30d7_KjU = bentoColor.m21145getCCGoldFG30d7_KjU();
        long jM21139getCCGoldBG0d7_KjU = bentoColor.m21139getCCGoldBG0d7_KjU();
        return BentoColors.m21357copy0oIltwM$default(bentoColorsNightColors, jM21138getCCGoldAccent0d7_KjU, 0L, 0L, jM21143getCCGoldFG0d7_KjU, jM21144getCCGoldFG20d7_KjU, jM21145getCCGoldFG30d7_KjU, bentoColor.m21141getCCGoldBG30d7_KjU(), bentoColor.m21140getCCGoldBG20d7_KjU(), jM21139getCCGoldBG0d7_KjU, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, false, null, null, null, null, null, null, 0L, 0L, 0L, -506, -1, -1, 1048575, null);
    }

    public static final BentoColors creditCardDayColors() {
        BentoColors bentoColorsDayColors = dayColors();
        BentoColor bentoColor = BentoColor.INSTANCE;
        long jM21138getCCGoldAccent0d7_KjU = bentoColor.m21138getCCGoldAccent0d7_KjU();
        long jM21139getCCGoldBG0d7_KjU = bentoColor.m21139getCCGoldBG0d7_KjU();
        long jM21140getCCGoldBG20d7_KjU = bentoColor.m21140getCCGoldBG20d7_KjU();
        long jM21141getCCGoldBG30d7_KjU = bentoColor.m21141getCCGoldBG30d7_KjU();
        long jM21143getCCGoldFG0d7_KjU = bentoColor.m21143getCCGoldFG0d7_KjU();
        return BentoColors.m21357copy0oIltwM$default(bentoColorsDayColors, jM21138getCCGoldAccent0d7_KjU, 0L, 0L, jM21139getCCGoldBG0d7_KjU, jM21140getCCGoldBG20d7_KjU, jM21141getCCGoldBG30d7_KjU, bentoColor.m21145getCCGoldFG30d7_KjU(), bentoColor.m21144getCCGoldFG20d7_KjU(), jM21143getCCGoldFG0d7_KjU, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, false, null, null, null, null, null, null, 0L, 0L, 0L, -506, -1, -1, 1048575, null);
    }

    public static final BentoColors creditCardSilverColors() {
        BentoColors bentoColorsNightColors = nightColors();
        BentoColor bentoColor = BentoColor.INSTANCE;
        long jM21146getCCSilverAccent0d7_KjU = bentoColor.m21146getCCSilverAccent0d7_KjU();
        long jM21150getCCSilverFG0d7_KjU = bentoColor.m21150getCCSilverFG0d7_KjU();
        long jM21151getCCSilverFG20d7_KjU = bentoColor.m21151getCCSilverFG20d7_KjU();
        long jM21152getCCSilverFG30d7_KjU = bentoColor.m21152getCCSilverFG30d7_KjU();
        long jM21147getCCSilverBG0d7_KjU = bentoColor.m21147getCCSilverBG0d7_KjU();
        return BentoColors.m21357copy0oIltwM$default(bentoColorsNightColors, jM21146getCCSilverAccent0d7_KjU, 0L, 0L, jM21150getCCSilverFG0d7_KjU, jM21151getCCSilverFG20d7_KjU, jM21152getCCSilverFG30d7_KjU, bentoColor.m21149getCCSilverBG30d7_KjU(), bentoColor.m21148getCCSilverBG20d7_KjU(), jM21147getCCSilverBG0d7_KjU, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, false, null, null, null, null, null, null, 0L, 0L, 0L, -506, -1, -1, 1048575, null);
    }

    public static final CompositionLocal6<BentoColors> getLocalBentoColors() {
        return LocalBentoColors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BentoColors LocalBentoColors$lambda$0() {
        throw new IllegalStateException("No BentoColors provided. Wrap composable in BentoTheme.");
    }
}
