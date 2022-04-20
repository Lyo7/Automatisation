// siteSurenelectro.js created with Cypress
//
// Start writing your Cypress tests below!
// If you're unfamiliar with how Cypress works,
// check out the link below and learn how to write your first test:
// https://on.cypress.io/writing-first-test

describe('searche bar', function(){
	
	it('site fonctionne', function(){
		cy.visit('https://surenelectro.be/');
		cy.get('.u-container-layout > .u-border-none').click();
		cy.get('.u-clearfix > .u-image > .u-logo-image').click();
		cy.get('.u-clearfix > .u-container-style > .u-container-layout > .u-text-palette-1-base').contains('Over ons');
		cy.get('#diensten > .u-text-default-lg').contains('Onze diensten');
		cy.get('[style="font-weight: 400;"] > .u-active-none > span').click();
		cy.get('.u-gutter-0 > .u-layout-row > .u-shape-rectangle > .u-container-layout > .u-active-none').click();
		cy.get('.u-clearfix > .u-image > .u-logo-image').click();
		cy.get('.u-image-2 > .u-container-layout > .u-align-center > [style="font-weight: 400;"] > span > .u-active-none').click();
		cy.get('.u-gutter-0 > .u-layout-row > .u-white > .u-container-layout > .u-active-none').click();
		cy.get('.u-clearfix > .u-image > .u-logo-image').click();
		cy.get('.u-active-none > [style="font-weight: 400;"] > .u-text-palette-1-base').click();
		cy.get('#zonnepanelen > .u-sheet > .u-clearfix > .u-layout > .u-layout-row > .u-left-cell > .u-container-layout > .u-active-none').click();
		cy.get('.u-clearfix > .u-image > .u-logo-image').click();
		cy.get('.u-image-4 > .u-container-layout > .u-align-center > [style="font-weight: 400;"] > span > .u-active-none').click();
		cy.get('#bekabeling > .u-sheet > .u-clearfix > .u-layout > .u-layout-row > .u-left-cell > .u-container-layout > .u-active-none').click();
		cy.get('.u-clearfix > .u-image > .u-logo-image').click();
		cy.get('[style="font-weight: 700;"] > span > .u-active-none').click();
		cy.get('#industriele-elektriciteit > .u-sheet > .u-clearfix > .u-layout > .u-layout-row > .u-align-center > .u-container-layout > .u-border-2').click();
		cy.get('.u-clearfix > .u-image > .u-logo-image').click();
		cy.get('.u-image-6 > .u-container-layout > .u-align-center > [style="font-weight: 400;"] > span > .u-active-none').click();
		cy.get('.u-align-center > .u-container-layout > .u-active-none').click();
		cy.get('.u-clearfix > .u-image > .u-logo-image').click();
		cy.get('#carousel_04bb > .u-clearfix > .u-align-center').contains('Onze kenmerken');
		cy.get('#sec-b2e5 > .u-clearfix > .u-text').contains('Recente projecten');
		cy.get('#name-3b9a').type('nom Test');
		cy.get('#email-3b9a').type('email@test');
		cy.get('#phone-3fb9').type('0486565658');
		cy.get('#message-3b9a').type('description du formulaire Test');
		cy.get('.u-text-6 > .u-active-none').click();
		cy.get('.u-text-8 > .u-active-none').click();




	});
	
});